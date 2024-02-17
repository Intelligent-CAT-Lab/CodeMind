import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j, k, l,m;
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split(" ");
		String str1,str2;
		str1=str2="";
		int[] cnt = new int[sentence.length];
		for(m = 0; m < sentence.length; m++){
			cnt[m] = 0;
		}
		for (i = 0; i < sentence.length; i++) {
			for (j = 0; j < sentence.length; j++) {
				if (sentence[j].equals(sentence[i])) {
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
			if (sentence[l].length() > longest) {
				longest = sentence[l].length();
				str2 = sentence[l];
			}
		}
		System.out.println(str1 + " " + str2);
	}
}