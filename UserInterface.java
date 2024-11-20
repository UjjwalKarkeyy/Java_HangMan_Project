public class UserInterface 
{
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
        System.out.println("---------");

        switch (life) {
            case 1:
                System.out.println(" |");
                break;
            case 2:
                System.out.println(" |\n O");
                break;
            case 3:
                System.out.println(" |\n O\n |");
                break;
            case 4:
                System.out.println(" |\n O\n/|");
                break;
            case 5:
                System.out.println(" |\n O\n/|\\");
                break;
            case 6:
                System.out.println(" |\n O\n/|\\\n/");
                break;
            case 7:
                System.out.println(" |\n O\n/|\\\n/ \\");
                break;
        
            default:
                System.out.println("!!!Failed to show hangman!!!");
                break;
        }
    }
}
