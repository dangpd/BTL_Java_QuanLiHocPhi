package viewsv;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CongNo;
import model.GiaoDich;
import model.SinhVien;
import model.TableModel;

public class NopHocPhi extends java.awt.Dialog {

    private SinhVienMain sinhVienMain;
    private SinhVien sinhVien;
    private TableModel<CongNo> congNoThuModel;
    private ArrayList<CongNo> congNos;
    private ArrayList<GiaoDich> giaoDichs;
    private ArrayList<SinhVien> dsSinhViens;
    private Controller con;
    private String maKhoanThu = "";

    public NopHocPhi(java.awt.Frame parent, boolean modal, SinhVien sinhVien) {
        super(parent, modal);
        this.sinhVienMain = (SinhVienMain) parent;
        this.sinhVien = sinhVien;
        this.con = new Controller();
        congNos = con.docFile("src/TextJava/congno.txt");
        dsSinhViens = con.docFile("src/TextJava/sinhvien.txt");
        giaoDichs = con.docFile("src/TextJava/giaodich.txt");
        initComponents();
        loadTable();
        this.setLocationRelativeTo(null);
    }

    public void loadTable() {
        String[] tenCot = {"Mã khoản thu", "Tên khoản thu", "Giá"};
        List<CongNo> temp = congNos.stream().filter(cn -> cn.isKiemTraThu() == false && cn.getSinhVien().getMaSinhVien().equals(sinhVien.getMaSinhVien())).toList();
        ArrayList<CongNo> congNoChuaThanhToan = new ArrayList<>();
        congNoChuaThanhToan.addAll(temp);
        this.congNoThuModel = new TableModel<CongNo>(congNoChuaThanhToan, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return congNoChuaThanhToan.get(rowIndex).getKhoanThu().getMaKhoanThu();
                    case 1:
                        return congNoChuaThanhToan.get(rowIndex).getKhoanThu().getTenKhoanThu();
                    case 2:
                        return congNoChuaThanhToan.get(rowIndex).getKhoanThu().getGia();
                    default:
                        return null;
                }
            }
        };
        lblSoDuTK.setText(String.format("%.2f", sinhVien.getSoTienTK()));
        tableCongNoThu.setModel(this.congNoThuModel);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnNop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCongNoThu = new javax.swing.JTable();
        lblSoDuTK = new javax.swing.JLabel();
        btnNopTatCa1 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(520, 350));
        setPreferredSize(new java.awt.Dimension(600, 313));
        setResizable(false);
        setTitle("Nộp học phí");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Danh sách các khoản học phí");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setText("Số dư tài khoản: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, -1));

        btnNop.setBackground(new java.awt.Color(255, 255, 255));
        btnNop.setText("Nộp");
        btnNop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopActionPerformed(evt);
            }
        });
        add(btnNop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 130, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(490, 402));

        tableCongNoThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCongNoThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCongNoThuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCongNoThu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 550, 150));

        lblSoDuTK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add(lblSoDuTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 140, 20));

        btnNopTatCa1.setBackground(new java.awt.Color(255, 255, 255));
        btnNopTatCa1.setText("Nộp tất cả");
        btnNopTatCa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopTatCa1ActionPerformed(evt);
            }
        });
        add(btnNopTatCa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnNopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopActionPerformed
        // TODO add your handling code here: 
        try {
            if (maKhoanThu.equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn môn để nộp");
            } else {
                int row = tableCongNoThu.getSelectedRow();
                double gia = (double) tableCongNoThu.getValueAt(row, 2);
                double tien = sinhVien.getSoTienTK();
                if (gia > tien) {
                    JOptionPane.showMessageDialog(this, "Số tiền trong tài khoản không đủ, vui lòng nạp thêm tiền!");
                } else {
                    sinhVien.setSoTienTK(tien - gia);
                    lblSoDuTK.setText(String.valueOf(sinhVien.getSoTienTK()));
                    String maKT = (String) tableCongNoThu.getValueAt(tableCongNoThu.getSelectedRow(), 0);
                    for (CongNo cn : congNos) {
                        if (cn.getSinhVien().getMaSinhVien().equals(sinhVien.getMaSinhVien()) && cn.getKhoanThu().getMaKhoanThu().equals(maKT)) {
                            cn.setKiemTraThu(true);
                            GiaoDich giaoDich = new GiaoDich(sinhVien, cn.getKhoanThu().getTenKhoanThu(), sinhVien.getTaiKhoanTien(), new Date(), "- " + String.format("%.2f", gia));
                            giaoDichs.add(giaoDich);
                        }
                    }
                    loadTable();
                    con.ghiFile(congNos, "src/TextJava/congno.txt");
                    con.ghiFile(giaoDichs, "src/TextJava/giaodich.txt");
                    dsSinhViens.set(dsSinhViens.indexOf(sinhVien), sinhVien);
                    con.ghiFile(dsSinhViens, "src/TextJava/sinhvien.txt");
                    sinhVienMain.loadData();
                    JOptionPane.showMessageDialog(this, "Thanh toán thành công");
                }
            }
        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNopActionPerformed

    private void tableCongNoThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCongNoThuMouseClicked
        // TODO add your handling code here:
        int row = tableCongNoThu.getSelectedRow();
        maKhoanThu = (String) tableCongNoThu.getValueAt(row, 0);
        System.out.println(maKhoanThu);
    }//GEN-LAST:event_tableCongNoThuMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNopTatCa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopTatCa1ActionPerformed
        // TODO add your handling code here:
        try {
            double tong = 0;
            for (int i = 0; i < tableCongNoThu.getRowCount(); i++) {
                tong += (double) tableCongNoThu.getValueAt(i, 2);
            }

            double tien = sinhVien.getSoTienTK();
            if (tong == 0) {
                JOptionPane.showMessageDialog(this, "Không có khoản thu nào !");
            } else if (tong > tien) {
                JOptionPane.showMessageDialog(this, "Só tiền trong tài khoản không đủ, vui lòng nạp thêm tièn");
            } else {
                sinhVien.setSoTienTK(tien - tong);
                lblSoDuTK.setText(String.valueOf(sinhVien.getSoTienTK()));
                for (int i = 0; i < tableCongNoThu.getRowCount(); i++) {
                    double gia = (double) tableCongNoThu.getValueAt(i, 2);
                    String maKT = (String) tableCongNoThu.getValueAt(i, 0);
                    for (CongNo cn : congNos) {
                        if (cn.getSinhVien().getMaSinhVien().equals(sinhVien.getMaSinhVien()) && cn.getKhoanThu().getMaKhoanThu().equals(maKT)) {
                            cn.setKiemTraThu(true);
                            GiaoDich giaoDich = new GiaoDich(sinhVien, cn.getKhoanThu().getTenKhoanThu(), sinhVien.getTaiKhoanTien(), new Date(), "- " + String.format("%.2f", gia));
                            giaoDichs.add(giaoDich);
                        }
                    }
                }
                loadTable();
                con.ghiFile(congNos, "src/TextJava/congno.txt");
                con.ghiFile(giaoDichs, "src/TextJava/giaodich.txt");
                dsSinhViens.set(dsSinhViens.indexOf(sinhVien), sinhVien);
                con.ghiFile(dsSinhViens, "src/TextJava/sinhvien.txt");
                sinhVienMain.loadData();
                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
            }
        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNopTatCa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNop;
    private javax.swing.JButton btnNopTatCa1;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSoDuTK;
    private javax.swing.JTable tableCongNoThu;
    // End of variables declaration//GEN-END:variables
}
