package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ggggg implements ActionListener {
	public static void main(String[] args) {
		ggggg clicker = new ggggg();
		clicker.makeButtons();
	}
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JButton b = new JButton();
		JButton b2 = new JButton();
	public void makeButtons() {
		
		f.add(p);
		p.add(b);
		p.add(b2);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		b.setText("joke");
		b2.setText("punchline");
		f.pack();
		b.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b == e.getSource()) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		if(b2 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "hello");
		}
	}
}
