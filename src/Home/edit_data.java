/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.UpdateResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author ijaa76
 */
public class edit_data extends javax.swing.JFrame {

    /**
     * Creates new form add_data
     */
    public edit_data() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mapelTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsiTxt = new javax.swing.JTextArea();
        simpanBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        progresBox = new javax.swing.JComboBox<>();
        tglBatas = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 243, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Edit Tugas Sekolah");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel2.setText("Mata Pelajaran");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setText("Deskripsi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 142, -1, -1));

        jLabel4.setText("Batas Pengumpulan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        mapelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapelTxtActionPerformed(evt);
            }
        });
        jPanel1.add(mapelTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 30));

        deskripsiTxt.setColumns(20);
        deskripsiTxt.setRows(5);
        jScrollPane1.setViewportView(deskripsiTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 400, 230));

        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });
        jPanel1.add(simpanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel5.setText("Progres");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        progresBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));
        progresBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progresBoxActionPerformed(evt);
            }
        });
        jPanel1.add(progresBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 80, -1));
        jPanel1.add(tglBatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
     
        MainActivity main = new MainActivity();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void mapelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapelTxtActionPerformed

    private void progresBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progresBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progresBoxActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
        String tampilan = "YYYY-MM-dd";
        SimpleDateFormat df = new SimpleDateFormat(tampilan);
        String mapel = mapelTxt.getText();
        String tgl = String.valueOf(df.format(tglBatas.getDate()));
        String progres = progresBox.getSelectedItem().toString();
        String deskripsi = deskripsiTxt.getText();
        
        
        if (mapel.isEmpty() || tgl.isEmpty() || progres.isEmpty() || deskripsi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan lengkapi data sesuai tabel !!");
            this.requestFocus();
        }else{
            try {
                
                MongoDatabase c = connect.sambungDB();
//                Statement st = c.createStatement();
                MongoCollection<Document> col = c.getCollection("tugas");
                Document docs = new Document();
                
                Object id = new ObjectId(docs.get("_id").toString());
                docs.put("mapel", mapel);
                docs.put("tgl_batas", tgl);
                docs.put("progres", progres);
                docs.put("deskripsi", deskripsi);
                
                Document doc_edit = new Document("$set", docs);
                UpdateResult hasil_edit = col.updateOne(eq("_id", id), doc_edit);
                
                JOptionPane.showMessageDialog(this, "Data yang diedit sukses");
                MainActivity main = new MainActivity();
                main.loadData("");
                this.dispose();
            } catch (MongoException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

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
            java.util.logging.Logger.getLogger(edit_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea deskripsiTxt;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mapelTxt;
    private javax.swing.JComboBox<String> progresBox;
    private javax.swing.JButton simpanBtn;
    private com.toedter.calendar.JDateChooser tglBatas;
    // End of variables declaration//GEN-END:variables
}
