public class UserInterface {

    void play(int size) 
    {
        int i = 0;
        while (i < size) 
        {
            System.out.print("_ ");
            i++;
        }
        System.out.println();
    }

    void hangMan(int life) 
    {
        StringBuilder body = new StringBuilder();
        int count = 0;

        System.out.println("---------");
        char[] hangman_body = {'I','O','|','/', '|' ,'\\','/','\\'};

        for(char i : hangman_body)
        {
            if(count == life)
            {
                break;
            }
 
            if(life > 3)
            {

            }

            else if(life < 4)
            {
                body.append(" " + i + "\n");
                count++;
            }
        }

        System.out.println(body);
    }

    public static void main(String[] args)

    { 
        UserInterface ui = new UserInterface();
        ui.hangMan(3);
    }
}
