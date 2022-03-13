package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import model.CongNo;
import model.GiaoDich;
import model.Khoa;
import model.SinhVien;
import model.ThuChiDauNam;

public class SuaThuChiDauNam extends java.awt.Dialog {

    private String khoanThuCanSua;
    private QLThuChiDauNam quanLyThuChiDauNam = new QLThuChiDauNam();
    private ArrayList<Khoa> dsKhoa;
    private ArrayList<ThuChiDauNam> dsThuChiDauNam;
    private ArrayList<CongNo> dsCongNo;
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<SinhVien> dsSinhVien;
    private Controller con;
    private Khoa khoaDuocChon;
    private String tenKhoaBanDau;

    public SuaThuChiDauNam(java.awt.Frame parent, boolean modal, String khoanThuCanSua, String tenKhoaCu, String tenKhoanThuCu, String giaCu) {
        super(parent, modal);
        this.khoanThuCanSua = khoanThuCanSua;
        this.tenKhoaBanDau = tenKhoaCu;
        con = new Controller();
        khoaDuocChon = null;
        quanLyThuChiDauNam = (QLThuChiDauNam) parent;
        dsKhoa = con.docFile("src/TextJava/khoa.txt");
        dsThuChiDauNam = con.docFile("src/TextJava/thuchidaunam.txt");
        dsCongNo = con.docFile("src/TextJava/congno.txt");
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
       
        initComponents();
        showComBox();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTenKhoanThu = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboKhoa = new javax.swing.JComboBox<>();
        btnThoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(350, 230));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setText("Tên khoản thu");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 20));

        txtTenKhoanThu.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        add(txtTenKhoanThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, -1));

        txtGia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Giá");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setText("Khoa");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        cboKhoa.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cboKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaActionPerformed(evt);
            }
        });
        add(cboKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        btnThoa.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnThoa.setText("Thoát");
        btnThoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoaActionPerformed(evt);
            }
        });
        add(btnThoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        btnSua.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void cboKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaActionPerformed
        // TODO add your handling code here:

        String tenKhoa = cboKhoa.getItemAt(cboKhoa.getSelectedIndex());
        for (int i = 0; i < dsKhoa.size(); i++) {
            Khoa get = dsKhoa.get(i);
            if (get.getTenKhoa().equals(tenKhoa)) {
                khoaDuocChon = get;
                break;
            }
        }
    }//GEN-LAST:event_cboKhoaActionPerformed

    private void btnThoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnThoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        Frame frame = new Frame();

        try {
            if (txtTenKhoanThu.getText().equals("") || txtGia.getText().equals("") || khoaDuocChon == null) {
                throw new Exception("Vui lòng nhập đầy đủ thông tin");
            }
            int output = JOptionPane.showConfirmDialog(frame,
                    "Xác nhận sửa", "Lựa chọn", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                ThuChiDauNam thuChiDauNam = new ThuChiDauNam(khoanThuCanSua, "", 0);
                thuChiDauNam = dsThuChiDauNam.get(dsThuChiDauNam.indexOf(thuChiDauNam));
                double giaSua = Double.parseDouble(txtGia.getText());
                String tenKhoanThuSua = txtTenKhoanThu.getText();
                double giaCu = thuChiDauNam.getGia();
                thuChiDauNam.setGia(giaSua);
                thuChiDauNam.setTenKhoanThu("Thu chi đầu năm : " + tenKhoanThuSua);
                thuChiDauNam.setKhoa(khoaDuocChon);

                if (khoaDuocChon.getTenKhoa().equals(tenKhoaBanDau)) {
                    for (int i = 0; i < dsSinhVien.size(); i++) {
                        SinhVien get = dsSinhVien.get(i);
                        if (get.getLop().getKhoa().getMaKhoa().equals(khoaDuocChon.getMaKhoa())) {
                            CongNo congNo = new CongNo(get, thuChiDauNam, false);
                            CongNo checkNopTien = dsCongNo.get(dsCongNo.indexOf(congNo));
                            if (checkNopTien.isKiemTraThu()) {
                                get = new SinhVien(get.getMaSinhVien(), get.getHoTen(), get.getLop(), get.getSoTienTK() + giaCu, get.getDiaChi(), get.getTaiKhoanTien());
                                dsSinhVien.set(dsSinhVien.indexOf(get), get);
                                GiaoDich giaoDich = new GiaoDich(get, "Khoản thu bị sửa đổi", get.getTaiKhoanTien(), new Date(),"+ " + giaCu);
                                dsGiaoDich.add(giaoDich);
                                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                            }
                            dsThuChiDauNam.set(dsThuChiDauNam.indexOf(thuChiDauNam), thuChiDauNam);
                            dsCongNo.set(dsCongNo.indexOf(congNo), congNo);
                        }
                    }
                } else {
                    for (int i = 0; i < dsSinhVien.size(); i++) {
                        SinhVien get = dsSinhVien.get(i);
                        if (get.getLop().getKhoa().getMaKhoa().equals(khoaDuocChon.getMaKhoa())) {
                            CongNo congNo = new CongNo(get, thuChiDauNam, false);
                            dsCongNo.add(congNo);
                        }
                        if (get.getLop().getKhoa().getTenKhoa().equals(tenKhoaBanDau)) {
                            CongNo congNo = new CongNo(get, thuChiDauNam, false);
                            CongNo checkNopTien = dsCongNo.get(dsCongNo.indexOf(congNo));
                            if (checkNopTien.isKiemTraThu()) {
                                get = new SinhVien(get.getMaSinhVien(), get.getHoTen(), get.getLop(), get.getSoTienTK() + giaCu, get.getDiaChi(), get.getTaiKhoanTien());
                                dsSinhVien.set(dsSinhVien.indexOf(get), get);
                                GiaoDich giaoDich = new GiaoDich(get, "Khoản thu bị sửa đổi", get.getTaiKhoanTien(), new Date(),"+ " + giaCu);
                                dsGiaoDich.add(giaoDich);
                                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                            }
                            dsThuChiDauNam.set(dsThuChiDauNam.indexOf(thuChiDauNam), thuChiDauNam);
                            dsCongNo.remove(dsCongNo.indexOf(congNo));
                        }

                    }
                }

                con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                con.ghiFile(dsThuChiDauNam, "src/TextJava/thuchidaunam.txt");
                con.ghiFile(dsCongNo, "src/TextJava/congno.txt");
                quanLyThuChiDauNam.loadDataTable();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThoa;
    private javax.swing.JComboBox<String> cboKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTenKhoanThu;
    // End of variables declaration//GEN-END:variables

    private void showComBox() {
        for (int i = 0; i < dsKhoa.size(); i++) {
            Khoa get = dsKhoa.get(i);
            cboKhoa.addItem(get.getTenKhoa());
        }
    }
}
