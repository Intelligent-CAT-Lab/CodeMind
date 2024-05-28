import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class p00018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Integer ans[] = {1,1,1,1,1} ;
		int count = 0;
		while (sc.hasNext()) {
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
		Arrays.sort(ans, Comparator.reverseOrder()); // ???????????????
		String result = ans[0].toString() +" "+ ans[1].toString() +" "+ ans[2].toString() +" "+ ans[3].toString() +" "+ ans[4].toString();
		return result;
	}
}