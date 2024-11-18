import java.util.Arrays;
import java.util.Scanner;

public class index
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating objects for all the classes
        HostInput user = new HostInput();
        GuessCharac guess_charac = new GuessCharac();
        CheckCharacter check_charac = new CheckCharacter();
        UserInterface ui = new UserInterface();

        // Taking the word, its size and printing the number of dashes
        char[] re = user.takeInput(sc);
        int size = re.length;
        char[] word = new char[size]; 
        ui.play(size);

        // Taking player's guessed character
        char charac = guess_charac.guess(sc);
        int[] indxs= check_charac.check_return(re, charac);
        System.out.println(Arrays.toString(indxs));
        sc.close();
    }
}