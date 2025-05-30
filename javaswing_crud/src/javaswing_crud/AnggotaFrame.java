/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswing_crud;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIMAS
 */
public class AnggotaFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnggotaFrame
     */
    public AnggotaFrame() {
        initComponents();
        try {
        loadDataTersedia();
        loadDataDipinjam();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Gagal memuat data buku", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        logoutButton.addActionListener(e -> {
            this.dispose(); // tutup CRUDFrame
            LoginFrame login = new LoginFrame();
            login.setVisible(true); // tampilkan form login
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Pending = new javax.swing.JButton();
        jLabel567 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bukuAnggota = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bukuAnggota2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel566 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PERPUS..CEK");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 200));

        Pending.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Pending.setText("PINJAM");
        Pending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingActionPerformed(evt);
            }
        });

        jLabel567.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel567.setForeground(new java.awt.Color(255, 255, 255));
        jLabel567.setText("PERPUS.CEK");

        logoutButton.setBackground(new java.awt.Color(255, 51, 51));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setForeground(java.awt.Color.white);
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel567)
                .addGap(144, 144, 144)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pending)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel567, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );

        bukuAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Buku", "Author", "Tahun Terbit", "Status"
            }
        ));
        jScrollPane1.setViewportView(bukuAnggota);

        bukuAnggota2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Buku", "Author", "Tahun Terbit", "Status"
            }
        ));
        jScrollPane2.setViewportView(bukuAnggota2);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel566.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel566.setForeground(new java.awt.Color(255, 255, 255));
        jLabel566.setText("STATUS BUKU PINJAMAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel566)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel566, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingActionPerformed
 try {
        java.sql.Connection conn = DBConnection.getConnection();

        // Ambil satu buku yang statusnya TERSEDIA dan jumlah > 0
        java.sql.PreparedStatement ps = conn.prepareStatement(
            "SELECT id_buku, jumlah FROM buku WHERE status = 'TERSEDIA' AND jumlah > 0 LIMIT 1"
        );
        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int idBuku = rs.getInt("id_buku");
            int jumlah = rs.getInt("jumlah");

            int confirm = JOptionPane.showConfirmDialog(this,
                "Ajukan peminjaman untuk buku ID: " + idBuku + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

            // Kurangi jumlah 1 buku
            int sisaJumlah = jumlah - 1;

            // Ubah status ke "PENDING"
            String statusBaru = "PENDING";

            java.sql.PreparedStatement psUpdate = conn.prepareStatement(
                "UPDATE buku SET jumlah = ?, status = ? WHERE id_buku = ?"
            );
            psUpdate.setInt(1, sisaJumlah);
            psUpdate.setString(2, statusBaru);
            psUpdate.setInt(3, idBuku);

            int updated = psUpdate.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Peminjaman berhasil diajukan. Status buku sekarang: PENDING");
                loadDataTersedia();
                loadDataDipinjam();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengajukan peminjaman.");
            }

            psUpdate.close();
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada buku yang tersedia untuk dipinjam.");
        }

        rs.close();
        ps.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_PendingActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

private void loadData() throws SQLException {
    BukuDAO bukuDAO = new BukuDAO();
    List<Buku> bukuList = bukuDAO.getBuku();

    List<Buku> tersediaList = new ArrayList<>();
    for (Buku b : bukuList) {
        if (b.getJumlah() > 0) {  // langsung akses int tanpa parse
            tersediaList.add(b);
        }
    }

    String[][] data = new String[tersediaList.size()][6];
    for (int i = 0; i < tersediaList.size(); i++) {
        data[i][0] = String.valueOf(tersediaList.get(i).getId());       
        data[i][1] = tersediaList.get(i).getNama();                     
        data[i][2] = tersediaList.get(i).getAuthor();                   
        data[i][3] = tersediaList.get(i).getTahun();                    
        data[i][4] = tersediaList.get(i).getStatus();                   
        data[i][5] = String.valueOf(tersediaList.get(i).getJumlah());   // convert int ke String
    }

    String[] columnNames = {"ID", "Nama Buku", "Author", "Tahun Terbit", "Status", "Jumlah"};
    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    bukuAnggota.setModel(model);

    // Sembunyikan kolom ID (kolom pertama)
    bukuAnggota.getColumnModel().getColumn(0).setMinWidth(0);
    bukuAnggota.getColumnModel().getColumn(0).setMaxWidth(0);
    bukuAnggota.getColumnModel().getColumn(0).setWidth(0);
}

private void loadDataTersedia() throws SQLException {
    BukuDAO bukuDAO = new BukuDAO();
    List<Buku> bukuList = bukuDAO.getBuku();

    List<Buku> tersediaList = new ArrayList<>();
    for (Buku b : bukuList) {
        if ("TERSEDIA".equalsIgnoreCase(b.getStatus()) && b.getJumlah() > 0) {
            tersediaList.add(b);
        }
    }

    String[][] data = new String[tersediaList.size()][6];
    for (int i = 0; i < tersediaList.size(); i++) {
        data[i][0] = String.valueOf(tersediaList.get(i).getId());
        data[i][1] = tersediaList.get(i).getNama();
        data[i][2] = tersediaList.get(i).getAuthor();
        data[i][3] = tersediaList.get(i).getTahun();
        data[i][4] = tersediaList.get(i).getStatus();
        data[i][5] = String.valueOf(tersediaList.get(i).getJumlah());
    }

    String[] columnNames = {"ID", "Nama Buku", "Author", "Tahun Terbit", "Status", "Jumlah"};
    bukuAnggota.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    sembunyikanKolomID(bukuAnggota);
}

private void loadDataDipinjam() throws SQLException {
    BukuDAO bukuDAO = new BukuDAO();
    List<Buku> bukuList = bukuDAO.getBuku();

    List<Buku> pinjamList = new ArrayList<>();
    for (Buku b : bukuList) {
        if (("PENDING".equalsIgnoreCase(b.getStatus()) || "DIPINJAM".equalsIgnoreCase(b.getStatus())) && b.getJumlah() >= 0) {
            pinjamList.add(b);
        }
    }

    String[][] data = new String[pinjamList.size()][6];
    for (int i = 0; i < pinjamList.size(); i++) {
        data[i][0] = String.valueOf(pinjamList.get(i).getId());
        data[i][1] = pinjamList.get(i).getNama();
        data[i][2] = pinjamList.get(i).getAuthor();
        data[i][3] = pinjamList.get(i).getTahun();
        data[i][4] = pinjamList.get(i).getStatus();
        data[i][5] = String.valueOf(pinjamList.get(i).getJumlah());
    }

    String[] columnNames = {"ID", "Nama Buku", "Author", "Tahun Terbit", "Status", "Jumlah"};
    bukuAnggota2.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    sembunyikanKolomID(bukuAnggota2);
}



private void sembunyikanKolomID(javax.swing.JTable table) {
    table.getColumnModel().getColumn(0).setMinWidth(0);
    table.getColumnModel().getColumn(0).setMaxWidth(0);
    table.getColumnModel().getColumn(0).setWidth(0);
}
    
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
            java.util.logging.Logger.getLogger(AnggotaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnggotaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnggotaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnggotaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnggotaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pending;
    private javax.swing.JTable bukuAnggota;
    private javax.swing.JTable bukuAnggota2;
    private javax.swing.JLabel jLabel566;
    private javax.swing.JLabel jLabel567;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
