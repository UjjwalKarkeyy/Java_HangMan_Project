import java.util.Arrays;

public class index
{
    public static void main(String[] args) {
        HostInput user = new HostInput();
        GuessCharac guess_charac = new GuessCharac();
        CheckCharacter check_charac = new CheckCharacter();

        char[] re = user.takeInput();
        char charac = guess_charac.guess();
        int[] indxs= check_charac.check_return(re, charac);
        System.out.println(Arrays.toString(indxs));
    }
}