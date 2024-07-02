import java.util.Scanner;
import java.util.regex.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
System.out.println("[INST]7;str;input.nextLine();"+str);
        String pattern="A?KIHA?BA?RA?$";
        if(Pattern.matches(pattern,str)) System.out.println("YES");
System.out.println("[INST]9;None;Pattern.matches(pattern,str);"+Pattern.matches(pattern,str));
        else System.out.println("NO");
   }
}