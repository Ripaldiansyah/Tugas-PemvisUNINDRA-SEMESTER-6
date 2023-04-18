/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspemvis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tugaspemvis.Koneksi;
/**
 *
 * @author ripal
 */
public class Ripaldiansyah_202043502261 extends javax.swing.JFrame {
    
    /**
     * Creates new form KuisPemvis
     */
    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tableModel;
    public Ripaldiansyah_202043502261() {
        initComponents();
        inventory_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new tugaspemvis.Background();
        jpBgName = new javax.swing.JPanel();
        jlMyName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpInput = new javax.swing.JPanel();
        jlItemCode = new javax.swing.JLabel();
        jlItemName = new javax.swing.JLabel();
        jlModel = new javax.swing.JLabel();
        tfItemCode = new javax.swing.JTextField();
        tfItemName = new javax.swing.JTextField();
        tfModel = new javax.swing.JTextField();
        jlWeight = new javax.swing.JLabel();
        tfWeight = new javax.swing.JTextField();
        jlGrade = new javax.swing.JLabel();
        jlType = new javax.swing.JLabel();
        cbGoldType = new javax.swing.JComboBox<>();
        cbGoldGrade = new javax.swing.JComboBox<>();
        btSave = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jsInventoryTable = new javax.swing.JScrollPane();
        jtInventoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Pemvis Ripaldiansyah");

        jpBgName.setBackground(new java.awt.Color(255, 153, 0));

        jlMyName.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlMyName.setText("Ripaldiansyah 202043502261");
        jlMyName.setToolTipText("");

        javax.swing.GroupLayout jpBgNameLayout = new javax.swing.GroupLayout(jpBgName);
        jpBgName.setLayout(jpBgNameLayout);
        jpBgNameLayout.setHorizontalGroup(
            jpBgNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBgNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMyName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBgNameLayout.setVerticalGroup(
            jpBgNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBgNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlMyName)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Barang");

        jlItemCode.setText("Kode Barang");

        jlItemName.setText("Nama Barang");

        jlModel.setText("Model");

        jlWeight.setText("Berat ( gram )");

        jlGrade.setText("Kadar");

        jlType.setText("Jenis");

        cbGoldType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emas Murni", "Emas Kuning", "Emas Putih", "Emas Rose", "Emas Hijau", "Emas Hitam", "Emas Tungsten", "Emas Berlapis" }));

        cbGoldGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "99%", "92%", "75%", "58%", "42%" }));

        javax.swing.GroupLayout jpInputLayout = new javax.swing.GroupLayout(jpInput);
        jpInput.setLayout(jpInputLayout);
        jpInputLayout.setHorizontalGroup(
            jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInputLayout.createSequentialGroup()
                        .addComponent(jlModel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInputLayout.createSequentialGroup()
                        .addComponent(jlItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInputLayout.createSequentialGroup()
                        .addComponent(jlItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addGroup(jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpInputLayout.createSequentialGroup()
                        .addComponent(jlType, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbGoldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInputLayout.createSequentialGroup()
                        .addComponent(jlGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbGoldGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpInputLayout.createSequentialGroup()
                        .addComponent(jlWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpInputLayout.setVerticalGroup(
            jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInputLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlItemCode)
                    .addComponent(tfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlType)
                    .addComponent(cbGoldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlItemName)
                    .addGroup(jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlGrade)
                        .addComponent(cbGoldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModel)
                    .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlWeight)
                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kata kunci");

        btSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSearch.setText("Cari");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jtInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jtInventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtInventoryTableMouseClicked(evt);
            }
        });
        jsInventoryTable.setViewportView(jtInventoryTable);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpBgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background1Layout.createSequentialGroup()
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(background1Layout.createSequentialGroup()
                                        .addComponent(btSave)
                                        .addGap(18, 18, 18)
                                        .addComponent(btEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btDelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(btClear)
                                        .addGap(18, 18, 18)
                                        .addComponent(btExit))
                                    .addGroup(background1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSearch)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jsInventoryTable))))
                .addGap(422, 422, 422))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jpBgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jpInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btEdit)
                    .addComponent(btDelete)
                    .addComponent(btClear)
                    .addComponent(btExit))
                .addGap(18, 18, 18)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch))
                .addGap(25, 25, 25)
                .addComponent(jsInventoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        String sql ="update data_barang set NamaBarang=?, Model=?,Jenis=?, Kadar=?, Berat=? where KodeBarang=? ";
        try {
           PreparedStatement stat = conn.prepareStatement(sql);
           stat.setString(1,tfItemName.getText());
           stat.setString(2, tfModel.getText());
           stat.setString(3,cbGoldType.getSelectedItem().toString() );
           stat.setString(4, cbGoldGrade.getSelectedItem().toString());
           int weight = Integer.parseInt(tfWeight.getText());
           stat.setInt(5, weight);
           stat.setString(6,tfItemCode.getText());
           
           stat.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
           clear();
           tfItemCode.requestFocus();
           inventory_table();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal diupdate"+e);
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
       int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql ="delete from data_barang where KodeBarang='"+tfItemCode.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                clear();
                tfItemCode.requestFocus();
                inventory_table();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        clear();
        inventory_table();
    }//GEN-LAST:event_btClearActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
         String sql ="insert into data_barang values (?,?,?,?,?,?)";
        try {
           PreparedStatement stat = conn.prepareStatement(sql);
           stat.setString(1,tfItemCode.getText());
           stat.setString(2,tfItemName.getText());
           stat.setString(3, tfModel.getText());
           stat.setString(4,cbGoldType.getSelectedItem().toString() );
           stat.setString(5, cbGoldGrade.getSelectedItem().toString());
           int weight = Integer.parseInt(tfWeight.getText());
           stat.setInt(6, weight);
           
           stat.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           clear();
           tfItemCode.requestFocus();
           inventory_table();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void jtInventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtInventoryTableMouseClicked
        int bar = jtInventoryTable.getSelectedRow();
        String a = tableModel.getValueAt(bar, 0).toString();
        String b = tableModel.getValueAt(bar, 1).toString();
        String c = tableModel.getValueAt(bar, 2).toString();
        String d = tableModel.getValueAt(bar, 3).toString();
        String e = tableModel.getValueAt(bar, 4).toString();
        int f = Integer.parseInt(tableModel.getValueAt(bar, 5).toString());
        tfItemCode.setText(a);
        tfItemName.setText(b);
        tfModel.setText(c);
        cbGoldType.setSelectedItem(d);
        cbGoldGrade.setSelectedItem(e);
        tfWeight.setText(Integer.toString(f));
    }//GEN-LAST:event_jtInventoryTableMouseClicked

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
            java.util.logging.Logger.getLogger(Ripaldiansyah_202043502261.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ripaldiansyah_202043502261.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ripaldiansyah_202043502261.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ripaldiansyah_202043502261.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ripaldiansyah_202043502261().setVisible(true);
            }
        });
    }
