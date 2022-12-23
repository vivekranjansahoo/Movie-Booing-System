
package movieticketingbookingsystem;

public class loading {

	public static void main(String[] args) {
		Splash s = new Splash();
		Main main = new Main();
		

		
		try {

			for ( int i= 0; i <= 100; i++) {
				Thread.sleep(60);
				s.displaypercent.setText(Integer.toString(i) + "%");
				s.splash.setValue(i);
			if(i == 100){
			s.setVisible(false);	
			main.setVisible(true);

			}
			}


		} catch (Exception e) {

		}
	}

}
