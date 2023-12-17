/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package my_package;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import models.Book;

/**
 *
 * @author AL AHLAWY
 */
public class cardLayoutPanel extends javax.swing.JPanel {

    Book book;
    /**
     * Creates new form cardLayoutPanel
     */
    public cardLayoutPanel(Book book) {
        initComponents();
        this.book = book;
        Icon i = img.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(80, 100, Image.SCALE_SMOOTH);
        img.setIcon(new ImageIcon(image));
        name.setText(book.title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        name = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        more_details = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(243, 238, 234));
        setLayout(new java.awt.BorderLayout());

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(119, 107, 93));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("book");
        add(name, java.awt.BorderLayout.PAGE_START);

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_package/imgs/pngegg.png"))); // NOI18N
        img.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        img.setMaximumSize(new java.awt.Dimension(140, 160));
        img.setMinimumSize(new java.awt.Dimension(60, 80));
        add(img, java.awt.BorderLayout.CENTER);

        more_details.setBackground(new java.awt.Color(243, 238, 234));
        more_details.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        more_details.setForeground(new java.awt.Color(119, 107, 93));
        more_details.setText("more details");
        more_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        more_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                more_detailsActionPerformed(evt);
            }
        });
        add(more_details, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void more_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_more_detailsActionPerformed
        book_details obj = new book_details(book);
        obj.show();
    }//GEN-LAST:event_more_detailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JButton more_details;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
