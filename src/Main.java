import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		System.out.println("Enter word: ");
		String word = input.nextLine();
		int index = text.indexOf(word);
		int count = 0;
		while (index != -1) {
			count++;
			text = text.substring(index + 1);
			index = text.indexOf(word);
		}
		System.out.println("No of word \"" + word + "\" in the input is : " + count);
	}
}
