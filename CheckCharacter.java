public class CheckCharacter {
    
    int[] check_return(char[] ori, char charac)
    {
        int[] characs_at = {-1};
        int indx = 0;

        for(int i = 0; i < (ori.length); i++)
        {
            if(ori[i] == charac)
            {
                characs_at[indx] = i;
                indx++;
            }
        }

        return characs_at;
    }

    // public static void main(String[] args) {
    //     CheckCharacter check = new CheckCharacter();
    //     char[] ori = {'a','p','p','l','e'};
    //     int[] re = check.check_return(ori,'a');
    //     System.out.println(Arrays.toString(re));
    // }
}
