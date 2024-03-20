import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        for(int i = Math.max(X-K+1, -1000000); i < Math.min(X+K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}