import java.util.Scanner;

public class HostInput {

    char[] takeInput(String word)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        word = obj.nextLine();
        char[] arr_word = word.toLowerCase().toCharArray();
        return arr_word;
    }
}
