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
        System.out.println("\033[1;20H" + "---------");

        switch (life) {
            case 1:
                System.out.println("\033[2;20H" +" |");
                break;
            case 2:
                System.out.println("\033[2;20H" +" |\n"+ "\033[3;20H" + " O");
                break;
            case 3:
                System.out.println("\033[2;20H" +" |\n" + "\033[3;20H" + " O\n"+ "\033[4;20H" + " |");
                break;
            case 4:
                System.out.println("\033[2;20H" +" |\n" + "\033[3;20H" + " O\n"+ "\033[4;20H" + "/|");
                break;
            case 5:
                System.out.println("\033[2;20H" +" |\n" + "\033[3;20H" + " O\n"+"\033[4;20H" +  "/|\\");
                break;
            case 6:
                System.out.println("\033[2;20H" +" |\n" + "\033[3;20H" + " O\n"+ "\033[4;20H" + "/|\\\n"+ "\033[5;20H" + "/");
                break;
            case 7:
                System.out.println("\033[2;20H" +" |\n"+ "\033[3;20H" + " O\n"+ "\033[4;20H" + "/|\\\n" + "\033[5;20H" + "/ \\");
                break;
        
            default:
                System.out.println("!!!Failed to show hangman!!!");
                break;
        }
    }
}
