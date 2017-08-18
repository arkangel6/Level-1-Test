import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Colors implements ActionListener {
	
	JFrame frame;
	JButton buttony, buttonr, buttonb, buttong;
		public static void main(String[] args) {
			Colors color = new Colors();
			color.makeButtons();
		}
		
		public void makeButtons() {
			frame = new JFrame();
			frame.setVisible(true);
			JPanel panel = new JPanel();
			
			frame.add(panel);
			buttony = new JButton();
			buttonr = new JButton();
			buttonb = new JButton();
			buttong = new JButton();
			
			panel.add(buttony);
			panel.add(buttonr);
			panel.add(buttonb);
			panel.add(buttong);
			frame.setTitle("Color Teacher");
			
			buttony.setBackground(Color.YELLOW);
			buttony.setOpaque(true);
			buttonr.setBackground(Color.RED);
			buttonr.setOpaque(true);
			buttonb.setBackground(Color.BLUE);
			buttonb.setOpaque(true);
			buttong.setBackground(Color.GREEN);
			buttong.setOpaque(true);
			
			buttony.addActionListener(this);
			buttonr.addActionListener(this);
			buttonb.addActionListener(this);
			buttong.addActionListener(this);
			
			frame.pack();
		}
				
		public void actionPerformed(ActionEvent arg0) {
			
			if(arg0.getSource()==buttony) {
				speak("yellow");
				
			}
			if(arg0.getSource()==buttonr) {
				speak("red");
				
			}
			if(arg0.getSource()==buttonb) {
	
				speak("blue");
}
			if(arg0.getSource()==buttong) {
	
	speak("green");
}
			
		}
		
		void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " +  words);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
}
