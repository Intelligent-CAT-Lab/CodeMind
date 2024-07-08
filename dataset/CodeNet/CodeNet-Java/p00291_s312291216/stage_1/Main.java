import java.util.*;
class Main {
	static int INF = -10000000;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 6; i++) {
			int tmp = stdIn.nextInt();
			switch(i) {
			case 0:
				sum += tmp;
				break;
			case 1:
				sum += tmp*5;
				break;
			case 2:
				sum += tmp*10;
				break;
			case 3:
				sum += tmp * 50;
				break;
			case 4:
				sum += tmp * 100;
				break;
			case 5:
				sum += tmp * 500;
				break;
			}
		}
		
		if(sum >= 1000) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}