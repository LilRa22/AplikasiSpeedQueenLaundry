package Speedqueen_laundry;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lilis Rahmawati
 */
public class Tfrom3 extends javax.swing.JFrame {


    

    /**
     * Creates new form Tfrom3
     */
    public Tfrom3() {
        initComponents();
       
    }
    public int total;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jeniscuci = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtberat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ttl_Harga = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nohp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtalamat = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  SPEED QUEEN LAUNDRY");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 680, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jenis Cucian");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jeniscuci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Cuci Bilas", "Pengering" }));
        jeniscuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniscuciActionPerformed(evt);
            }
        });
        getContentPane().add(jeniscuci, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 150, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga KG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 60, 30));

        txtberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtberatActionPerformed(evt);
            }
        });
        txtberat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtberatKeyReleased(evt);
            }
        });
        getContentPane().add(txtberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 150, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Berat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 40, 60));

        Ttl_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ttl_HargaActionPerformed(evt);
            }
        });
        getContentPane().add(Ttl_Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 150, 30));

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 30));

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        getContentPane().add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 150, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 40, 50));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bayar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 40, 40));

        jButton1.setText("Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 160, 40));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Speedqueen_laundry/icons8-user-24.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 30, 20));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 30));

        simpan.setText("Simpan Data");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 100, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Speedqueen_laundry/icons8-house-30.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 30, 30));

        nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpActionPerformed(evt);
            }
        });
        getContentPane().add(nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 150, 30));

        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 70, 30));

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, 30));

        tanggal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tanggalFocusGained(evt);
            }
        });
        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Speedqueen_laundry/icons8-planner-24.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 30, 30));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Speedqueen_laundry/icons8-phone-24.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 30, 30));

        jLabel13.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Menu Data Diri Pelanggan");
        jLabel13.setFocusCycleRoot(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 50));

        jLabel14.setFont(new java.awt.Font("Swis721 Hv BT", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Menu Pembelian ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 140, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Speedqueen_laundry/laundry_22.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    
    private void txtberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtberatActionPerformed

    private void Ttl_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ttl_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ttl_HargaActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void jeniscuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniscuciActionPerformed
        if (jeniscuci.getSelectedItem().equals("Pengering")){
            Harga.setText("5000");
            }else if (jeniscuci.getSelectedItem().equals("Cuci Bilas")){
                Harga.setText("8000");
            }
    }//GEN-LAST:event_jeniscuciActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int bayar = Integer.parseInt(txtBayar.getText());
        int kembalian = bayar - total;
        JOptionPane.showMessageDialog(null, "Kembalian Anda :\n" + String.valueOf(kembalian));
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtberatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtberatKeyReleased
        int harga = Integer.parseInt(Harga.getText());
        int berat = Integer.parseInt(txtberat.getText());
        total = berat * harga;
        Ttl_Harga.setText(String.valueOf(total));
    }//GEN-LAST:event_txtberatKeyReleased

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try{
             String sql = "INSERT INTO login VALUES ('"+txtnama.getText()+"','"+txtalamat.getText()
                     +"','"+jeniscuci.getSelectedItem()+"','"+txtberat.getText()+"','"+Ttl_Harga.getText()
                     +"','"+txtBayar.getText()+"','"+tanggal.getDateFormatString()+"','"+nohp.getText()+"')";;
             
             java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "penyimpanan berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
    }//GEN-LAST:event_simpanActionPerformed

    private void nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             // TODO add your handling code here:
            this.hide();
            Tfrom4 from = new Tfrom4();
            from.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
           Date ks =new Date();
               SimpleDateFormat k=new SimpleDateFormat("YYY-MM-dd");
               tanggal.setDateFormatString(k.format(ks));
    }//GEN-LAST:event_tanggalPropertyChange

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void tanggalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tanggalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalFocusGained

   
    
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
            java.util.logging.Logger.getLogger(Tfrom3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tfrom3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tfrom3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tfrom3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tfrom3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField Ttl_Harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jeniscuci;
    private javax.swing.JTextField nohp;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}

