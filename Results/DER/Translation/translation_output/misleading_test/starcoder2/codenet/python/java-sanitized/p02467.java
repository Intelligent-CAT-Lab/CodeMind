import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + ": ");
        for(int i = 2; i <= n; i++)
        {
            while(n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }
}