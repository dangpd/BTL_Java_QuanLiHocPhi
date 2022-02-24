/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CongNo;
import model.GiaoDich;
import model.HocPhan;
import model.LopHocPhan;
import model.SinhVien;
import model.TableModel;
import model.Thu;
import model.ThuTheoDangKy;

/**
 *
 * @author dungt
 */
public class QuanLyThuTheoDK extends javax.swing.JFrame {

    private ArrayList<ThuTheoDangKy> dsThuTheoDangKy;
    private ArrayList<HocPhan> dsHocPhan;
    private ArrayList<SinhVien> dsSinhVien;
    private ArrayList<CongNo> dsCongNo;
    private ArrayList<LopHocPhan> dsLopHocPhan;
    private ArrayList<HocPhan> dsHocPhanDaDangKy;
    private ArrayList<LopHocPhan> dsLopHocPhanDaDangKy;
    private TableModel<ThuTheoDangKy> tableModelThuTheoDanKy;
    private ArrayList<GiaoDich> dsGiaoDich;
    private Controller con;
    private String maMonHoc;
    private String maSinhVien;

    /**
     * Creates new form
     */
    public QuanLyThuTheoDK() {
        con = new Controller();
        dsThuTheoDangKy = con.docFile("src/Textjava/thutheodangky.txt");
        dsHocPhan = con.docFile("src/TextJava/hocphan.txt");
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsCongNo = con.docFile("src/TextJava/congno.txt");
        dsLopHocPhan = con.docFile("src/TextJava/lophocphan.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");
        dsHocPhanDaDangKy = new ArrayList<>();
        dsLopHocPhanDaDangKy = new ArrayList<>();
        initComponents();
        loadDataTable();
        setLocationRelativeTo(null);
    }

