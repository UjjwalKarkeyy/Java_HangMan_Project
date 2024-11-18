import java.util.Arrays;
import java.util.Scanner;

public class index
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HostInput user = new HostInput();
        GuessCharac guess_charac = new GuessCharac();
        CheckCharacter check_charac = new CheckCharacter();

        char[] re = user.takeInput(sc);
        char charac = guess_charac.guess(sc);
        int[] indxs= check_charac.check_return(re, charac);
        System.out.println(Arrays.toString(indxs));
        sc.close();
    }
}