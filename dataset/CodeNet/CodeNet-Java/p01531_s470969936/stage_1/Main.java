import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)
	{
		int k; String c;
		String str = "";
		try {str = new BufferedReader(new InputStreamReader(System.in)).readLine();}
		catch (IOException e) {e.printStackTrace();}

		String result = "";
var newVariable_0 = str.length();		for(int i=0;i<newVariable_0/2;i++)
		{
var newVariable_1 = str.substring(2*i, 2*i+1);			k =  Integer.parseInt(newVariable_1);
			c = str.substring(2*i+1, 2*(i+1));

			result += translator(k, c);
		}
		System.out.println(result);
	}

	private static String translator(int k, String c)
	{
		String result = "";
		int[] nums = {0,1,2,3,4,5,6,7,8,9};
		String[] cons = {"w","","k","s","t","n","h","m","y","r"};

		String[] dir = {"T","L","U","R","D"};
		String[] vowel = {"a","i","u","e","o"};

var newVariable_2 = c.equals("U");		if(k==0&&newVariable_2)
		{result += "nn";}
		else
		{
			for(int i=0;i<nums.length;i++)
			{if(nums[i]==k) {result += cons[i];}}

			for(int i=0;i<dir.length;i++)
var newVariable_3 = c.equals(dir[i]);			{if(newVariable_3) {result +=vowel[i];}}
		}

		return result;
	}
}