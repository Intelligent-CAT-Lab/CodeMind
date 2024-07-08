import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Integer ans[] = {1,1,1,1,1} ;
		int count = 0;
var newVariable_0 = sc.hasNext();		while (newVariable_0) {
			int num = sc.nextInt();
			ans[count] = num;
			count++;
			if(count==5){
				System.out.println(strkn(ans));
				break;
			}
		}
	}
	public static String strkn(Integer[] ans){
var newVariable_1 = Comparator.reverseOrder();		Arrays.sort(ans, newVariable_1); // ???????????????
var newVariable_2 = ans[0].toString();var newVariable_3 = ans[1].toString();var newVariable_4 = ans[2].toString();var newVariable_5 = ans[3].toString();var newVariable_6 = ans[4].toString();		String result = ans[0].toString() +" "+ ans[1].toString() +" "+ ans[2].toString() +" "+ ans[3].toString() +" "+ newVariable_6;
		return result;
	}
}