import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
System.out.println("[INST]6;k;scan.nextInt();"+k);

		ArrayDeque<Long> que = new ArrayDeque<>();

		long i;
		for(i = 1; i <= 9; i++)
			que.addFirst(i);
System.out.println("[INST]12;None;que.addFirst(i);"+que.addFirst(i));

		long cnt = 0;
		long temp = 0;
		long modTen = 0;

		while(cnt < k) {
			cnt++;
			temp = que.pollLast();
System.out.println("[INST]20;temp;que.pollLast();"+temp);
			modTen = temp % 10;

			if(modTen != 0)
				que.addFirst(temp * 10 + modTen - 1);
System.out.println("[INST]24;None;que.addFirst(temp * 10 + modTen - 1);"+que.addFirst(temp * 10 + modTen - 1));

			que.addFirst(temp * 10 + modTen);
System.out.println("[INST]26;None;que.addFirst(temp * 10 + modTen);"+que.addFirst(temp * 10 + modTen));

			if(modTen != 9)
				que.addFirst(temp * 10 + modTen + 1);
System.out.println("[INST]29;None;que.addFirst(temp * 10 + modTen + 1);"+que.addFirst(temp * 10 + modTen + 1));
		}

		System.out.println(temp);

	}
}