protected void inventory_table(){
    Object[] row = {
        "Kode Barang",
        "Nama Barang",
        "Model",
        "Jenis",
        "Kadar",
        "Berat(gram)"
    };
    
    tableModel = new DefaultTableModel(null, row);
    jtInventoryTable.setModel(tableModel);
        String sql ="Select * From data_barang";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String a = hasil.getString("KodeBarang");
                String b = hasil.getString("NamaBarang");
                String c = hasil.getString("Model");
                String d = hasil.getString("Jenis");
                String e = hasil.getString("Kadar");
                int f = hasil.getInt("Berat");
                
                Object[] data = {a,b,c,d,e,Integer.valueOf(f)};
                tableModel.addRow(data);
            }
        }catch (Exception e) {
            System.out.println("Input gagal : "+e);
            }
        }

protected void clear(){
    tfItemCode.setText("");
    tfItemName.setText("");
    tfModel.setText("");
    tfWeight.setText("");
    cbGoldGrade.setSelectedIndex(0);
    cbGoldType.setSelectedIndex(0);
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tugaspemvis.Background background1;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbGoldGrade;
    private javax.swing.JComboBox<String> cbGoldType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlGrade;
    private javax.swing.JLabel jlItemCode;
    private javax.swing.JLabel jlItemName;
    private javax.swing.JLabel jlModel;
    private javax.swing.JLabel jlMyName;
    private javax.swing.JLabel jlType;
    private javax.swing.JLabel jlWeight;
    private javax.swing.JPanel jpBgName;
    private javax.swing.JPanel jpInput;
    private javax.swing.JScrollPane jsInventoryTable;
    private javax.swing.JTable jtInventoryTable;
    private javax.swing.JTextField tfItemCode;
    private javax.swing.JTextField tfItemName;
    private javax.swing.JTextField tfModel;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables
}