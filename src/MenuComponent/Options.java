/* Team ID: 7
Name: HUYNH TRUC QUYEN
ID: ITDSIU19051
*/

package MenuComponent;

import java.awt.*;
import GUI.*;

/**
 * @author Truc Quyen
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    public Options() {
        initComponents();
        setTitle("Othello");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Parameter.logo));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        brownJButton = new javax.swing.JButton();
        stoneJButton = new javax.swing.JButton();
        greenJButton = new javax.swing.JButton();
        yellowJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 211, 211));

        brownJButton.setBackground(new java.awt.Color(255, 185, 185));
        brownJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        brownJButton.setForeground(new java.awt.Color(172, 88, 101));
        brownJButton.setText("Brown");
        brownJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownJButtonActionPerformed(evt);
            }
        });

        stoneJButton.setBackground(new java.awt.Color(255, 185, 185));
        stoneJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stoneJButton.setForeground(new java.awt.Color(172, 88, 101));
        stoneJButton.setText("Stone");
        stoneJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneJButtonActionPerformed(evt);
            }
        });

        greenJButton.setBackground(new java.awt.Color(255, 185, 185));
        greenJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        greenJButton.setForeground(new java.awt.Color(172, 88, 101));
        greenJButton.setText("Green");
        greenJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenJButtonActionPerformed(evt);
            }
        });

        yellowJButton.setBackground(new java.awt.Color(255, 185, 185));
        yellowJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yellowJButton.setForeground(new java.awt.Color(172, 88, 101));
        yellowJButton.setText("Yellow");
        yellowJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowJButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(Parameter.image + "\\brownBoard.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(Parameter.image + "\\stoneBoard.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(Parameter.image + "\\greenBoard.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(Parameter.image + "\\board.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(
                                jPanel1Layout.createSequentialGroup().addGap(153, 153, 153).addComponent(brownJButton))
                        .addGroup(
                                jPanel1Layout.createSequentialGroup().addGap(152, 152, 152).addComponent(greenJButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addComponent(stoneJButton).addGap(151, 151,
                                                151))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                        .createSequentialGroup().addComponent(yellowJButton).addGap(151, 151, 151))))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(brownJButton).addComponent(stoneJButton))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yellowJButton))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(greenJButton)))
                        .addContainerGap(38, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brownJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_brownJButtonActionPerformed
        // TODO add your handling code here:
        Parameter.board = Parameter.brownBoard;
        dispose();

    }// GEN-LAST:event_brownJButtonActionPerformed

    private void stoneJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_stoneJButtonActionPerformed
        // TODO add your handling code here:
        Parameter.board = Parameter.stoneBoard;
        dispose();
    }// GEN-LAST:event_stoneJButtonActionPerformed

    private void greenJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_greenJButtonActionPerformed
        // TODO add your handling code here:
        Parameter.board = Parameter.greenBoard;
        dispose();
    }// GEN-LAST:event_greenJButtonActionPerformed

    private void yellowJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_yellowJButtonActionPerformed
        // TODO add your handling code here:
        Parameter.board = Parameter.defaultBoard;
        dispose();
    }// GEN-LAST:event_yellowJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brownJButton;
    private javax.swing.JButton stoneJButton;
    private javax.swing.JButton greenJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton yellowJButton;
    // End of variables declaration//GEN-END:variables
}
