import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "abcd";
        for(int i=0;i<n/4;i++)
        {
            System.out.print(s);
        }
        if(n%4==1)
        {
            System.out.print("a");
        }
        else if(n%4==2)
        {
            System.out.print("ab");
        }
        else if(n%4==3)
        {
            System.out.print("abc");
        }
    }
}