    public void loadDataTable() {

        dsThuTheoDangKy = con.docFile("src/TextJava/thutheodangky.txt");
        String[] tenCot = {"Mã khoản thu", "Mã sinh viên", "Mã học phần", "Tên khoản thu", "Tín chỉ", "Gia"};
        this.tableModelThuTheoDanKy = new TableModel<ThuTheoDangKy>(this.dsThuTheoDangKy, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return dsThuTheoDangKy.get(rowIndex).getMaKhoanThu();
                    case 1:
                        return dsThuTheoDangKy.get(rowIndex).getLopHocPhan().getSinhVien().getMaSinhVien();
                    case 2:
                        return dsThuTheoDangKy.get(rowIndex).getLopHocPhan().getHocPhan().getMaHocPhan();
                    case 3:
                        return dsThuTheoDangKy.get(rowIndex).getTenKhoanThu();
                    case 4:
                        return dsThuTheoDangKy.get(rowIndex).getLopHocPhan().getHocPhan().getTinChi();
                    case 5:
                        return dsThuTheoDangKy.get(rowIndex).getLopHocPhan().getHocPhan().getGia();
                    default:
                        return null;
                }
            }

        };
        tableHocPhan.setModel(this.tableModelThuTheoDanKy);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHocPhan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSinhVien = new javax.swing.JTextField();
        txtMaHocPhan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableHocPhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHocPhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHocPhan);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("QUẢN LÝ THU THEO ĐĂNG KÝ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Danh sách học phần ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập thông tin cho học phần", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã học phần:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã sinh viên:");

        txtMaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSinhVienActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Hủy");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaHocPhan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSinhVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnTim.setText("Thoát");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnTim)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            String msv = txtMaSinhVien.getText();
            String maMonDangKy = txtMaHocPhan.getText();
            if (txtMaHocPhan.getText().equals("") || txtMaSinhVien.getText().equals("")) {
                throw new Exception("Nhập thiếu thông tin");
            }
            SinhVien sinhVien = new SinhVien(msv, "", null, 0, "", null);
            HocPhan hocPhan = new HocPhan(maMonDangKy, "", 0, "");
            if (!dsSinhVien.contains(sinhVien) || !dsHocPhan.contains(hocPhan)) {
                throw new Exception("Mã sinh viên hoặc mã học phần không tồn tại");
            }
            sinhVien = dsSinhVien.get(dsSinhVien.indexOf(sinhVien));

            HocPhan hp = new HocPhan(maMonDangKy, "", 0, "");
            LopHocPhan lhp = new LopHocPhan(sinhVien, hp);
            if (dsLopHocPhan.contains(lhp)) {
                throw new Exception("Môn học này đã được sinh viên đăng ký");
            }
            hp = dsHocPhan.get(dsHocPhan.indexOf(hp));
            lhp = new LopHocPhan(sinhVien, hp);

            ThuTheoDangKy maDangKyHocPhanMax = Collections.max(dsThuTheoDangKy, new Comparator<ThuTheoDangKy>() {
                @Override
                public int compare(ThuTheoDangKy o1, ThuTheoDangKy o2) {
                    if (o1.getSoDanhMaTuDong() > o2.getSoDanhMaTuDong()) {
                        return 1;
                    } else if (o1.getSoDanhMaTuDong() > o2.getSoDanhMaTuDong()) {
                        return 0;
                    }
                    return -1;
                }
            });
            ThuTheoDangKy thuTheoDK = new ThuTheoDangKy(maDangKyHocPhanMax.getSoDanhMaTuDong() + 1, lhp, sinhVien.getMaSinhVien());
            CongNo congNo = new CongNo(sinhVien, thuTheoDK, false);
            dsLopHocPhan.add(lhp);
            dsThuTheoDangKy.add(thuTheoDK);
            dsCongNo.add(congNo);
            con.ghiFile(dsLopHocPhan, "src/TextJava/lophocphan.txt");
            con.ghiFile(dsThuTheoDangKy, "src/TextJava/thutheodangky.txt");
            con.ghiFile(dsCongNo, "src/TextJava/congno.txt");
            loadDataTable();
            throw new Exception("Đăng ký thành công môn học " + hp.getTenHocPhan());
        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void tableHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHocPhanMouseClicked
        // TODO add your handling code here:
        int row = tableHocPhan.getSelectedRow();
        maMonHoc = (String) tableHocPhan.getValueAt(row, 2);
        maSinhVien = (String) tableHocPhan.getValueAt(row, 1);
        txtMaHocPhan.setText(maMonHoc);
        txtMaSinhVien.setText(maSinhVien);
    }//GEN-LAST:event_tableHocPhanMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Frame frame = new JFrame();
        String maHocPhanHuy = txtMaHocPhan.getText();
        try {
            String msv = txtMaSinhVien.getText();
            String maMonDangKyHuy = txtMaHocPhan.getText();
            if (txtMaHocPhan.getText().equals("") || txtMaSinhVien.getText().equals("")) {
                throw new Exception("Nhập thiếu thông tin");
            }
            SinhVien sinhVien = new SinhVien(msv, "", null, 0, "", null);
            HocPhan hocPhan = new HocPhan(maMonDangKyHuy, "", 0, "");
            if (!dsSinhVien.contains(sinhVien) || !dsHocPhan.contains(hocPhan)) {
                throw new Exception("Mã sinh viên hoặc mã học phần không tồn tại");
            }
            sinhVien = dsSinhVien.get(dsSinhVien.indexOf(sinhVien));

            HocPhan hp = dsHocPhan.get(dsHocPhan.indexOf(new HocPhan(maHocPhanHuy, "", 0, "")));
            LopHocPhan lhp = new LopHocPhan(sinhVien, hp);
            int output = JOptionPane.showConfirmDialog(frame,
                    "Xác nhận rút học phần", "Lựa chọn", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                dsHocPhanDaDangKy = new ArrayList<>();
                for (int i = 0; i < dsLopHocPhan.size(); i++) {
                    LopHocPhan get = dsLopHocPhan.get(i);
                    if (get.getSinhVien().getMaSinhVien().equals(sinhVien.getMaSinhVien())) {
                        dsLopHocPhanDaDangKy.add(get);
                        dsHocPhanDaDangKy.add(get.getHocPhan());
                    }
                }
                dsLopHocPhan.remove(dsLopHocPhan.indexOf(lhp));
                Thu thu = new ThuTheoDangKy();
                thu = dsThuTheoDangKy.get(dsThuTheoDangKy.indexOf(new ThuTheoDangKy(0, lhp, sinhVien.getMaSinhVien())));
                CongNo check = dsCongNo.get(dsCongNo.indexOf(new CongNo(sinhVien, thu, false)));
                if (check.isKiemTraThu()) {
                    sinhVien.setSoTienTK(sinhVien.getSoTienTK() + check.getKhoanThu().getGia());
                    dsSinhVien.set(dsSinhVien.indexOf(sinhVien), sinhVien);
                    con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                    GiaoDich giaoDich = new GiaoDich(sinhVien, "Rút học phần", sinhVien.getTaiKhoanTien(), new Date(), "+ " + String.valueOf(check.getKhoanThu().getGia()));
                    dsGiaoDich.add(giaoDich);
                    loadDataTable();
                }
                dsCongNo.remove(dsCongNo.indexOf(new CongNo(sinhVien, thu, false)));
                dsThuTheoDangKy.remove(dsThuTheoDangKy.indexOf(new ThuTheoDangKy(0, lhp, sinhVien.getMaSinhVien())));
                dsHocPhanDaDangKy.remove(dsHocPhanDaDangKy.indexOf(hp));

                
                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");

                con.ghiFile(dsLopHocPhan, "src/TextJava/lophocphan.txt");
                con.ghiFile(dsThuTheoDangKy, "src/TextJava/thutheodangky.txt");
                con.ghiFile(dsCongNo, "src/TextJava/congno.txt");
                loadDataTable();
                throw new Exception("Thành công");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtMaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSinhVienActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnTimActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyThuTheoDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyThuTheoDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyThuTheoDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyThuTheoDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThuTheoDK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHocPhan;
    private javax.swing.JTextField txtMaHocPhan;
    private javax.swing.JTextField txtMaSinhVien;
    // End of variables declaration//GEN-END:variables
}
