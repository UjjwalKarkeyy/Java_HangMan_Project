// Scanner question solved? DON'T RUSH TAKE TIME!!

import java.util.Scanner;

public class GuessCharac {

    char guess(Scanner sc)
    {        
        System.out.println("Guess a character: ");
        char c = sc.next().charAt(0);
        return c;
    }
}

