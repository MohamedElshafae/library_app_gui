
package my_package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import api.BookController;
import java.util.List;
import models.Book;
/**
 *
 * @author AL AHLAWY
 */
public class landingPage extends javax.swing.JFrame {

    /**
     * Creates new form landingPage
     */
    public landingPage() {

        initComponents();

        
        BookController obj = new BookController();
        List<Book> book_arr = obj.getAllBooks();
        System.out.print(book_arr);
        if (book_arr != null) {
            for (int i = 0; i < book_arr.size(); i++) {
                cardLayoutPanel j = new cardLayoutPanel(book_arr.get(i));
                jmyBooks.add(j);
            }
        }
        //make the icon strech
        Icon i = img.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        img.setIcon(new ImageIcon(image));

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jhome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        HomeButtom = new javax.swing.JLabel();
        booksButton = new javax.swing.JLabel();
        myProfileButton = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jmyBooks = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 51, 0));
        setForeground(java.awt.Color.magenta);
        setName("landingPage"); // NOI18N

        jhome.setBackground(new java.awt.Color(243, 238, 234));
        jhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 107, 93));

        HomeButtom.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        HomeButtom.setForeground(new java.awt.Color(255, 255, 255));
        HomeButtom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeButtom.setText("Home");
        HomeButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtomMouseClicked(evt);
            }
        });

        booksButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        booksButton.setForeground(new java.awt.Color(255, 255, 255));
        booksButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        booksButton.setText("My Books");
        booksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksButtonMouseClicked(evt);
            }
        });

        myProfileButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        myProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        myProfileButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myProfileButton.setText("My Profile");
        myProfileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("user");
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        img.setBackground(new java.awt.Color(119, 107, 93));
        img.setFont(new java.awt.Font("SansSerif", 0, 5)); // NOI18N
        img.setForeground(new java.awt.Color(119, 107, 93));
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_package/imgs/pngegg.png"))); // NOI18N
        img.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myProfileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(booksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(myProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );

        jhome.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 666));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jmyBooks.setBackground(new java.awt.Color(243, 238, 234));
        jmyBooks.setLayout(new java.awt.GridLayout(5, 10, 1, 1));
        jTabbedPane1.addTab("tab1", jmyBooks);

        jPanel4.setBackground(new java.awt.Color(243, 238, 234));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        jhome.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jhome, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_myProfileButtonMouseClicked

    private void booksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksButtonMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_booksButtonMouseClicked

    private void HomeButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtomMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_HomeButtomMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login obj = new Login();
        hide();
        obj.show();
    }//GEN-LAST:event_logoutMouseClicked

    /**
     * u
     *
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
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeButtom;
    private javax.swing.JLabel booksButton;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jhome;
    private javax.swing.JPanel jmyBooks;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel myProfileButton;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
