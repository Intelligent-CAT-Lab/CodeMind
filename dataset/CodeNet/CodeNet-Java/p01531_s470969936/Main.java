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
		for(int i=0;i<str.length()/2;i++)
		{
			k =  Integer.parseInt(str.substring(2*i, 2*i+1));
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

		if(k==0&&c.equals("U"))
		{result += "nn";}
		else
		{
			for(int i=0;i<nums.length;i++)
			{if(nums[i]==k) {result += cons[i];}}

			for(int i=0;i<dir.length;i++)
			{if(c.equals(dir[i])) {result +=vowel[i];}}
		}

		return result;
	}
}