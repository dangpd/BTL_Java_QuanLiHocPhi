package viewsv;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.GiaoDich;
import model.SinhVien;
import model.TaiKhoan;
import model.TaiKhoanTien;

public class NapTienVaoTaiKhoan extends java.awt.Dialog {

    private SinhVien sinhVien;
    private ArrayList<SinhVien> dsSinhVien;
    private ArrayList<TaiKhoan> dsTaiKhoan;
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<TaiKhoanTien> dsTaiKhoanTien;
    private Controller con;

    private SinhVienMain sinhVienMain;

    public NapTienVaoTaiKhoan(java.awt.Frame parent, boolean modal, SinhVien sinhVien, SinhVienMain svMain) {
        super(parent, modal);
        this.sinhVienMain = svMain;
        this.sinhVien = sinhVien;
        con = new Controller();
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsTaiKhoan = con.docFile("src/TextJava/taikhoan.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        dsTaiKhoanTien = con.docFile("src/TextJava/taikhoantien.txt");
        initComponents();
        loadSoDu();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txtSoTienCanNap = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        btnNapTien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSoDu = new javax.swing.JLabel();
        cbViTaiKhoanTien = new javax.swing.JCheckBox();
        cbViDienTu = new javax.swing.JCheckBox();
        txtTaiKhoanNganHang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(320, 160));
        setTitle("Nạp tiền vào tài khoản");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel2.setText("Số tiền muốn nạp");

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnNapTien.setBackground(new java.awt.Color(255, 255, 255));
        btnNapTien.setText("Nạp tiền");
        btnNapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapTienActionPerformed(evt);
            }
        });

        jLabel3.setText("Số dư :");

        cbViTaiKhoanTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViTaiKhoanTienActionPerformed(evt);
            }
        });

        cbViDienTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViDienTuActionPerformed(evt);
            }
        });

        txtTaiKhoanNganHang.setText("Tài khoản ngân hàng");

        jLabel4.setText("Ví điện tử");

        jLabel1.setText("Chọn ví thanh toán");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnNapTien)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoTienCanNap, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbViDienTu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbViTaiKhoanTien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTaiKhoanNganHang, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoDu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoTienCanNap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbViTaiKhoanTien)
                    .addComponent(txtTaiKhoanNganHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbViDienTu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNapTien)
                    .addComponent(btnHuy))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadSoDu() {
        txtSoDu.setText(String.format("%.2f", sinhVien.getSoTienTK()));
    }

    public String getTxtSoTienCanNap() {
        return txtSoTienCanNap.getText();
    }

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnNapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapTienActionPerformed
        // TODO add your handling code here:
        Frame frame = new Frame();
        try {
            if (txtSoTienCanNap.getText().equals("")) {
                throw new Exception("Không được để trống số tiền muốn nạp !");
            }
            if (cbViTaiKhoanTien.isSelected() == false && cbViDienTu.isSelected() == false) {
                throw new Exception("Vui lòng chọn phương thức thanh toán !");
            }
            double soDu = sinhVien.getSoTienTK();
            double soTienNap = Double.parseDouble(txtSoTienCanNap.getText());
            double soTienTk = sinhVien.getTaiKhoanTien().getSoDu();
            if (cbViTaiKhoanTien.isSelected()) {
                if (soTienNap > soTienTk) {
                    throw new Exception("Số dư tài khoản không đủ !");
                } else {
                    TaiKhoan tk = dsTaiKhoan.get(dsTaiKhoan.indexOf(new TaiKhoan(sinhVien.getMaSinhVien(), "", "")));
                    int output = JOptionPane.showConfirmDialog(frame, "Xác nhận nạp tiền", "Lựa chọn", JOptionPane.YES_NO_OPTION);
                    if (output == JOptionPane.YES_OPTION) {
                        sinhVien.getTaiKhoanTien().setSoDu(sinhVien.getTaiKhoanTien().getSoDu() - soTienNap);
                        sinhVien.setSoTienTK(soDu + soTienNap);
                        loadSoDu();
                        dsSinhVien.set(dsSinhVien.indexOf(sinhVien), sinhVien);
                        GiaoDich giaoDich = new GiaoDich(sinhVien, "Nạp tiền vào tài khoản", sinhVien.getTaiKhoanTien(), new Date(), "+ " + String.valueOf(soTienNap));
                        dsGiaoDich.add(giaoDich);
                        con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                        con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                        con.ghiFile(dsTaiKhoanTien, "src/TextJava/taikhoantien.txt");
                        sinhVienMain.loadData();
                        throw new Exception("Nạp thành công");
                    }
                }
            } else {
                FormViDienTu vdt = new FormViDienTu(txtSoTienCanNap.getText(), sinhVien, sinhVienMain, this);
                this.setVisible(false);
                vdt.setVisible(true);
                vdt.setLocationRelativeTo(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnNapTienActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNapTien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbViDienTu;
    private javax.swing.JCheckBox cbViTaiKhoanTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtSoDu;
    private javax.swing.JTextField txtSoTienCanNap;
    private javax.swing.JLabel txtTaiKhoanNganHang;
    // End of variables declaration//GEN-END:variables
}
