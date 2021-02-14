package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TOT implements ActionListener {
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	static JButton b = new JButton();
	static JButton b1 = new JButton();
	public static void main(String[] args) {
	TOT tot = new TOT();
	f.add(p);
	p.add(b);
	p.add(b1);
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.pack();
	b.setText("trick");
	b1.setText("treat");
	addlistener();
	}
	public void addlistener() {
		b.addActionListener(this);
	}
	
	
	
	
	
	
	
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b == e.getSource()) {
			showPictureFromTheInternet("https://www.thelabradorsite.com/wp-content/uploads/2019/03/Cute-puppy-Names-Over-200-Adorable-Ideas-LS-long.jpg");
		}
	}
}
