
package movieticketingbookingsystem;
import java.awt.Color;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SeatReservation extends javax.swing.JFrame {
		private String Data;
		private int Scount = 0;
		private int Gcount = 0;
		private int Pcount = 0;
		private int SilverPrice = 0;
		private int GoldPrice = 0;
		private int PlatinumPrice = 0;
		private int TotalData = 0;
	
	public SeatReservation() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		colorpanel();
		
	}
	public void colorpanel(){
		transparentPanel.setBackground(new Color(0,126,83,90));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDisplayNumber = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        transparentPanel = new javax.swing.JPanel();
        S2 = new javax.swing.JToggleButton();
        G1 = new javax.swing.JToggleButton();
        P2 = new javax.swing.JToggleButton();
        silver = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        platinum = new javax.swing.JLabel();
        S1 = new javax.swing.JToggleButton();
        S3 = new javax.swing.JToggleButton();
        S4 = new javax.swing.JToggleButton();
        S8 = new javax.swing.JToggleButton();
        S7 = new javax.swing.JToggleButton();
        S6 = new javax.swing.JToggleButton();
        S5 = new javax.swing.JToggleButton();
        S10 = new javax.swing.JToggleButton();
        S9 = new javax.swing.JToggleButton();
        G2 = new javax.swing.JToggleButton();
        G3 = new javax.swing.JToggleButton();
        G4 = new javax.swing.JToggleButton();
        G6 = new javax.swing.JToggleButton();
        G5 = new javax.swing.JToggleButton();
        G10 = new javax.swing.JToggleButton();
        G9 = new javax.swing.JToggleButton();
        G8 = new javax.swing.JToggleButton();
        G7 = new javax.swing.JToggleButton();
        P1 = new javax.swing.JToggleButton();
        P3 = new javax.swing.JToggleButton();
        P4 = new javax.swing.JToggleButton();
        P5 = new javax.swing.JToggleButton();
        P6 = new javax.swing.JToggleButton();
        P10 = new javax.swing.JToggleButton();
        P9 = new javax.swing.JToggleButton();
        P8 = new javax.swing.JToggleButton();
        P7 = new javax.swing.JToggleButton();
        Add = new javax.swing.JButton();
        buy = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        screen = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        back12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(820, 478));
        setMinimumSize(new java.awt.Dimension(820, 478));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 478));
        setSize(new java.awt.Dimension(820, 478));
        getContentPane().setLayout(null);

        panelDisplayNumber.setBackground(new java.awt.Color(12, 8, 0));

        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelDisplayNumberLayout = new javax.swing.GroupLayout(panelDisplayNumber);
        panelDisplayNumber.setLayout(panelDisplayNumberLayout);
        panelDisplayNumberLayout.setHorizontalGroup(
            panelDisplayNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisplayNumberLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        panelDisplayNumberLayout.setVerticalGroup(
            panelDisplayNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(panelDisplayNumber);
        panelDisplayNumber.setBounds(60, 180, 610, 40);

        transparentPanel.setBackground(new java.awt.Color(102, 176, 50));

        S2.setBackground(new java.awt.Color(209, 209, 209));
        S2.setText("S2 ");
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        G1.setBackground(new java.awt.Color(235, 207, 84));
        G1.setText("G1 ");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        P2.setBackground(new java.awt.Color(228, 0, 125));
        P2.setText("P2 ");
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });

        silver.setBackground(new java.awt.Color(2, 71, 254));
        silver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        silver.setForeground(new java.awt.Color(254, 254, 51));
        silver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        silver.setText("SILVER P150");

        gold.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gold.setForeground(new java.awt.Color(254, 254, 51));
        gold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gold.setText("PLATINUM P250");

        platinum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        platinum.setForeground(new java.awt.Color(254, 254, 51));
        platinum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        platinum.setText("GOLD P200");

        S1.setBackground(new java.awt.Color(209, 209, 209));
        S1.setText("S1 ");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S3.setBackground(new java.awt.Color(209, 209, 209));
        S3.setText("S3 ");
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        S4.setBackground(new java.awt.Color(209, 209, 209));
        S4.setText("S4 ");
        S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S4ActionPerformed(evt);
            }
        });

        S8.setBackground(new java.awt.Color(209, 209, 209));
        S8.setText("S8 ");
        S8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S8ActionPerformed(evt);
            }
        });

        S7.setBackground(new java.awt.Color(209, 209, 209));
        S7.setText("S7 ");
        S7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S7ActionPerformed(evt);
            }
        });

        S6.setBackground(new java.awt.Color(209, 209, 209));
        S6.setText("S6 ");
        S6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S6ActionPerformed(evt);
            }
        });

        S5.setBackground(new java.awt.Color(209, 209, 209));
        S5.setText("S5 ");
        S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S5ActionPerformed(evt);
            }
        });

        S10.setBackground(new java.awt.Color(209, 209, 209));
        S10.setText("S10 ");
        S10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S10ActionPerformed(evt);
            }
        });

        S9.setBackground(new java.awt.Color(209, 209, 209));
        S9.setText("S9 ");
        S9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S9ActionPerformed(evt);
            }
        });

        G2.setBackground(new java.awt.Color(235, 207, 84));
        G2.setText("G2 ");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G3.setBackground(new java.awt.Color(235, 207, 84));
        G3.setText("G3 ");
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G4.setBackground(new java.awt.Color(235, 207, 84));
        G4.setText("G4 ");
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        G6.setBackground(new java.awt.Color(235, 207, 84));
        G6.setText("G6");
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });

        G5.setBackground(new java.awt.Color(235, 207, 84));
        G5.setText("G5 ");
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        G10.setBackground(new java.awt.Color(235, 207, 84));
        G10.setText("G10");
        G10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G10ActionPerformed(evt);
            }
        });

        G9.setBackground(new java.awt.Color(235, 207, 84));
        G9.setText("G9");
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });

        G8.setBackground(new java.awt.Color(235, 207, 84));
        G8.setText("G8");
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });

        G7.setBackground(new java.awt.Color(235, 207, 84));
        G7.setText("G7");
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });

        P1.setBackground(new java.awt.Color(228, 0, 125));
        P1.setText("P1 ");
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        P3.setBackground(new java.awt.Color(228, 0, 125));
        P3.setText("P3 ");
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });

        P4.setBackground(new java.awt.Color(228, 0, 125));
        P4.setText("P4 ");
        P4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4ActionPerformed(evt);
            }
        });

        P5.setBackground(new java.awt.Color(228, 0, 125));
        P5.setText("P5 ");
        P5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5ActionPerformed(evt);
            }
        });

        P6.setBackground(new java.awt.Color(228, 0, 125));
        P6.setText("P6 ");
        P6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P6ActionPerformed(evt);
            }
        });

        P10.setBackground(new java.awt.Color(228, 0, 125));
        P10.setText("P10 ");
        P10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P10ActionPerformed(evt);
            }
        });

        P9.setBackground(new java.awt.Color(228, 0, 125));
        P9.setText("P9 ");
        P9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P9ActionPerformed(evt);
            }
        });

        P8.setBackground(new java.awt.Color(228, 0, 125));
        P8.setText("P8 ");
        P8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P8ActionPerformed(evt);
            }
        });

        P7.setBackground(new java.awt.Color(228, 0, 125));
        P7.setText("P7 ");
        P7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparentPanelLayout = new javax.swing.GroupLayout(transparentPanel);
        transparentPanel.setLayout(transparentPanelLayout);
        transparentPanelLayout.setHorizontalGroup(
            transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparentPanelLayout.createSequentialGroup()
                .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transparentPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addComponent(gold, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transparentPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(S7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(transparentPanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(silver, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(transparentPanelLayout.createSequentialGroup()
                                .addComponent(platinum, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))))
                .addGap(50, 50, 50))
        );
        transparentPanelLayout.setVerticalGroup(
            transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(silver, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(platinum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gold, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transparentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        getContentPane().add(transparentPanel);
        transparentPanel.setBounds(30, 220, 680, 240);

        Add.setBackground(new java.awt.Color(52, 73, 94));
        Add.setForeground(new java.awt.Color(236, 240, 241));
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(720, 380, 80, 40);

        buy.setBackground(new java.awt.Color(229, 9, 19));
        buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buy.setForeground(new java.awt.Color(255, 255, 255));
        buy.setText("PRINT");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy);
        buy.setBounds(720, 430, 80, 40);

        home1.setBackground(new java.awt.Color(52, 73, 94));
        home1.setForeground(new java.awt.Color(236, 240, 241));
        home1.setText("HOME");
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        getContentPane().add(home1);
        home1.setBounds(720, 60, 90, 40);

        screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/screen.png"))); // NOI18N
        getContentPane().add(screen);
        screen.setBounds(60, 50, 610, 130);

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background8.png"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(0, 0, 820, 48);

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(770, 0, 50, 50);

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(710, 0, 50, 50);

        back12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background10.jpg"))); // NOI18N
        getContentPane().add(back12);
        back12.setBounds(0, 50, 1280, 431);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
    
	try {
			FileWriter writer = new FileWriter("C:\\Users\\vanzkie\\Documents\\NetBeansProjects\\movieticketingbookingsystem\\src\\movieticketingbookingsystem\\forprint\\print.txt", true);
			writer.write("SEATS:");
			//Silver write
			if(S1.isSelected()){
			writer.write(" S1,");
			

			
			}if(S2.isSelected()){
			writer.write(" S2,");
		
			} if(S3.isSelected()){
		    writer.write(" S3,");
			
			}
			if(S4.isSelected()){
		    writer.write(" S4,");
			
			}
			if(S5.isSelected()){
		    writer.write(" S5,");
		
			}
			if(S6.isSelected()){
		    writer.write(" S6,");
			
			}
			if(S7.isSelected()){
		    writer.write(" S7,");
			
			}
			if(S8.isSelected()){
		    writer.write(" S8,");
		
			}
			if(S9.isSelected()){
		    writer.write(" S9,");
		
			}
			if(S10.isSelected()){
		    writer.write(" S10,");
			
			}
			//Gold write
		    if(G1.isSelected()){
			writer.write(" G1,");
		
			
			}if(G2.isSelected()){
			writer.write(" G2,");
		
			} if(G3.isSelected()){
		    writer.write(" G3,");
			
			}
			if(G4.isSelected()){
		    writer.write(" G4,");
		
			}
			if(G5.isSelected()){
		    writer.write(" G5,");
			
			}
			if(G6.isSelected()){
		    writer.write(" G6,");
		
			}
			if(G7.isSelected()){
		    writer.write(" G7,");
		
			}
			if(G8.isSelected()){
		    writer.write(" G8,");
			
			}
			if(G9.isSelected()){
		    writer.write(" G9,");
		
			}
			if(G10.isSelected()){
		    writer.write(" G10,");
		
			}
			//PLATINUM WRITE
		    if(P1.isSelected()){
			writer.write(" P1,");
		
			
			}if(P2.isSelected()){
			writer.write(" P2,");
		
			} if(P3.isSelected()){
		    writer.write(" P3,");
		
			}
			if(P4.isSelected()){
		    writer.write(" P4,");
		
			}
			if(P5.isSelected()){
		    writer.write(" P5,");
			}
			
			if(P6.isSelected()){
		    writer.write(" P6,");
		
			}
			if(P7.isSelected()){
		    writer.write(" P7,");
			
			}
			if(P8.isSelected()){
		    writer.write(" P8,");
	
			}
			if(P9.isSelected()){
		    writer.write(" P9,");
		
			}
			if(P10.isSelected()){
		    writer.write(" P10,");
	
			}
			int price1 = 150;
			int price2 = 200;
			int price3 = 250;
			SilverPrice = Scount*price1;
			GoldPrice =  Gcount *price2;
			PlatinumPrice = Pcount*price2;
			
			
			TotalData = (SilverPrice+GoldPrice)+PlatinumPrice;
			

	        String convert = Integer.toString(TotalData);
			writer.write(System.getProperty("line.separator"));
			writer.write("Total Amount: ");
			writer.write(convert);
			
			writer.close();
			JOptionPane.showMessageDialog(rootPane, "Success!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "Fail!");

		}
    }//GEN-LAST:event_AddActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
	Print print = new Print();
	print.setLocationRelativeTo(null);
	print.setVisible(true);
	pack();
	dispose(); 
		
	

    }//GEN-LAST:event_buyActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
		Main call = new Main();
		call.setVisible(true);
		call.setLocationRelativeTo(null);
		call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		dispose();    
    }//GEN-LAST:event_home1ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void P7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P7ActionPerformed

        String data;
        if (P7.isSelected()){
            data =  P7.getText();
            display.setText(data);
			
            P7.setBackground(Color.yellow);
			Pcount++;
			
			
        }
	
		else{
            P7.setBackground(new Color(228,0,125,100));

            display.setText("");
			Pcount--;
        }
    }//GEN-LAST:event_P7ActionPerformed

    private void P8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P8ActionPerformed

        String data;
        if (P8.isSelected()){
            data =  P8.getText();
            display.setText(data);
            P8.setBackground(Color.yellow);
			Pcount++;
        }else{
            P8.setBackground(new Color(228,0,125,100));

            display.setText("");
			Pcount--;
        }
    }//GEN-LAST:event_P8ActionPerformed

    private void P9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P9ActionPerformed

        String data;
        if (P9.isSelected()){
            data =  P9.getText();
            display.setText(data);
            P9.setBackground(Color.yellow);
			Pcount++;
        }else{
            P9.setBackground(new Color(228,0,125,100));

            display.setText("");
				Pcount--;
        }
    }//GEN-LAST:event_P9ActionPerformed

    private void P10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P10ActionPerformed

        String data;
        if (P10.isSelected()){
            data =  P10.getText();
            display.setText(data);
            P10.setBackground(Color.yellow);
			Pcount++;
        }else{
            P10.setBackground(new Color(228,0,125,100));
	
            display.setText("");
			Pcount--;
        }
    }//GEN-LAST:event_P10ActionPerformed

    private void P6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P6ActionPerformed

        String data;
        if (P6.isSelected()){
            data =  P6.getText();
            display.setText(data);
            P6.setBackground(Color.yellow);
				Pcount++;
        }else{
            P6.setBackground(new Color(228,0,125,100));

            display.setText("");
				Pcount--;
        }
    }//GEN-LAST:event_P6ActionPerformed

    private void P5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5ActionPerformed

        String data;
        if (P5.isSelected()){
            data =  P5.getText();
            display.setText(data);
            P5.setBackground(Color.yellow);
				Pcount++;
        }else{
            P5.setBackground(new Color(228,0,125,100));

            display.setText("");
				Pcount--;
        }
    }//GEN-LAST:event_P5ActionPerformed

    private void P4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4ActionPerformed

        String data;
        if (P4.isSelected()){
            data =  P4.getText();
            display.setText(data);
            P4.setBackground(Color.yellow);
				Pcount++;
        }else{
            P4.setBackground(new Color(228,0,125,100));

            display.setText("");
				Pcount--;
        }
    }//GEN-LAST:event_P4ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed

        String data;
        if (P3.isSelected()){
            data =  P3.getText();
            display.setText(data);
            P3.setBackground(Color.yellow);
				Pcount++;
        }else{
            P3.setBackground(new Color(228,0,125,100));

            display.setText("");
				Pcount--;
        }
    }//GEN-LAST:event_P3ActionPerformed

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed

        String data;
        if (P1.isSelected()){
            data =  P1.getText();
            display.setText(data);
            P1.setBackground(Color.yellow);
				Pcount++;
        }else{
            P1.setBackground(new Color(228,0,125,100));

            display.setText("");
				Pcount--;
        }
    }//GEN-LAST:event_P1ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed

        String data;
        if (G7.isSelected()){
            data =  G7.getText();
            display.setText(data);
            G7.setBackground(Color.yellow);
				Gcount++;
        }else{
            G7.setBackground(new Color(235,207,84,100));

            display.setText("");
				Gcount--;
        }
    }//GEN-LAST:event_G7ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed

        String data;
        if (G8.isSelected()){
            data =  G8.getText();
            display.setText(data);
            G8.setBackground(Color.yellow);
				Gcount++;
        }else{
            G8.setBackground(new Color(235,207,84,100));

            display.setText("");
				Gcount--;
        }
    }//GEN-LAST:event_G8ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed

        String data;
        if (G9.isSelected()){
            data =  G9.getText();
            display.setText(data);
            G9.setBackground(Color.yellow);
				Gcount++;
        }else{
            G9.setBackground(new Color(235,207,84,100));

            display.setText("");
				Gcount--;
        }
    }//GEN-LAST:event_G9ActionPerformed

    private void G10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G10ActionPerformed

        String data;
        if (G10.isSelected()){
            data =  G10.getText();
            display.setText(data);
            G10.setBackground(Color.yellow);
				Gcount++;
        }else{
            G10.setBackground(new Color(235,207,84,100));

            display.setText("");
				Gcount--;
        }
    }//GEN-LAST:event_G10ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed

        String data;
        if (G5.isSelected()){
            data =  G5.getText();
            display.setText(data);
            G5.setBackground(Color.yellow);
				Gcount++;
        }else{
            G5.setBackground(new Color(235,207,84,100));

            display.setText("");
			Gcount--;
        }
		
    }//GEN-LAST:event_G5ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed

        String data;
        if (G6.isSelected()){
            data =  G6.getText();
            display.setText(data);
            G6.setBackground(Color.yellow);
			Gcount++;
        }else{
            G6.setBackground(new Color(235,207,84,100));

            display.setText("");
			Gcount--;
        }
    }//GEN-LAST:event_G6ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed

        String data;
        if (G4.isSelected()){
            data =  G4.getText();
            display.setText(data);
            G4.setBackground(Color.yellow);
			Gcount++;
        }else{
            G4.setBackground(new Color(235,207,84,100));

            display.setText("");
			Gcount--;
        }
    }//GEN-LAST:event_G4ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed

        String data;
        if (G3.isSelected()){
            data =  G3.getText();
            display.setText(data);
            G3.setBackground(Color.yellow);
			Gcount++;
        }else{
            G3.setBackground(new Color(235,207,84,100));

            display.setText("");
			Gcount--;
        }
    }//GEN-LAST:event_G3ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed

        String data;
        if (G2.isSelected()){
            data =  G2.getText();
            display.setText(data);
            G2.setBackground(Color.yellow);
			Gcount++;
        }else{
            G2.setBackground(new Color(235,207,84,100));

            display.setText("");
			Gcount--;
        }
    }//GEN-LAST:event_G2ActionPerformed

    private void S9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S9ActionPerformed

        String data;
        if (S9.isSelected()){
            data =  S9.getText();
            display.setText(data);
            S9.setBackground(Color.yellow);
			Scount++;
        }else{
            S9.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S9ActionPerformed

    private void S10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S10ActionPerformed

        String data;
        if (S10.isSelected()){
            data =  S10.getText();
            display.setText(data);
            S10.setBackground(Color.yellow);
			Scount++;
        }else{
            S10.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S10ActionPerformed

    private void S5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S5ActionPerformed

        String data;
        if (S5.isSelected()){
            data =  S5.getText();
            display.setText(data);
            S5.setBackground(Color.yellow);
			Scount++;
        }else{
            S5.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S5ActionPerformed

    private void S6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S6ActionPerformed

        String data;
        if (S6.isSelected()){
            data =  S6.getText();
            display.setText(data);
            S6.setBackground(Color.yellow);
			Scount++;
        }else{
			
            S6.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S6ActionPerformed

    private void S7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S7ActionPerformed

        String data;
        if (S7.isSelected()){
            data =  S7.getText();
            display.setText(data);
            S7.setBackground(Color.yellow);
			Scount++;
        }else{
            S7.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S7ActionPerformed

    private void S8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S8ActionPerformed

        String data;
        if (S8.isSelected()){
            data =  S8.getText();
            display.setText(data);
            S8.setBackground(Color.yellow);
			Scount++;
        }else{
            S8.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S8ActionPerformed

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S4ActionPerformed

        String data;
        if (S4.isSelected()){
            data =  S4.getText();
            display.setText(data);
            S4.setBackground(Color.yellow);
			Scount++;
        }else{
            S4.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S4ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed

        String data;
        if (S3.isSelected()){
            data =  S3.getText();
            display.setText(data);
            S3.setBackground(Color.yellow);
			Scount++;
        }else{
            S3.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S3ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        String data;
        if (S1.isSelected()){
            data =  S1.getText();
            display.setText(data);

            S1.setBackground(Color.yellow);
			Scount++;

        }else{
            S1.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;

        }
    }//GEN-LAST:event_S1ActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed

        String data;
        if (P2.isSelected()){
            data =  P2.getText();
            display.setText(data);
            P2.setBackground(Color.yellow);
			Pcount++;
        }else{
            P2.setBackground(new Color(228,0,125,100));

            display.setText("");
			Pcount--;
        }
    }//GEN-LAST:event_P2ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed

        String data;
        if (G1.isSelected()){
            data =  G1.getText();
            display.setText(data);
            G1.setBackground(Color.yellow);
			Gcount++;
        }else{
            G1.setBackground(new Color(235,207,84,100));

            display.setText("");
			Gcount--;
        }
    }//GEN-LAST:event_G1ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed

        String data;
        if (S2.isSelected()){
            data =  S2.getText();
            display.setText(data);
            S2.setBackground(Color.yellow);
			Scount++;
        }else{
            S2.setBackground(new Color(209,209,209,100));

            display.setText("");
			Scount--;
        }
    }//GEN-LAST:event_S2ActionPerformed

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
			java.util.logging.Logger.getLogger(SeatReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SeatReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SeatReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SeatReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SeatReservation().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JToggleButton G1;
    private javax.swing.JToggleButton G10;
    private javax.swing.JToggleButton G2;
    private javax.swing.JToggleButton G3;
    private javax.swing.JToggleButton G4;
    private javax.swing.JToggleButton G5;
    private javax.swing.JToggleButton G6;
    private javax.swing.JToggleButton G7;
    private javax.swing.JToggleButton G8;
    private javax.swing.JToggleButton G9;
    private javax.swing.JToggleButton P1;
    private javax.swing.JToggleButton P10;
    private javax.swing.JToggleButton P2;
    private javax.swing.JToggleButton P3;
    private javax.swing.JToggleButton P4;
    private javax.swing.JToggleButton P5;
    private javax.swing.JToggleButton P6;
    private javax.swing.JToggleButton P7;
    private javax.swing.JToggleButton P8;
    private javax.swing.JToggleButton P9;
    private javax.swing.JToggleButton S1;
    private javax.swing.JToggleButton S10;
    private javax.swing.JToggleButton S2;
    private javax.swing.JToggleButton S3;
    private javax.swing.JToggleButton S4;
    private javax.swing.JToggleButton S5;
    private javax.swing.JToggleButton S6;
    private javax.swing.JToggleButton S7;
    private javax.swing.JToggleButton S8;
    private javax.swing.JToggleButton S9;
    private javax.swing.JLabel back12;
    private javax.swing.JButton buy;
    private javax.swing.JTextField display;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel gold;
    private javax.swing.JLabel header;
    private javax.swing.JButton home1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel panelDisplayNumber;
    private javax.swing.JLabel platinum;
    private javax.swing.JLabel screen;
    private javax.swing.JLabel silver;
    private javax.swing.JPanel transparentPanel;
    // End of variables declaration//GEN-END:variables
}
