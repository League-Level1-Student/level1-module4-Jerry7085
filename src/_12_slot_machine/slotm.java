package _12_slot_machine;

import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotm {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	int p1;
	int p2;
	int p3;
	
	public void setup() {
	Random ran = new Random();
	p1 = ran.nextInt(3);
	p2 = ran.nextInt(3);
	p3 = ran.nextInt(3);
	if(p1 == 0) {
		
	}
	f.add(p);
	p.add(b);
	p.add(l1);
	p.add(l2);
	p.add(l3);
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setLocation(500, 250);
	f.setSize(500, 500);
	b.setText("spin");
	
	
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        java.net.URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
}