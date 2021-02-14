package _05_typing_tutor;

public class typing_tutor {
	public static void main(String[] args) {
		char currentLetter;
		currentLetter = generateRandomLetter();

		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
		
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		
		
	}
}
