// Use array knowledge to check if there are still any questions here or not. DON'T RUSH TAKE TIME!!

public class CheckCharacter {
    
    int[] check_return(char[] ori, char charac)
    {
        int length = ori.length;
        int[] characs_at = new int[length];
        characs_at[0] = -1; // This lets me know if the entered character was on the string or not.
        int indx = 0;

        for(int i = 0; i < (length); i++)
        {
            if(ori[i] == charac)
            {
                characs_at[indx] = i;
                indx++;
            }
        }

        
        if(characs_at[0] == -1)
        {
            return characs_at;
        }
        
        else
        {
            int[] ori_indx;
            ori_indx = new int[indx];

            for(int i = 0; i < indx; i++)
            {
                ori_indx[i] = characs_at[i];
            }

            return ori_indx;
        }
    }
}

