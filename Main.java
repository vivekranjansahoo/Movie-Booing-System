package movieticketingbookingsystem;

import AppPackage.AnimationClass;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    AnimationClass AC = new AnimationClass();

    public Main() {

        initComponents();
        SlideShow();

        this.setLocationRelativeTo(null);
    }

    public void SlideShow() {
        new Thread() {

            int count = 0;

            @Override
            public void run() {
                try {
                    while(true){
                    
                        switch (count) {

                            case 0:
                                ImageIcon II = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background1.png"));
                                backgroundSlide1.setIcon(II);    
                                Thread.sleep(3200);
                                AC.jLabelXLeft(0, -820, 20, 10, backgroundSlide1);
                                AC.jLabelXLeft(820, 0, 20, 10, backgroundSlide2);
                                count = 1;
                                break;
                            case 1:
                                ImageIcon II2 = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background2.png"));
                                backgroundSlide2.setIcon(II2); 
                                Thread.sleep(3200);
                                AC.jLabelXRight(-820, 0, 20, 10, backgroundSlide1);
                                AC.jLabelXRight(0, 820, 20, 10, backgroundSlide2);
                                count = 2;
                                break;
                            case 2:
                                ImageIcon II3 = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background3.png"));
                                backgroundSlide1.setIcon(II3); 

                                Thread.sleep(3200);
                                AC.jLabelXLeft(0, -820, 20, 10, backgroundSlide1);
                                AC.jLabelXLeft(820, 0, 20, 10, backgroundSlide2);
                                count = 3;
                                break;
                            case 3:
                            ImageIcon II4 = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background4.png"));
                                backgroundSlide2.setIcon(II4); 
                                Thread.sleep(3200);
                                AC.jLabelXRight(-820, 0, 20, 10, backgroundSlide1);
                                AC.jLabelXRight(0, 820, 20, 10, backgroundSlide2);
                                count = 4;
                                break;
                            case 4:
                            ImageIcon II5 = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background5.png"));
                                backgroundSlide1.setIcon(II5); 

                                Thread.sleep(3200);
                                AC.jLabelXLeft(0, -820,20, 10, backgroundSlide1);
                                AC.jLabelXLeft(820, 0, 20, 10, backgroundSlide2);
                                count = 5;
                                break;
                            case 5:
                            ImageIcon II6 = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background6.png"));
                                backgroundSlide2.setIcon(II6); 
                                Thread.sleep(3200);
                                AC.jLabelXRight(-820, 0, 20, 10, backgroundSlide1);
                                AC.jLabelXRight(0, 820, 20, 10, backgroundSlide2);
                                count = 0;
                                break;
                                
                        }
                    }
                } catch (Exception e)
                {

                }
                
            }
        }.start();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        buy = new javax.swing.JButton();
        backgroundSlide1 = new javax.swing.JLabel();
        backgroundSlide2 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        header = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 478));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 478));
        getContentPane().setLayout(null);

        buy.setBackground(new java.awt.Color(229, 9, 19));
        buy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buy.setForeground(new java.awt.Color(255, 255, 255));
        buy.setText("BUY TICKETS NOW");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy);
        buy.setBounds(580, 410, 230, 40);

        backgroundSlide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background1.png"))); // NOI18N
        backgroundSlide1.setText("\n");
        getContentPane().add(backgroundSlide1);
        backgroundSlide1.setBounds(0, 48, 820, 430);

        backgroundSlide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background2.png"))); // NOI18N
        getContentPane().add(backgroundSlide2);
        backgroundSlide2.setBounds(820, 48, 820, 430);

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(710, 0, 50, 50);

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(770, 0, 50, 50);

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background8.png"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(0, 0, 820, 48);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
     loginform call = new loginform();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_buyActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
     System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
     setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundSlide1;
    private javax.swing.JLabel backgroundSlide2;
    private javax.swing.JButton buy;
    private javax.swing.JLabel exit;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel header;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
