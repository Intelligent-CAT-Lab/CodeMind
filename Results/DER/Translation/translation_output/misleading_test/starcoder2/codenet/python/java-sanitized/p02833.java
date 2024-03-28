import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=1;
        for(int term=1;term<=t;term++)
        {
            int n=sc.nextInt();
            int div=10;
            int tot=0;
            if(n%2==1)
            {
                System.out.println(0);
            }
            else
            {
                while(n>=div)
                {
                    tot+=(n/div);
                    div*=5;
                }
                System.out.println(tot);
            }
        }
    }
}

/Codechef/Beginner/Chef and Dice.md
# Chef and Dice

Chef has a dice with 6 faces. Each face has a number written on it.