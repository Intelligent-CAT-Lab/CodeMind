import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j, k, l,m;
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.nextLine();		String[] sentence = newVariable_0.split(" ");
		String str1,str2;
		str1=str2="";
		int[] cnt = new int[sentence.length];
		for(m = 0; m < sentence.length; m++){
			cnt[m] = 0;
		}
		for (i = 0; i < sentence.length; i++) {
			for (j = 0; j < sentence.length; j++) {
var newVariable_1 = sentence[j].equals(sentence[i]);				if (newVariable_1) {
					cnt[j]++;
				}
			}
		}
		int max = 0;
		for (k = 0; k < sentence.length; k++) {
			if (cnt[k] > max) {
				max = cnt[k];
				str1 = sentence[k];
			}
		}
		int longest = 0;
		for (l = 0; l < sentence.length; l++) {
var newVariable_2 = sentence[l].length();			if (newVariable_2 > longest) {
				longest = sentence[l].length();
				str2 = sentence[l];
			}
		}
		System.out.println(str1 + " " + str2);
	}
}