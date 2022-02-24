package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.TableModel;
import model.ThuBoSung;
import model.ThuChiDauNam;

public class QLThuBoSung extends javax.swing.JFrame {

    private Controller con;
    private TableModel<ThuBoSung> tableModelThuBoSung;
    private ArrayList<ThuBoSung> dsThuBoSung;
    private String maKhoanThu = "";
    private String tenKhoa = "";
    private String tenKhoanThu = "";
    private String gia = "";

    public QLThuBoSung() {
        con = new Controller();
        dsThuBoSung = con.docFile("src/TextJava/thubosung.txt");
        initComponents();
        loadDataTable();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    public void loadDataTable() {
        dsThuBoSung = con.docFile("src/TextJava/thubosung.txt");
        String[] tenCot = {"Mã khoản thu", "Tên khoản thu", "Khoa", "Giá"};
        this.tableModelThuBoSung = new TableModel<ThuBoSung>(this.dsThuBoSung, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return dsThuBoSung.get(rowIndex).getMaKhoanThu();
                    case 1:
                        return dsThuBoSung.get(rowIndex).getTenKhoanThu();
                    case 2:
                        return dsThuBoSung.get(rowIndex).getKhoa().getTenKhoa();
                    case 3:
                        return dsThuBoSung.get(rowIndex).getGia();
                    default:
                        return null;
                }
            }

        };
        tableThuBoSung.setModel(this.tableModelThuBoSung);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableThuBoSung = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableThuBoSung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThuBoSungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableThuBoSung);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 590, 300));

        btnThem.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 30));

        btnSua.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 100, 30));

        btnThoat.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ThemThuBoSung themThuBoSung = new ThemThuBoSung(this, rootPaneCheckingEnabled);
        themThuBoSung.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            if (maKhoanThu.equals("")) {
                throw new Exception("Vui lòng chọn khoản thu cần sửa");
            }
            SuaThuBoSung suaThuBoSung = new SuaThuBoSung(this, rootPaneCheckingEnabled, maKhoanThu, tenKhoa, tenKhoanThu, gia);
            suaThuBoSung.setVisible(true);
        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tableThuBoSungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThuBoSungMouseClicked
        // TODO add your handling code here:
        int row = tableThuBoSung.getSelectedRow();
        maKhoanThu = (String) tableThuBoSung.getValueAt(row, 0);
        tenKhoanThu = (String) tableThuBoSung.getValueAt(row, 1);
        tenKhoa = (String) tableThuBoSung.getValueAt(row, 2);
        System.out.println(gia);
    }//GEN-LAST:event_tableThuBoSungMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLThuBoSung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableThuBoSung;
    // End of variables declaration//GEN-END:variables
}
