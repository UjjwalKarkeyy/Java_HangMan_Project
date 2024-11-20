import java.util.Arrays;
import java.util.Scanner;

public class index
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int life = 1;

        // Creating objects for all the classes
        HostInput user = new HostInput();
        GuessCharac guess_charac = new GuessCharac();
        CheckCharacter check_charac = new CheckCharacter();
        UserInterface ui = new UserInterface();

        // Taking the word, its size and printing the number of dashes
        char[] re = user.takeInput(sc);
        int size = re.length;
        char[] word = new char[size]; 
        for(int i = 0; i < size; i++)
        {
            word[i] = '_';
        }

        ui.play(size);

        // Taking player's guessed character
        char charac = guess_charac.guess(sc);
        int[] indxs= check_charac.check_return(re, charac);

        if(indxs[0] != -1)
        {

            for(int i = 0; i < indxs.length; i++)
            {
                word[indxs[i]] = charac;
            }
            
            ui.play(size);

            for(int i = 0; i<word.length; i++)
            {
                System.out.print(word[i] + " ");
            }  
            
            System.out.println();
        }

        else
        {
            ui.hangMan(life);
        }

        sc.close();
    }
} 