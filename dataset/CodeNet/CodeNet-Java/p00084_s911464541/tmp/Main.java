import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	String[] arr = sc.nextLine().split( "[,. ]" );
System.out.println("[INST]7;arr;sc.nextLine().split( '[,. ]' );"+arr);
System.out.println("[INST]7;None;sc.nextLine();"+sc.nextLine());
    	StringBuilder sb = new StringBuilder();
    	for(String s : arr)
    		if(2 < s.length() && s.length() < 7)
System.out.println("[INST]10;None;s.length();"+s.length());
System.out.println("[INST]10;None;s.length();"+s.length());
    			sb.append(s+" ");
System.out.println("[INST]11;None;sb.append(s+' ');"+sb.append(s+" "));
    	System.out.println(sb.toString().trim());
    }
}