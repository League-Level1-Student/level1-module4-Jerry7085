package _03_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton tb, fb;
	private JButton b5;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;



	public void run() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		f.setLayout(new BorderLayout());

		// 1. Make the frame show up
		f.setVisible(true);
		// 2. Give your frame a title
		f.setTitle("title");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel p = createHeader("word");
		
		// 4. Add the header component to the quizPanel
		quizPanel.add(p);
		// 5. Add the quizPanel to the frame
		f.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("200");
		// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
		
		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		secondButton = createButton("400");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		
		// 12. Write the code to complete the actionPerformed() method below
		
		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		tb = createButton("600");
		quizPanel.add(tb);
		fb = createButton("800");
		b5 = createButton("1000");
		quizPanel.add(fb);
		quizPanel.add(b5);
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		tb.addActionListener(this);
		fb.addActionListener(this);
		b5.addActionListener(this);
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		f.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		f.add(makeScorePanel(), BorderLayout.NORTH);
		f.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
		JButton b = new JButton();
		// Set the text of the button to the dollarAmount
		b.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount = buttonCount+1;
		// Return your new button instead of the temporary button
		return b;
		
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if(firstButton == e.getSource()) {
			askQuestion("is earth round?","yes",200);
		}
			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.
		if(secondButton == e.getSource()) {
			askQuestion("is earth flat?","no",400);
		}
		// If the buttonPressed was the secondButton
		if(tb == e.getSource()) {
			askQuestion("are you good at coding?","no",600);
		}
		if(fb == e.getSource()) {
			askQuestion("are you smart?","no",800);
		}
		if(b5 == e.getSource()) {
			askQuestion("are you actually honest with your answers?","no",1000);
		}
			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		String quest = JOptionPane.showInputDialog(question);
		
		// Stop the theme music when they have entered their response. Hint: use the sound variable 
		
		
		// If the answer is correct
		if(quest.equalsIgnoreCase(correctAnswer)) {
			score = score+prizeMoney;
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			score = score-prizeMoney;
			JOptionPane.showMessageDialog(null, "you are incorrect the correct anwser is "+ correctAnswer);
		}
		updateScore();
			// Increase the score by the prizeMoney
		
			// Pop up a message to tell the user they were correct
		
		// Otherwise

			// Decrement the score by the prizeMoney

			// Pop up a message to tell the user they were wrong and give them the correct answer

		// Call the updateScore() method

	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
