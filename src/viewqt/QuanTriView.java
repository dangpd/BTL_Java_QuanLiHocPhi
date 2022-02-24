package viewqt;

import login.Login;
import model.QuanTri;

public class QuanTriView extends javax.swing.JFrame {

    private QuanTri quanTri;

    public QuanTri getQuanTri() {
        return quanTri;
    }

    public void setQuanTri(QuanTri quanTri) {
        this.quanTri = quanTri;
    }

    public QuanTriView(QuanTri qt) {
        this.quanTri = qt;
        initComponents();
        System.out.println(quanTri.toString());
        lblMaQuanTri.setText(qt.getMaQuanTri());
        lblTenQuanTri.setText(qt.getTenQuanTri());
        lblChucVu.setText(qt.getChucVu());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMaQuanTri = new javax.swing.JLabel();
        lblTenQuanTri = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnThuHoHocPhi = new javax.swing.JButton();
        btnThuKhaoThi = new javax.swing.JButton();
        btnThuHocPhi = new javax.swing.JButton();
        btnThuChiDauNam = new javax.swing.JButton();
        btnThuBoSung = new javax.swing.JButton();
        btnThuTheoDangKi = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã quản trị :");

        jLabel2.setText("Tên quản trị :");

        jLabel3.setText("Chức vụ :");

        jLabel4.setText("Chức năng");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThuHoHocPhi.setBackground(new java.awt.Color(255, 255, 255));
        btnThuHoHocPhi.setText("Thu hộ học phí");

        btnThuKhaoThi.setBackground(new java.awt.Color(255, 255, 255));
        btnThuKhaoThi.setText("Thu khảo thí");

        btnThuHocPhi.setBackground(new java.awt.Color(255, 255, 255));
        btnThuHocPhi.setText("Danh sách nộp học phí");
        btnThuHocPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuHocPhiActionPerformed(evt);
            }
        });

        btnThuChiDauNam.setBackground(new java.awt.Color(255, 255, 255));
        btnThuChiDauNam.setText("Quản lí thu chi đầu năm");
        btnThuChiDauNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuChiDauNamActionPerformed(evt);
            }
        });

        btnThuBoSung.setBackground(new java.awt.Color(255, 255, 255));
        btnThuBoSung.setText("Thu bổ sung");
        btnThuBoSung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuBoSungActionPerformed(evt);
            }
        });

        btnThuTheoDangKi.setBackground(new java.awt.Color(255, 255, 255));
        btnThuTheoDangKi.setText("Thu theo đăng kí");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThuHocPhi)
                    .addComponent(btnThuChiDauNam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThuBoSung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThuHoHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThuKhaoThi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThuTheoDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThuHocPhi)
                    .addComponent(btnThuKhaoThi)
                    .addComponent(btnThuHoHocPhi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThuBoSung)
                    .addComponent(btnThuTheoDangKi)
                    .addComponent(btnThuChiDauNam))
                .addGap(20, 20, 20))
        );

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblMaQuanTri, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTenQuanTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblMaQuanTri)
                    .addComponent(lblChucVu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTenQuanTri))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangXuat)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThuHocPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuHocPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThuHocPhiActionPerformed

    private void btnThuChiDauNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuChiDauNamActionPerformed
        // TODO add your handling code here:
        QLThuChiDauNam thuChiDauNam = new QLThuChiDauNam();
        thuChiDauNam.setVisible(true);
    }//GEN-LAST:event_btnThuChiDauNamActionPerformed

    private void btnThuBoSungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuBoSungActionPerformed
        // TODO add your handling code here:
        QLThuBoSung quanLThuBoSung = new QLThuBoSung();
        quanLThuBoSung.setVisible(true);
    }//GEN-LAST:event_btnThuBoSungActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnThuBoSung;
    private javax.swing.JButton btnThuChiDauNam;
    private javax.swing.JButton btnThuHoHocPhi;
    private javax.swing.JButton btnThuHocPhi;
    private javax.swing.JButton btnThuKhaoThi;
    private javax.swing.JButton btnThuTheoDangKi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblMaQuanTri;
    private javax.swing.JLabel lblTenQuanTri;
    // End of variables declaration//GEN-END:variables
}
