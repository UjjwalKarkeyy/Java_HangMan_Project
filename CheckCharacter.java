public class CheckCharacter {
    
    int[] check_return(char[] ori, char charac)
    {
        int length = ori.length;
        int[] characs_at = new int[length];
        int indx = 0;

        for(int i = 0; i < (length); i++)
        {
            if(ori[i] == charac)
            {
                characs_at[indx] = i;
                indx++;
            }
        }

        int[] ori_indx = new int[indx];

        for(int i = 0; i < indx; i++)
        {
            ori_indx[i] = characs_at[i];
        }

        return ori_indx;
    }
}
