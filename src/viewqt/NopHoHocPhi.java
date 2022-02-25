/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CongNo;
import model.GiaoDich;
import model.QuanTri;
import model.SinhVien;
import model.TableModel;
import model.TaiKhoanTien;

/**
 *
 * @author ngova
 */
public class NopHoHocPhi extends java.awt.Dialog {

    /**
     * Creates new form NopHocPhi
     */
    private QuanTriView quanTriView;
    private SinhVien sinhVien;
    private TableModel<CongNo> congNoModel;
    private ArrayList<CongNo> congNo = new ArrayList<>();
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<SinhVien> dsSinhVien;
    private Controller con;
    private String maKhoanThu = "";
    private int dong = -1;
    private ArrayList<TaiKhoanTien> dsTaiKhoanTien = new ArrayList<>();

    public NopHoHocPhi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.sinhVien = sinhVien;
        this.con = new Controller();
        congNo = con.docFile("src/TextJava/congno.txt");
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        dsTaiKhoanTien = con.docFile("src/TextJava/taikhoantien.txt");
        List<CongNo> temp = congNo.stream().filter(cn -> cn.isKiemTraThu() == false).toList();
        ArrayList<CongNo> congNoChuaThanhToan = new ArrayList<>();
        congNoChuaThanhToan.addAll(temp);
        initComponents();
        loadTable(congNoChuaThanhToan);
        quanTriView = (QuanTriView) parent;
        this.setLocationRelativeTo(null);
    }

    public void loadTable(ArrayList<CongNo> ds) {
        String[] tenCot = {"Mã sinh viên", "Mã khoản thu", "Tên khoản thu", "Giá"};

        this.congNoModel = new TableModel<CongNo>(ds, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return ds.get(rowIndex).getSinhVien().getMaSinhVien();
                    case 1:
                        return ds.get(rowIndex).getKhoanThu().getMaKhoanThu();
                    case 2:
                        return ds.get(rowIndex).getKhoanThu().getTenKhoanThu();
                    case 3:
                        return ds.get(rowIndex).getKhoanThu().getGia();
                    default:
                        return null;
                }
            }
        };

        tableCongNo.setModel(this.congNoModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCongNo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMasv = new javax.swing.JTextPane();
        btnTim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNopTatCa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnNop = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        tableCongNo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sinh viên ", "Mã khoản thu", "Tên khoản thu", "Số tiền "
            }
        ));
        jScrollPane1.setViewportView(tableCongNo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("NỘP HỘ HỌC PHÍ ");

        jScrollPane2.setViewportView(txtMasv);

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel2.setText("Tìm theo mã sinh viên");

        btnNopTatCa.setText("Nộp tất cả ");
        btnNopTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopTatCaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnNop.setText("Nộp");
        btnNop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnNop)
                        .addGap(74, 74, 74)
                        .addComponent(btnNopTatCa)
                        .addGap(69, 69, 69)
                        .addComponent(btnThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTim)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNopTatCa)
                    .addComponent(btnThoat)
                    .addComponent(btnNop))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        String msv = txtMasv.getText().trim().toUpperCase();
        ArrayList<CongNo> dsTK = new ArrayList<>();
        for (var it : congNo) {
            if (it.getSinhVien().getMaSinhVien().trim().contains(msv)) {
                dsTK.add(it);
            }
        }
        loadTable(dsTK);
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopActionPerformed
        // TODO add your handling code here:
        dong = tableCongNo.getSelectedRow();
        String mkt = (String) tableCongNo.getValueAt(dong, 1);
        String msv = (String) tableCongNo.getValueAt(dong, 0);
        try {
            if (mkt.equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn môn để nộp");
            } else {
                double gia = (double) tableCongNo.getValueAt(dong, 3);
                for (CongNo cn : congNo) {
                    if (cn.getSinhVien().getMaSinhVien().equals(msv) && cn.getKhoanThu().getMaKhoanThu().equals(mkt)) {
                        cn.setKiemTraThu(true);
                    }
                }

                GiaoDich giaoDich = new GiaoDich(dsSinhVien.get(dsSinhVien.indexOf(new SinhVien(msv, "", null, gia, msv, null))), "Nộp học phí", dsTaiKhoanTien.get(dsTaiKhoanTien.indexOf(new TaiKhoanTien("tknt", 0))), new Date(), "- " + String.valueOf(gia));
                dsGiaoDich.add(giaoDich);
                txtMasv.setText("");
                List<CongNo> temp = congNo.stream().filter(cn -> cn.isKiemTraThu() == false).toList();
                ArrayList<CongNo> congNoChuaThanhToan = new ArrayList<>();
                congNoChuaThanhToan.addAll(temp);
                loadTable(congNoChuaThanhToan);
                con.ghiFile(congNo, "src/TextJava/congno.txt");
                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
            }

        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNopActionPerformed

    private void btnNopTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopTatCaActionPerformed
        // TODO add your handling code here:

        try {
            double tong = 0;
            for (int i = 0; i < tableCongNo.getRowCount(); i++) {
                tong += (double) tableCongNo.getValueAt(i, 3);
            }
            for (int i = 0; i < tableCongNo.getRowCount(); i++) {
                String maKT = (String) tableCongNo.getValueAt(i, 1);
                String msv = (String) tableCongNo.getValueAt(i, 0);
                double gia = (double) tableCongNo.getValueAt(i, 3);
                for (CongNo cn : congNo) {
                    cn.setKiemTraThu(true);
                }
               
                con.ghiFile(congNo, "src/TextJava/congno.txt");
                GiaoDich giaoDich = new GiaoDich(dsSinhVien.get(dsSinhVien.indexOf(new SinhVien(msv, "", null, gia, msv, null))), "Nộp học phí", dsTaiKhoanTien.get(dsTaiKhoanTien.indexOf(new TaiKhoanTien("tknt", 0))), new Date(), "- " + String.valueOf(gia));
                dsGiaoDich.add(giaoDich);
                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                  txtMasv.setText("");
                List<CongNo> temp = congNo.stream().filter(cn -> cn.isKiemTraThu() == false).toList();
                ArrayList<CongNo> congNoChuaThanhToan = new ArrayList<>();
                congNoChuaThanhToan.addAll(temp);
                loadTable(congNoChuaThanhToan);
            }
            JOptionPane.showMessageDialog(this, "Thanh toán thành công");

        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnNopTatCaActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        // TODO add your handling code here:
         setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog


  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNop;
    private javax.swing.JButton btnNopTatCa;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCongNo;
    private javax.swing.JTextPane txtMasv;
    // End of variables declaration//GEN-END:variables
}
