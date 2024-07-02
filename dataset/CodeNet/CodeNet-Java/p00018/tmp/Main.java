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
		while (sc.hasNext()) {
System.out.println("[INST]15;None;sc.hasNext();"+sc.hasNext());
			int num = sc.nextInt();
System.out.println("[INST]16;num;sc.nextInt();"+num);
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
System.out.println("[INST]26;None;Arrays.sort(ans, Comparator.reverseOrder());"+Arrays.sort(ans, Comparator.reverseOrder()));
System.out.println("[INST]26;None;Comparator.reverseOrder();"+Comparator.reverseOrder());
		String result = ans[0].toString() +" "+ ans[1].toString() +" "+ ans[2].toString() +" "+ ans[3].toString() +" "+ ans[4].toString();
System.out.println("[INST]27;None;ans[0].toString();"+ans[0].toString());
System.out.println("[INST]27;None;ans[1].toString();"+ans[1].toString());
System.out.println("[INST]27;None;ans[2].toString();"+ans[2].toString());
System.out.println("[INST]27;None;ans[3].toString();"+ans[3].toString());
System.out.println("[INST]27;None;ans[4].toString();"+ans[4].toString());
		return result;
	}
}