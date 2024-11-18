import java.util.Scanner;

public class HostInput {

    char[] takeInput()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String word = obj.nextLine();
        char[] arr_word = word.toLowerCase().toCharArray();
        return arr_word;
    }
}
