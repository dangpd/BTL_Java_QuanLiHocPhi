/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.CongNo;
import model.TableModel;
import model.GiaoDich;
import model.Thu;

public class HienThiDS extends java.awt.Dialog {

    private QuanTriView quanTriView;
    private TableModel<CongNo> tableCongNo;
    ArrayList<CongNo> ds = new ArrayList<>();
    private Controller con;

    public HienThiDS(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.con = new Controller();
        this.ds = con.docFile("src/TextJava/congno.txt");
        initComponents();
        loadTable(ds);
        this.setLocationRelativeTo(null);
        quanTriView = (QuanTriView) parent;
    }

    public void loadTable(ArrayList<CongNo> ds) {
        String[] Name = {"Mã sinh viên", "Mã Khoản Thu", "Tên Khoản Thu", "Số Tiền", "Đã nộp"};
        this.tableCongNo = new TableModel<CongNo>(ds, Name) {
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
                    case 4:
                        return ds.get(rowIndex).isKiemTraThu() ? "Đã thanh toán" : "Chưa thanh toán";
                    default:
                        return null;
                }
            }
        };
        tableHienThiDS.setModel(this.tableCongNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHienThiDS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMasv = new javax.swing.JTextPane();
        btnTim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        tableHienThiDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "tittle1", "tittle2", "tittle3", "tittle4"
            }
        ));
        jScrollPane1.setViewportView(tableHienThiDS);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Danh sách thu đóng của sinh viên");

        jScrollPane2.setViewportView(txtMasv);

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel2.setText("Tìm kiếm theo Mã Sinh Viên");

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(530, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTim)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        String msv = txtMasv.getText().trim().toUpperCase();
        ArrayList<CongNo> dsTK = new ArrayList<>();
        for (var it : ds) {
            if (it.getSinhVien().getMaSinhVien().trim().contains(msv)) {
                dsTK.add(it);
            }
        }
        loadTable(dsTK);
    }//GEN-LAST:event_btnTimActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHienThiDS;
    private javax.swing.JTextPane txtMasv;
    // End of variables declaration//GEN-END:variables

}
