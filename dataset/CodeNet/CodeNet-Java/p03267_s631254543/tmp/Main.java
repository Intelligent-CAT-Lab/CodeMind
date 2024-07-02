import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
System.out.println("[INST]6;l;sc.nextInt();"+l);
		int n = 1, m = 0;
		StringBuilder sb = new StringBuilder();
		while((1<<n-1)-1<l) n++;
		n--;
		for (int i = 1; i < n; i++) {
			sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+" 0\n");
System.out.println("[INST]12;None;sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+' 0\n');"+sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+" 0\n"));
System.out.println("[INST]12;None;String.valueOf(i);"+String.valueOf(i));
System.out.println("[INST]12;None;String.valueOf(i+1);"+String.valueOf(i+1));
			sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+' '+String.valueOf(1<<(i-1))+"\n");
System.out.println("[INST]13;None;sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+' '+String.valueOf(1<<(i-1))+'\n');"+sb.append(String.valueOf(i)+' '+String.valueOf(i+1)+' '+String.valueOf(1<<(i-1))+"\n"));
System.out.println("[INST]13;None;String.valueOf(i);"+String.valueOf(i));
System.out.println("[INST]13;None;String.valueOf(i+1);"+String.valueOf(i+1));
System.out.println("[INST]13;None;String.valueOf(1<<(i-1));"+String.valueOf(1<<(i-1)));
			m += 2;
		}
		int max = (1<<n-1)-1;
		while(l-max>1) {
			int k = 1;
			while((1<<k-1)<l-max) k++;
			k--;
			sb.append(String.valueOf(k)+' '+String.valueOf(n)+' '+String.valueOf(max+1)+"\n");
System.out.println("[INST]21;None;sb.append(String.valueOf(k)+' '+String.valueOf(n)+' '+String.valueOf(max+1)+'\n');"+sb.append(String.valueOf(k)+' '+String.valueOf(n)+' '+String.valueOf(max+1)+"\n"));
System.out.println("[INST]21;None;String.valueOf(k);"+String.valueOf(k));
System.out.println("[INST]21;None;String.valueOf(n);"+String.valueOf(n));
System.out.println("[INST]21;None;String.valueOf(max+1);"+String.valueOf(max+1));
			m++;
			max += (1<<k-1);
		}
		System.out.printf("%d %d\n",n,m);
System.out.println("[INST]25;None;System.out.printf('%d %d\n',n,m);"+System.out.printf("%d %d\n",n,m));
		System.out.println(new String(sb));
		sc.close();
	}
}