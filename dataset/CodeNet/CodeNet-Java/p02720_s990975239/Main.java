import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();

		ArrayDeque<Long> que = new ArrayDeque<>();

		long i;
		for(i = 1; i <= 9; i++)
			que.addFirst(i);

		long cnt = 0;
		long temp = 0;
		long modTen = 0;

		while(cnt < k) {
			cnt++;
			temp = que.pollLast();
			modTen = temp % 10;

			if(modTen != 0)
				que.addFirst(temp * 10 + modTen - 1);

			que.addFirst(temp * 10 + modTen);

			if(modTen != 9)
				que.addFirst(temp * 10 + modTen + 1);
		}

		System.out.println(temp);

	}
}
