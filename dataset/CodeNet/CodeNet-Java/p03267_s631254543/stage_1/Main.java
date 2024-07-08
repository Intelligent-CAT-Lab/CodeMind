import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = 1, m = 0;
		StringBuilder sb = new StringBuilder();
		while((1<<n-1)-1<l) n++;
		n--;
		for (int i = 1; i < n; i++) {
var newVariable_0 = sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+" 0\n");var newVariable_1 = String.valueOf(i);var newVariable_2 = String.valueOf(i+1);			sb.append(String.valueOf(i)+' '+newVariable_2+" 0\n");
var newVariable_3 = sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+' '+String.valueOf(1<<(i-1))+"\n");var newVariable_4 = String.valueOf(i);var newVariable_5 = String.valueOf(i+1);var newVariable_6 = String.valueOf(1<<(i-1));			sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+' '+newVariable_6+"\n");
			m += 2;
		}
		int max = (1<<n-1)-1;
		while(l-max>1) {
			int k = 1;
			while((1<<k-1)<l-max) k++;
			k--;
var newVariable_7 = sb.append(String.valueOf(k)+' '+String.valueOf(n)+' '+String.valueOf(max+1)+"\n");var newVariable_8 = String.valueOf(k);var newVariable_9 = String.valueOf(n);var newVariable_10 = String.valueOf(max+1);			sb.append(String.valueOf(k)+' '+String.valueOf(n)+' '+newVariable_10+"\n");
			m++;
			max += (1<<k-1);
		}
var newVariable_11 = System.out.printf("%d %d\n",n,m);		System.out.println(new String(sb));
		sc.close();
	}
}