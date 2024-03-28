import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<Integer>();
        setl.add(k);
        setl.add(k-1);
        for(int x=2;x<=Math.sqrt(k);x++)
        {
            check(x,k,setl);
            check(k/x,k,setl);
        }
        if(setl.contains(1))
        {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }
    public static void check(int i,int k,Set<Integer> setl)
    {
        int tot=k;
        while(tot%i==0)
        {
            tot/=i;
        }
        if(tot%i==1)
        {
            setl.add(i);
        }
    }
}