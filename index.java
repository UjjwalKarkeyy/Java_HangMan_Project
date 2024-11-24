import java.util.Arrays;
import java.util.Scanner;

public class index
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int life = 1;
        String clear_screen = "\033[H\033[2J"; //ANSI escape code
        String move_cursor_to_top = "\033[H"; 

        // Creating objects for all the classes
        HostInput user = new HostInput();
        GuessCharac guess_charac = new GuessCharac();
        CheckCharacter check_charac = new CheckCharacter();
        UserInterface ui = new UserInterface();

        // Taking the word, its size and printing the number of dashes
        char[] re = user.takeInput(sc);
        System.out.println(clear_screen);
        int size = re.length;
        char[] word = new char[size]; 
        for(int i = 0; i < size; i++)
        {
            word[i] = '_';
        }

        ui.play(size);
        while(life < 8)
        {
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
                if(Arrays.equals(word, re))
                {
                    System.out.println("You won!");
                    break;
                }
            }

            else
            {
                System.out.print(clear_screen);
                ui.hangMan(life);
                life++;
                System.out.print(move_cursor_to_top);

                if(life > 7)
                {
                    System.out.println("\033[H\033[6;0H"+"!!!YOU ARE DEAD!!!");
                    System.out.println("The word was: ");
                    for(char i : re)
                        System.out.print(i);
                    
                    System.out.println();
                }
            }
        }
        sc.close();
    }
} 