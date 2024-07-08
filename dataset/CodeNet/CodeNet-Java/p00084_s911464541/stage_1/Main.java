import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.nextLine();    	String[] arr = newVariable_0.split( "[,. ]" );
    	StringBuilder sb = new StringBuilder();
    	for(String s : arr)
var newVariable_1 = s.length();var newVariable_2 = s.length();    		if(2 < newVariable_2 && newVariable_2 < 7)
var newVariable_3 = sb.append(s+" ");    	System.out.println(sb.toString().trim());
    }
}