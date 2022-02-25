package viewsv;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.CongNo;
import model.GiaoDich;
import model.SinhVien;
import model.TaiKhoan;
import model.Thu;
import model.ThuTheoDangKy;

public class RutTien extends java.awt.Dialog {

    private SinhVien sinhVien;
    private ArrayList<SinhVien> dsSinhVien;
    private ArrayList<TaiKhoan> dsTaiKhoan;
    private ArrayList<GiaoDich> dsGiaoDich;
    private Controller con;

    private SinhVienMain sinhVienMain;

    public RutTien(java.awt.Frame parent, boolean modal, SinhVien sinhVien) {
        super(parent, modal);
        this.sinhVien = sinhVien;
        this.con = new Controller();
        this.dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        this.dsTaiKhoan = con.docFile("src/TextJava/taikhoan.txt");
        this.dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        initComponents();
        loadSoDu();
        this.setLocationRelativeTo(null);
        sinhVienMain = (SinhVienMain) parent;
    }

    public void loadSoDu() {
        txtSoDu.setText(String.format("%.2f", sinhVien.getSoTienTK()));
    }

    public String getTxtSoTienCanNap() {
        return txtSoTienCanRut.getText();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSoDu = new javax.swing.JLabel();
        cbViTaiKhoanTien = new javax.swing.JCheckBox();
        cbViDienTu = new javax.swing.JCheckBox();
        txtTaiKhoanNganHang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoTienCanRut = new javax.swing.JTextField();
        btnHuy1 = new javax.swing.JButton();
        btnRutTien = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(290, 150));
        setPreferredSize(new java.awt.Dimension(350, 280));
        setResizable(false);
        setTitle("Rút tiền");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtSoDu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 120, 20));

        cbViTaiKhoanTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViTaiKhoanTienActionPerformed(evt);
            }
        });
        add(cbViTaiKhoanTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        cbViDienTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViDienTuActionPerformed(evt);
            }
        });
        add(cbViDienTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtTaiKhoanNganHang.setText("Tài khoản ngân hàng");
        txtTaiKhoanNganHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaiKhoanNganHangMouseClicked(evt);
            }
        });
        add(txtTaiKhoanNganHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 20));

        jLabel4.setText("Ví điện tử");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 20));

        jLabel3.setText("Chọn ví thanh toán");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setText("Số tiền muốn rút");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 74, -1, 20));
        add(txtSoTienCanRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 120, -1));

        btnHuy1.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy1.setText("Hủy");
        btnHuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuy1ActionPerformed(evt);
            }
        });
        add(btnHuy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        btnRutTien.setBackground(new java.awt.Color(255, 255, 255));
        btnRutTien.setText("Rút tiền");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });
        add(btnRutTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel6.setText("Số dư :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void cbViTaiKhoanTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViTaiKhoanTienActionPerformed
        // TODO add your handling code here:
        if (cbViTaiKhoanTien.isSelected()) {
            cbViDienTu.setSelected(false);
        }
    }//GEN-LAST:event_cbViTaiKhoanTienActionPerformed

    private void cbViDienTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViDienTuActionPerformed
        // TODO add your handling code here:
        if (cbViDienTu.isSelected()) {
            cbViTaiKhoanTien.setSelected(false);
        }
    }//GEN-LAST:event_cbViDienTuActionPerformed

    private void btnHuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuy1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuy1ActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        // TODO add your handling code here:
        Frame frame = new Frame();
        try {
            if (txtSoTienCanRut.getText().equals("")) {
                throw new Exception("Không được để trống số tiền muốn rút !");
            }
            if (cbViTaiKhoanTien.isSelected() == false && cbViDienTu.isSelected() == false) {
                throw new Exception("Vui lòng chọn phương thức rút tiền !");
            }
            double soDu = sinhVien.getSoTienTK();
            double soTienRut = Double.parseDouble(txtSoTienCanRut.getText());
            if (soTienRut > soDu) {
                throw new Exception("Số tiền cần rút không được vượt quá số dư của tài khoản");
            }
            if (cbViTaiKhoanTien.isSelected()) {
                TaiKhoan tk = dsTaiKhoan.get(dsTaiKhoan.indexOf(new TaiKhoan(sinhVien.getMaSinhVien(), "", "")));

                int output = JOptionPane.showConfirmDialog(frame,
                        "Xác nhận rút tiền", "Lựa chọn", JOptionPane.YES_NO_OPTION);
                if (output == JOptionPane.YES_OPTION) {
                    sinhVien.getTaiKhoanTien().setSoDu(sinhVien.getTaiKhoanTien().getSoDu() + soTienRut);
                    sinhVien.setSoTienTK(soDu - soTienRut);
                    dsSinhVien.set(dsSinhVien.indexOf(sinhVien), sinhVien);
                    GiaoDich giaoDich = new GiaoDich(sinhVien, "Rút tiền", sinhVien.getTaiKhoanTien(), new Date(), "- " + String.format("%.2f", soTienRut));
                    dsGiaoDich.add(giaoDich);
                    con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                    con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                    sinhVienMain.loadData();
                    JOptionPane.showMessageDialog(frame, "Rút thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                RutTienViDienTu vdt = new RutTienViDienTu(txtSoTienCanRut.getText(), sinhVien, sinhVienMain, this);
                this.setVisible(false);
                vdt.setVisible(true);
                vdt.setLocationRelativeTo(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        cbViDienTu.setSelected(true);
        cbViTaiKhoanTien.setSelected(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtTaiKhoanNganHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoanNganHangMouseClicked
        // TODO add your handling code here:
        cbViDienTu.setSelected(false);
        cbViTaiKhoanTien.setSelected(true);
    }//GEN-LAST:event_txtTaiKhoanNganHangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy1;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JCheckBox cbViDienTu;
    private javax.swing.JCheckBox cbViTaiKhoanTien;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtSoDu;
    private javax.swing.JTextField txtSoTienCanRut;
    private javax.swing.JLabel txtTaiKhoanNganHang;
    // End of variables declaration//GEN-END:variables
}
