import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)
        {
            l[i] = i;
        }
        int[] combs = new int[k];
        int[] sumlist = new int[k];
        for(int i=0;i<k;i++)
        {
            combs[i] = l[i];
            sumlist[i] = (int)Math.pow(2,l[i]);
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(sumlist[i] + ": " + combs[i]);
        }
    }
}

/README.md
# 100-days-of-code