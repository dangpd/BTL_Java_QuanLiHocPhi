package viewsv;

import controller.Controller;
import java.awt.Frame;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.CongNo;
import model.GiaoDich;
import model.SinhVien;
import model.TableModel;
import model.ThuTheoDangKy;

public class LichSuGiaoDich extends javax.swing.JFrame {

    private SinhVienMain sinhVienMain;
    private SinhVien sinhVien;
    private TableModel<GiaoDich> tableGiaoDicModel;
    private ArrayList<GiaoDich> giaoDichs;
    private ArrayList<CongNo> dsCongNo;
    private ArrayList<ThuTheoDangKy> dsThuTheoDangKy;
    private ArrayList<SinhVien> dsSinhVien;
    private Controller con;

    public LichSuGiaoDich(java.awt.Frame parent, boolean modal, SinhVien sinhVien) {
        super();
        this.sinhVien = sinhVien;
        con = new Controller();
        giaoDichs = con.docFile("src/TextJava/giaodich.txt");
        dsCongNo = con.docFile("src/TextJava/congno.txt");
        dsThuTheoDangKy = con.docFile("src/TextJava/thutheodangky.txt");
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        initComponents();
        loadGiaoDich();
        this.setLocationRelativeTo(null);
        sinhVienMain = (SinhVienMain) parent;
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void loadGiaoDich() {
        String[] tenCot = {"Tên khoản thu", "Ngày", "Số tiền"};
        List<GiaoDich> temp = giaoDichs.stream().filter(cn -> cn.getSinhVien().getMaSinhVien().equals(sinhVien.getMaSinhVien())).toList();
        ArrayList<GiaoDich> giaoDichs = new ArrayList<>();
        giaoDichs.addAll(temp);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        this.tableGiaoDicModel = new TableModel<GiaoDich>(giaoDichs, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return giaoDichs.get(rowIndex).getTenKhoanThu();
                    case 1:
                        return sdf.format(giaoDichs.get(rowIndex).getNgayNop());
                    case 2:
                        return giaoDichs.get(rowIndex).getSoTien();
                    default:
                        return null;
                }
            }
        };
        tableGiaoDich.setModel(tableGiaoDicModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGiaoDich = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tableGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableGiaoDich);

        jLabel1.setText("Lịch Sử Giao Dịch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThoat)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableGiaoDich;
    // End of variables declaration//GEN-END:variables
}
