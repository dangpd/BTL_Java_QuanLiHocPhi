package viewsv;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CongNo;
import model.GiaoDich;
import model.HocPhan;
import model.LopHocPhan;
import model.SinhVien;
import model.TableModel;
import model.Thu;
import model.ThuTheoDangKy;

public class RutHocPhan extends java.awt.Dialog {

    private SinhVienMain sinhVienMain;
    private SinhVien sinhVien;
    private TableModel<HocPhan> tableModelRutHocPhan;
    private ArrayList<HocPhan> dsHocPhan;
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<HocPhan> dsHocPhanDaDangKy;
    private ArrayList<LopHocPhan> dsLopHocPhan;
    private ArrayList<LopHocPhan> dsLopHocPhanDaDangKy;
    private ArrayList<ThuTheoDangKy> dsThuTheoDangKy;
    private ArrayList<CongNo> dsCongNo;
    private ArrayList<SinhVien> dsSinhVien;
    private Controller con;
    private String maHocPhanHuy = "";

    public RutHocPhan(java.awt.Frame parent, boolean modal, SinhVien sinhVien) {
        super(parent, modal);
        this.sinhVien = sinhVien;
        con = new Controller();
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        dsHocPhan = con.docFile("src/TextJava/hocphan.txt");
        dsLopHocPhan = con.docFile("src/TextJava/lophocphan.txt");
        dsThuTheoDangKy = con.docFile("src/TextJava/thutheodangky.txt");
        dsCongNo = con.docFile("src/TextJava/congno.txt");
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsLopHocPhanDaDangKy = new ArrayList<>();
        dsHocPhanDaDangKy = new ArrayList<>();
        for (int i = 0; i < dsLopHocPhan.size(); i++) {
            LopHocPhan get = dsLopHocPhan.get(i);
            if (get.getSinhVien().getMaSinhVien().equals(sinhVien.getMaSinhVien())) {
                dsLopHocPhanDaDangKy.add(get);
                dsHocPhanDaDangKy.add(get.getHocPhan());
            }
        }
        initComponents();
        loadDataTable();
        this.setLocationRelativeTo(null);
        sinhVienMain = (SinhVienMain) parent;
    }

    public void loadDataTable() {
        String[] tenCot = {"Mã học phần", "Tên học phần", "Tín chỉ", "Giá"};
        this.tableModelRutHocPhan = new TableModel<HocPhan>(dsHocPhanDaDangKy, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return dsHocPhanDaDangKy.get(rowIndex).getMaHocPhan();
                    case 1:
                        return dsHocPhanDaDangKy.get(rowIndex).getTenHocPhan();
                    case 2:
                        return dsHocPhanDaDangKy.get(rowIndex).getTinChi();
                    case 3:
                        return dsHocPhanDaDangKy.get(rowIndex).getGia();
                    default:
                        return null;
                }
            }
        };
        tableRutHocPhan.setModel(tableModelRutHocPhan);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRutHocPhan = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnRutPhan = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Rút học phần");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("Hủy môn học");

        tableRutHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRutHocPhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRutHocPhan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 150));

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        btnRutPhan.setText("Rút");
        btnRutPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutPhanActionPerformed(evt);
            }
        });
        add(btnRutPhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnRutPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutPhanActionPerformed
        // TODO add your handling code here:
        Frame frame = new JFrame();
        try {
            if (maHocPhanHuy.equals("")) {
                throw new Exception("Bạn chưa chọn học để rút");
            }
            HocPhan hp = dsHocPhan.get(dsHocPhan.indexOf(new HocPhan(maHocPhanHuy, "", 0, "")));
            LopHocPhan lhp = new LopHocPhan(sinhVien, hp);
            int output = JOptionPane.showConfirmDialog(frame,
                    "Xác nhận rút học phần", "Lựa chọn", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                dsLopHocPhan.remove(dsLopHocPhan.indexOf(lhp));
                Thu thu = new ThuTheoDangKy();
                thu = dsThuTheoDangKy.get(dsThuTheoDangKy.indexOf(new ThuTheoDangKy(0, lhp, sinhVien.getMaSinhVien())));
                CongNo check = dsCongNo.get(dsCongNo.indexOf(new CongNo(sinhVien, thu, false)));
                if (check.isKiemTraThu()) {
                    sinhVien.setSoTienTK(sinhVien.getSoTienTK() + check.getKhoanThu().getGia());
                    dsSinhVien.set(dsSinhVien.indexOf(sinhVien), sinhVien);
                    con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                    sinhVienMain.loadData();
                    GiaoDich giaoDich = new GiaoDich(sinhVien, "Rút học phần", sinhVien.getTaiKhoanTien(), new Date(), "+ " + String.valueOf(check.getKhoanThu().getGia()));
                    dsGiaoDich.add(giaoDich);
                }
                dsCongNo.remove(dsCongNo.indexOf(new CongNo(sinhVien, thu, false)));
                dsThuTheoDangKy.remove(dsThuTheoDangKy.indexOf(new ThuTheoDangKy(0, lhp, sinhVien.getMaSinhVien())));
                dsHocPhanDaDangKy.remove(dsHocPhanDaDangKy.indexOf(hp));

                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                con.ghiFile(dsLopHocPhan, "src/TextJava/lophocphan.txt");
                con.ghiFile(dsThuTheoDangKy, "src/TextJava/thutheodangky.txt");
                con.ghiFile(dsCongNo, "src/TextJava/congno.txt");
                sinhVienMain.loadData();
                loadDataTable();
                throw new Exception("Thành công");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRutPhanActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tableRutHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRutHocPhanMouseClicked
        // TODO add your handling code here:
        int row = tableRutHocPhan.getSelectedRow();
        maHocPhanHuy = (String) tableRutHocPhan.getValueAt(row, 0);
        System.out.println(maHocPhanHuy);
    }//GEN-LAST:event_tableRutHocPhanMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRutPhan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRutHocPhan;
    // End of variables declaration//GEN-END:variables
}
