package viewsv;

import controller.Controller;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.GiaoDich;
import model.SinhVien;
import model.TaiKhoan;
import model.ViDienTu;

public class FormViDienTu extends javax.swing.JFrame {

    private SinhVien sinhVien;
    private NapTienVaoTaiKhoan napTienVaoTaiKhoan;
    private ArrayList<SinhVien> dsSinhVien;
    private ArrayList<TaiKhoan> dsTaiKhoan;
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<ViDienTu> dsViDienTu;
    private Controller con;
    private final SinhVienMain sinhVienMain;
    

    public FormViDienTu(String soTienCanNap, SinhVien sinhVien, SinhVienMain svMain, NapTienVaoTaiKhoan ntvtk) {
        con = new Controller();
        this.sinhVienMain = svMain;
        this.sinhVien = sinhVien;
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsTaiKhoan = con.docFile("src/TextJava/taikhoan.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        dsViDienTu = con.docFile("src/TextJava/vidientu.txt");
        napTienVaoTaiKhoan = ntvtk;
        initComponents();
        txtSoTienMuonNap.setText(String.format("%.2f", Double.parseDouble(soTienCanNap)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSoTienMuonNap = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nạp từ ví điện tử");

        jLabel1.setText("Số điện thoại :");

        jLabel2.setText("Mật khẩu :");

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel3.setText("Số tiền muốn nạp :");

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnHuy)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTienMuonNap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnThanhToan)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addComponent(txtSoDienThoai))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoTienMuonNap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnThanhToan))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        try {
            if (txtSoDienThoai.getText().equals("") || txtMatKhau.getText().equals("")) {
                throw new Exception("Không được để trống số điện thoại hoặc tài khoản !");
            }
            ViDienTu vi = new ViDienTu(txtSoDienThoai.getText(), txtMatKhau.getText(), 0);
            if (!dsViDienTu.contains(vi)) {
                throw new Exception("Sai tài khoản hoặc mật khẩu");
            }
            double soDu = sinhVien.getSoTienTK();
            double soTienNap = Double.parseDouble(txtSoTienMuonNap.getText());
            double soTienVDT = dsViDienTu.get(dsViDienTu.indexOf(vi)).getSoDu();
            if (soTienNap > soTienVDT) {
                throw new Exception("Số dư tài khoản không đủ !");
            } else {
                ViDienTu tkviDienTu = dsViDienTu.get(dsViDienTu.indexOf(vi));
                int output = JOptionPane.showConfirmDialog(this, "Xác nhận nạp tiền", "Lựa chọn", JOptionPane.YES_NO_OPTION);
                if (output == JOptionPane.YES_OPTION) {
                    tkviDienTu.setSoDu(tkviDienTu.getSoDu() - soTienNap);
                    dsViDienTu.set(dsViDienTu.indexOf(vi), tkviDienTu);
                    sinhVien.setSoTienTK(soDu + soTienNap);
                    napTienVaoTaiKhoan.loadSoDu();
                    dsSinhVien.set(dsSinhVien.indexOf(sinhVien), sinhVien);
                    GiaoDich giaoDich = new GiaoDich(sinhVien, "Nạp tiền vào tài khoản", sinhVien.getTaiKhoanTien(), new Date(), "+ " + String.format("%.2f", soTienNap));
                    dsGiaoDich.add(giaoDich);
                    con.ghiFile(dsViDienTu, "src/TextJava/vidientu.txt");
                    con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                    con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                    sinhVienMain.loadData();
                    throw new Exception("Nạp thành công");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JLabel txtSoTienMuonNap;
    // End of variables declaration//GEN-END:variables
}
