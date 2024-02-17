import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	String[] arr = sc.nextLine().split( "[,. ]" );
    	StringBuilder sb = new StringBuilder();
    	for(String s : arr)
    		if(2 < s.length() && s.length() < 7)
    			sb.append(s+" ");
    	System.out.println(sb.toString().trim());
    }
}