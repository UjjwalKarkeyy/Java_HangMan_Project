import java.util.Scanner;

public class GuessCharac {
    
    char guess()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a character: ");
        char c = sc.next().charAt(0);
        return c;
    }
}
