/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspbo.pkg9;

/**
 *
 * @author USER
 */


public class PenentuJumlahHari extends javax.swing.JFrame {
    
    /**
     * Creates new form AplikasiPenentuJumlahHari
     */
    public PenentuJumlahHari() {
        initComponents();
        setTitle ("Penentu Jumlah Hari");
        Bulan.setModel(new javax.swing.DefaultComboBoxModel<>( new String[] {
            "January", "February","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"}));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tahun = new javax.swing.JTextField();
        Bulan = new javax.swing.JComboBox<>();
        display = new javax.swing.JPanel();
        HitungHari = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Hitung = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));

        jPanel2.setForeground(new java.awt.Color(102, 204, 255));

        jPanel5.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tahun");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bulan");

        Tahun.setBackground(new java.awt.Color(255, 255, 255));
        Tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TahunActionPerformed(evt);
            }
        });

        Bulan.setBackground(new java.awt.Color(255, 255, 255));
        Bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "October", "November", "Desember" }));
        Bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(82, 82, 82)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tahun))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        display.setBackground(new java.awt.Color(255, 255, 153));

        HitungHari.setText("Jumlah Hari");

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(HitungHari, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(HitungHari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        Hitung.setBackground(new java.awt.Color(255, 255, 255));
        Hitung.setText("Hitung ");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        Hapus.setBackground(new java.awt.Color(255, 255, 255));
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Simpan.setBackground(new java.awt.Color(255, 255, 255));
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Keluar.setBackground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Simpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Keluar)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hitung)
                    .addComponent(Hapus)
                    .addComponent(Simpan)
                    .addComponent(Keluar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TahunActionPerformed
        String inputTahun = Tahun.getText();
        
        try {
            int tahun = Integer.parseInt(inputTahun);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Masukan Tahun Yang Valid!");
        }
    }//GEN-LAST:event_TahunActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        String inputTahun = Tahun.getText();
        int tahun;
        try {
            tahun = Integer.parseInt(inputTahun);
            if ( tahun < 1700 || tahun > 2100){
                return;
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Masukan Tahun yang valid!");
            return;
        }
        String bulan = Bulan.getSelectedItem().toString();
        HitungHari hitunghari = new HitungHari();
        int jumlahHari = hitunghari.hitung(tahun, bulan);
        HitungHari.setText("Jumlah pada bulan " + bulan + "tahun" +tahun + "adalah" + jumlahHari+ "hari.");
    }//GEN-LAST:event_HitungActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        Tahun.setText("");
        Bulan.setSelectedIndex(0);
        HitungHari.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
      try {
       String tahun = Tahun.getText();
       String bulan = Bulan.getSelectedItem().toString();
       String hasil = HitungHari.getText();
            
       java.io.FileWriter fileWriter = new java.io.FileWriter("HasilPerhitungan.txt", true);
       fileWriter.write("Tahun: " + tahun + ", Bulan : " + bulan + ", " + hasil + "\n");
       javax.swing.JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Terjadi Kesalaahan saat menyimpan!");
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void BulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulanActionPerformed
        String bulanTerpilih = Bulan.getSelectedItem().toString();
        System.out.println("Bulan Yanhg dipilih : " + bulanTerpilih);
    }//GEN-LAST:event_BulanActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
         System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenentuJumlahHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bulan;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Hitung;
    private javax.swing.JLabel HitungHari;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField Tahun;
    private javax.swing.JPanel display;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    private static class HitungHari {
        public int hitung(int tahun, String bulan){
            switch (bulan) {
                case "February":
                    if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                        return 29;
                    } else {
                       return 28; 
                    }
                case "April": case "June": case "September": case "November":
                    return 30;
                default:
                    return 31;
            }
        }
    }
}
