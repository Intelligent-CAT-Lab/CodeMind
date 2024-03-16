import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int t = n;
        for(int k = 1; k <= (int)Math.ceil(Math.log(n)/Math.log(2)); k++){
            int d = (int)Math.ceil(Math.pow(n,