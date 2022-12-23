package movieticketingbookingsystem;

import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class loginform extends javax.swing.JFrame {
	
   

	private Scanner text;
	

	public loginform() {

		initComponents();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPanelSlider1.setBackground(new Color(0,0,0,0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel1 = new javax.swing.JPanel();
        fillups = new javax.swing.JButton();
        textuser = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        textpass = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        home = new javax.swing.JButton();
        login = new javax.swing.JButton();
        imagelogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        admin = new javax.swing.JButton();
        homeform = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        IDfield = new javax.swing.JTextField();
        firstnamefeild = new javax.swing.JTextField();
        firstnametext = new javax.swing.JLabel();
        lastnamefeild = new javax.swing.JTextField();
        lastnametext = new javax.swing.JLabel();
        usertext = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        passtext = new javax.swing.JLabel();
        agetext = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        fillup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInformation = new javax.swing.JTable();
        DisplayData = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        nickname = new javax.swing.JTextField();
        MovieSelection = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        header = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 478));
        setUndecorated(true);

        jPanelSlider1.setBackground(new java.awt.Color(51, 204, 255));

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

        fillups.setBackground(new java.awt.Color(52, 73, 94));
        fillups.setForeground(new java.awt.Color(236, 240, 241));
        fillups.setText("FILL UP FORM");
        fillups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillupsActionPerformed(evt);
            }
        });

        textuser.setBackground(new java.awt.Color(236, 240, 241));
        textuser.setForeground(new java.awt.Color(236, 240, 241));
        textuser.setText("USERNAME: (admin)");

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        textpass.setBackground(new java.awt.Color(236, 240, 241));
        textpass.setForeground(new java.awt.Color(236, 240, 241));
        textpass.setText("PASSWORD: (test)");

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        home.setBackground(new java.awt.Color(52, 73, 94));
        home.setForeground(new java.awt.Color(236, 240, 241));
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(52, 73, 94));
        login.setForeground(new java.awt.Color(236, 240, 241));
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        imagelogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/logoMovie.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pass)
                            .addComponent(textpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textuser, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fillups, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fillups, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textuser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imagelogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanelSlider1.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(1, 50, 67));
        jPanel2.setForeground(new java.awt.Color(236, 240, 241));

        admin.setBackground(new java.awt.Color(52, 73, 94));
        admin.setForeground(new java.awt.Color(236, 240, 241));
        admin.setText("ADMIN LOGIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        homeform.setBackground(new java.awt.Color(52, 73, 94));
        homeform.setForeground(new java.awt.Color(236, 240, 241));
        homeform.setText("HOME");
        homeform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeformActionPerformed(evt);
            }
        });

        id.setForeground(new java.awt.Color(236, 240, 241));
        id.setText("ID:");

        IDfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        firstnamefeild.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        firstnametext.setForeground(new java.awt.Color(236, 240, 241));
        firstnametext.setText("FIRSTNAME:");

        lastnamefeild.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lastnametext.setForeground(new java.awt.Color(236, 240, 241));
        lastnametext.setText("LASTNAME:");

        usertext.setForeground(new java.awt.Color(236, 240, 241));
        usertext.setText("NICKNAME:");

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        passtext.setForeground(new java.awt.Color(236, 240, 241));
        passtext.setText("ADDRESS:");

        agetext.setForeground(new java.awt.Color(236, 240, 241));
        agetext.setText("AGE:");

        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fillup.setBackground(new java.awt.Color(52, 73, 94));
        fillup.setForeground(new java.awt.Color(236, 240, 241));
        fillup.setText("FILL UP");
        fillup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillupActionPerformed(evt);
            }
        });

        TableInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableInformation);

        DisplayData.setBackground(new java.awt.Color(52, 73, 94));
        DisplayData.setForeground(new java.awt.Color(236, 240, 241));
        DisplayData.setText("Display Data");
        DisplayData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayDataActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(52, 73, 94));
        clear.setForeground(new java.awt.Color(236, 240, 241));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        nickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MovieSelection.setBackground(new java.awt.Color(52, 73, 94));
        MovieSelection.setForeground(new java.awt.Color(236, 240, 241));
        MovieSelection.setText("Movie Selection");
        MovieSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieSelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstnamefeild)
                                    .addComponent(IDfield)
                                    .addComponent(lastnamefeild, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nickname, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(address)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passtext, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usertext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(agetext, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(age)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(homeform, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fillup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MovieSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeform, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstnametext))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usertext)
                                .addGap(51, 51, 51)
                                .addComponent(passtext)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstnamefeild, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastnametext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastnamefeild, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(agetext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fillup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisplayData, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MovieSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelSlider1.add(jPanel2, "card3");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/bg.png"))); // NOI18N

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background8.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(header)
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
		jPanelSlider1.nextPanel(40, jPanel1, jPanelSlider1.right);
    }//GEN-LAST:event_adminActionPerformed

    private void fillupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillupsActionPerformed
		jPanelSlider1.nextPanel(40, jPanel2, jPanelSlider1.left);
    }//GEN-LAST:event_fillupsActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
		Main call = new Main();
		call.setVisible(true);
		call.setLocationRelativeTo(null);
		call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		dispose();


    }//GEN-LAST:event_homeActionPerformed

    private void homeformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeformActionPerformed
		Main call = new Main();
		call.setVisible(true);
		call.setLocationRelativeTo(null);
		call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		dispose();
    }//GEN-LAST:event_homeformActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
		String username = user.getText();
		String password = pass.getText();
		
		if(username.contains("admin") && password.contains("test")){ 
			JOptionPane.showMessageDialog(rootPane, "Success Under Construction!");
	
		}
		else{
			JOptionPane.showMessageDialog(rootPane, "Fail!");
		}
    }//GEN-LAST:event_loginActionPerformed

    private void fillupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillupActionPerformed

		String id = IDfield.getText().toString();
		String fname = firstnamefeild.getText().toString();
		String lname = lastnamefeild.getText().toString();
		String nickn = nickname.getText().toString();
		String addr = address.getText().toString();
		String ages = age.getText().toString();

		try {
			FileWriter writer = new FileWriter("C:\\Users\\vanzkie\\Documents\\NetBeansProjects\\movieticketingbookingsystem\\src\\movieticketingbookingsystem\\forprint\\userinfo.txt", true);
			writer.write(id);
			writer.write("   /  ");
			writer.write(fname);
			writer.write("   /  ");
			writer.write(lname);
			writer.write("   /  ");
			writer.write(nickn);
			writer.write("   /  ");
			writer.write(addr);
			writer.write("   /  ");
			writer.write(ages);
			writer.write(System.getProperty("line.separator"));

			writer.close();

			JOptionPane.showMessageDialog(rootPane, "Success!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "Fail!");

		}


    }//GEN-LAST:event_fillupActionPerformed

    private void DisplayDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayDataActionPerformed
		try {
			String filePath = "C:\\Users\\vanzkie\\Documents\\NetBeansProjects\\movieticketingbookingsystem\\src\\movieticketingbookingsystem\\forprint\\userinfo.txt";
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String firstLine = br.readLine().trim();
			String[] columnsName = firstLine.split(",");
			DefaultTableModel model = (DefaultTableModel) TableInformation.getModel();
			model.setColumnIdentifiers(columnsName);
			Object[] tabLelines = br.lines().toArray();
			for (int i = 0; i < tabLelines.length; i++) {
				String line = tabLelines[i].toString().trim();
				String[] dataRow = line.split("/");
				model.addRow(dataRow);
			}
			JOptionPane.showMessageDialog(rootPane, "Success!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "fail!");

		}
    }//GEN-LAST:event_DisplayDataActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
		TableInformation.setModel(new DefaultTableModel(null, new String[]{"ID ", "FirstName" , "LastName" ," Nickname" , "Address" ," Age "}));
    }//GEN-LAST:event_clearActionPerformed

    private void MovieSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieSelectionActionPerformed
       MovieSelection movie = new MovieSelection();
        movie.setVisible(true);
        movie.setLocationRelativeTo(null);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        dispose();

    }//GEN-LAST:event_MovieSelectionActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new loginform().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayData;
    private javax.swing.JTextField IDfield;
    private javax.swing.JButton MovieSelection;
    private javax.swing.JTable TableInformation;
    private javax.swing.JTextField address;
    private javax.swing.JButton admin;
    private javax.swing.JTextField age;
    private javax.swing.JLabel agetext;
    private javax.swing.JButton clear;
    private javax.swing.JLabel exit;
    private javax.swing.JButton fillup;
    private javax.swing.JButton fillups;
    private javax.swing.JTextField firstnamefeild;
    private javax.swing.JLabel firstnametext;
    private javax.swing.JLabel header;
    private javax.swing.JButton home;
    private javax.swing.JButton homeform;
    private javax.swing.JLabel id;
    private javax.swing.JLabel imagelogo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnamefeild;
    private javax.swing.JLabel lastnametext;
    private javax.swing.JButton login;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField nickname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passtext;
    private javax.swing.JLabel textpass;
    private javax.swing.JLabel textuser;
    private javax.swing.JTextField user;
    private javax.swing.JLabel usertext;
    // End of variables declaration//GEN-END:variables

}
