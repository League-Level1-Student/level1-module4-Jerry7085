package _06_book_of_illusions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter implements ComponentListener, ActionListener {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	public void Hamburger (double poundsOfBeef, boolean withCheese) {
		new Hamburger(5.5,true);
        // some code
		Dog d =new Dog("Jack");

}
	public int quadruples(int four) {
		four = four*4;
		return four;
		}
	
	
	public void run() {
		// 2. make the frame visible
		JButton b = new JButton();
		b.addActionListener(this);
		// 3. set the size of the frame
		JTextField t = new JTextField();
		JButton myButton = new JButton();
		myButton.addActionListener(this);


		JFrame myFrame = new JFrame();
		myFrame.addKeyListener(this);
		int checkStock(String productName, int productNumber) {
			checkStock("CS", 99);
		}
		}
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		// 7. use the "loadImage..." methods below to initialize your JLabel
		// 8. add your JLabel to the frame
		// 9. call the pack() method on the frame
		// 10. add a mouse listener to your frame (hint: use *this*)
	}
	public void mymethod (int){


	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		// 12. remove everything from the frame that was added earlier
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


