import java.util.Scanner;
import java.util.regex.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String pattern="A?KIHA?BA?RA?$";
        if(Pattern.matches(pattern,str)) System.out.println("YES");
        else System.out.println("NO");
   }
}