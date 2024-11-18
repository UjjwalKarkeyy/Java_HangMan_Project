import java.util.Scanner;

public class HostInput {

    char[] takeInput(Scanner sc)
    {        
        System.out.print("Enter the Word: ");
        String word = sc.nextLine();
        char[] arr_word = word.toLowerCase().toCharArray();

        return arr_word;
    }
}

