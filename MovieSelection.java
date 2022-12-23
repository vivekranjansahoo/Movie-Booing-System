
package movieticketingbookingsystem;
import java.io.*;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieSelection extends javax.swing.JFrame {
     int post = 0;
   
    public MovieSelection() {
        initComponents();
		this.setLocationRelativeTo(null);
		showImage(post);
		
    }
	
	
	public  String [] getImages(){
   
	File file = new File(getClass().getResource("/movieticketingbookingsystem/homeimages/moviefinal/").getFile()); 
	String [] imagesList = file.list();
	return imagesList;
	}

	public void showImage(int index){

	String [] imagesList = 	getImages();
	String imagesName = imagesList[index];
	
	ImageIcon icon = new ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/moviefinal/"+imagesName));
	Image image  = icon.getImage().getScaledInstance(movies.getWidth(),movies.getHeight(),Image.SCALE_SMOOTH);
    movies.setIcon(new ImageIcon(image));
	

	
	}
	
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DateSelection = new com.toedter.calendar.JDateChooser();
        TImeAvailable = new javax.swing.JComboBox<>();
        prev = new javax.swing.JButton();
        Last = new javax.swing.JButton();
        first = new javax.swing.JButton();
        fnext = new javax.swing.JButton();
        seatReserve = new javax.swing.JButton();
        AddMovie = new javax.swing.JButton();
        movies = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(830, 478, 478, 478));
        setMaximumSize(new java.awt.Dimension(830, 478));
        setMinimumSize(new java.awt.Dimension(830, 478));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(830, 478));
        setSize(new java.awt.Dimension(830, 430));

        DateSelection.setBackground(new java.awt.Color(44, 62, 80));
        DateSelection.setForeground(new java.awt.Color(255, 255, 255));

        TImeAvailable.setBackground(new java.awt.Color(44, 62, 80));
        TImeAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TImeAvailable.setForeground(new java.awt.Color(255, 255, 255));
        TImeAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11:00AM", "2:00PM", "5:00PM", "8:00PM" }));
        TImeAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TImeAvailableActionPerformed(evt);
            }
        });

        prev.setBackground(new java.awt.Color(44, 62, 80));
        prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/icons/previous.png"))); // NOI18N
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        Last.setBackground(new java.awt.Color(44, 62, 80));
        Last.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/icons/last.png"))); // NOI18N
        Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastActionPerformed(evt);
            }
        });

        first.setBackground(new java.awt.Color(44, 62, 80));
        first.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/icons/first.png"))); // NOI18N
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        fnext.setBackground(new java.awt.Color(44, 62, 80));
        fnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/icons/next.png"))); // NOI18N
        fnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnextActionPerformed(evt);
            }
        });

        seatReserve.setBackground(new java.awt.Color(44, 62, 80));
        seatReserve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seatReserve.setForeground(new java.awt.Color(255, 255, 255));
        seatReserve.setText("Seat Reservation");
        seatReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatReserveActionPerformed(evt);
            }
        });

        AddMovie.setBackground(new java.awt.Color(44, 62, 80));
        AddMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/icons/addmovie.png"))); // NOI18N
        AddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMovieActionPerformed(evt);
            }
        });

        head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background7.png"))); // NOI18N

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieticketingbookingsystem/homeimages/background8.png"))); // NOI18N

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(header)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(seatReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(TImeAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(Last, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(movies, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(fnext, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(DateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(head)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(seatReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(TImeAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(Last, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(movies, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(fnext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(DateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
		post = 0;
		showImage(post);
    }//GEN-LAST:event_firstActionPerformed

    private void fnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnextActionPerformed
     post= post + 1;
       if(post >= getImages().length)
       {
           post  = getImages().length - 1;
       }
       showImage(post);
                                     
         
    }//GEN-LAST:event_fnextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
       post = post - 1;
       if(post < 0)
       {
           post = 0;
       }
       showImage(post);
    }//GEN-LAST:event_prevActionPerformed

    private void LastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastActionPerformed
       post = getImages().length - 1;
       showImage(post);
      
                                              
    }//GEN-LAST:event_LastActionPerformed

    private void seatReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatReserveActionPerformed
      SeatReservation seat = new SeatReservation();
	   seat.setVisible(true);
       seat.setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       pack();
       dispose();
	  
	  
    }//GEN-LAST:event_seatReserveActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void AddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMovieActionPerformed
		
		
		try {
			 	
			FileWriter writer = new FileWriter("C:\\Users\\vanzkie\\Documents\\NetBeansProjects\\movieticketingbookingsystem\\src\\movieticketingbookingsystem\\forprint\\print.txt", true);

					if (post == 0){
				     writer.write("TITLE: BLACK PANTHER");
				     writer.write(System.getProperty("line.separator"));

		            }
			    	else if (post == 1){
					 writer.write("TITLE: DEATH CURE");
					 writer.write(System.getProperty("line.separator"));
					}
					else if (post == 2){
					 writer.write("TITLE: FIFTY SHADES FREED");
					 writer.write(System.getProperty("line.separator"));
					}
					else if (post == 3){
					 writer.write("TITLE: FOREVER MY GIRL");
					 writer.write(System.getProperty("line.separator"));
					}
					 else if (post == 4){
					 writer.write("TITLE: I CAN ONLY IMAGINE");
					 writer.write(System.getProperty("line.separator"));
					}
					else if (post == 5){
					 writer.write("TITLE: RED SPARROW");
					 writer.write(System.getProperty("line.separator"));
					}
					else if (post == 6){
					 writer.write("TITLE: THE STRANGERS II");
					 writer.write(System.getProperty("line.separator"));
					}
					else if (post == 7){
					 writer.write("TITLE: A WRINKLE IN TIME");
					 writer.write(System.getProperty("line.separator"));
					}
					else if (post == 5){
					 writer.write("TILLE: RED SPARROW");
					 writer.write(System.getProperty("line.separator"));
					
					}
					//time selection
					 String Value = (String) TImeAvailable.getSelectedItem();
					 writer.write(" Time: "+Value);
					 writer.write(System.getProperty("line.separator"));
					//Jchooser date
					 SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-DD");
					 String date = dFormat.format(DateSelection.getDate());
					 writer.write("DATE: "+date);
					 writer.write(System.getProperty("line.separator"));
					 
					 writer.close();

			JOptionPane.showMessageDialog(rootPane, "Success!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, "Fail!");

		}

    }//GEN-LAST:event_AddMovieActionPerformed

    private void TImeAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TImeAvailableActionPerformed
		
    }//GEN-LAST:event_TImeAvailableActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMovie;
    private com.toedter.calendar.JDateChooser DateSelection;
    private javax.swing.JButton Last;
    private javax.swing.JComboBox<String> TImeAvailable;
    private javax.swing.JLabel exit;
    private javax.swing.JButton first;
    private javax.swing.JButton fnext;
    private javax.swing.JLabel head;
    private javax.swing.JLabel header;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel movies;
    private javax.swing.JButton prev;
    private javax.swing.JButton seatReserve;
    // End of variables declaration//GEN-END:variables
}
