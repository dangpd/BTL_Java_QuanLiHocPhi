package viewsv;

import controller.Controller;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.GiaoDich;
import model.SinhVien;
import model.TaiKhoan;
import model.ViDienTu;

public class RutTienViDienTu extends javax.swing.JFrame {

    private SinhVien sinhVien;
    private RutTien rutTienVeVi;
    private ArrayList<SinhVien> dsSinhVien;
    private ArrayList<TaiKhoan> dsTaiKhoan;
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<ViDienTu> dsViDienTu;
    private Controller con;
    private final SinhVienMain sinhVienMain;

    public RutTienViDienTu(String soTienCanRut, SinhVien sinhVien, SinhVienMain svMain, RutTien rutTien) {
        con = new Controller();
        this.sinhVienMain = svMain;
        this.sinhVien = sinhVien;
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsTaiKhoan = con.docFile("src/TextJava/taikhoan.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        dsViDienTu = con.docFile("src/TextJava/vidientu.txt");
        rutTienVeVi = rutTien;
        initComponents();
        txtSoTienMuonRut.setText(String.format("%.2f", Float.parseFloat(soTienCanRut)));
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHuy = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        btnRutTien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSoTienMuonRut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rút về ví điện tử");

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel1.setText("Số điện thoại :");

        jLabel2.setText("Mật khẩu sinh viên :");

        btnRutTien.setText("Rút tiền");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        jLabel3.setText("Số tiền muốn rút :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 92, Short.MAX_VALUE)
                        .addComponent(btnRutTien)
                        .addGap(42, 42, 42)
                        .addComponent(btnHuy)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTienMuonRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(txtSoDienThoai))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(txtSoTienMuonRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btnRutTien))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        // TODO add your handling code here:
        try {
            if (txtSoDienThoai.getText().equals("") || txtMatKhau.getText().equals("")) {
                throw new Exception("Không được để trống số điện thoại");
            }
            ViDienTu vi = null;
            for (int i = 0; i < dsViDienTu.size(); i++) {
                ViDienTu get = dsViDienTu.get(i);
                if(get.getSoDienThoai().equals(txtSoDienThoai.getText())){
                    vi = get;
                    break;
                }
            }
            
            if (vi == null ||  !dsTaiKhoan.get(dsTaiKhoan.indexOf(new TaiKhoan(sinhVien.getMaSinhVien()))).getMatKhau().equals(txtMatKhau.getText())) {
                throw new Exception("Sai tài khoản hoặc mật khẩu");
            }
            double soDu = sinhVien.getSoTienTK();
            double soTienRut = Double.parseDouble(txtSoTienMuonRut.getText());
            double soTienVDT = dsViDienTu.get(dsViDienTu.indexOf(vi)).getSoDu();
            if (soTienRut > soTienVDT) {
                throw new Exception("Số dư tài khoản không đủ !");
            } else {
                ViDienTu tkviDienTu = dsViDienTu.get(dsViDienTu.indexOf(vi));
                int output = JOptionPane.showConfirmDialog(this, "Xác nhận rút tiền", "Lựa chọn", JOptionPane.YES_NO_OPTION);
                if (output == JOptionPane.YES_OPTION) {
                    tkviDienTu.setSoDu(tkviDienTu.getSoDu() + soTienRut);
                    dsViDienTu.set(dsViDienTu.indexOf(vi), tkviDienTu);
                    sinhVien.setSoTienTK(soDu - soTienRut);
                    rutTienVeVi.loadSoDu();
                    dsSinhVien.set(dsSinhVien.indexOf(sinhVien), sinhVien);
                    GiaoDich giaoDich = new GiaoDich(sinhVien, "Rút tiền về ví", sinhVien.getTaiKhoanTien(), new Date(), "- " + String.valueOf(soTienRut));
                    dsGiaoDich.add(giaoDich);
                    con.ghiFile(dsViDienTu, "src/TextJava/vidientu.txt");
                    con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                    con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                    sinhVienMain.loadData();
                    throw new Exception("Rút thành công");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if(e.getMessage().equals("Rút thành công"))
                this.setVisible(false);
        }
    }//GEN-LAST:event_btnRutTienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JLabel txtSoTienMuonRut;
    // End of variables declaration//GEN-END:variables
}
