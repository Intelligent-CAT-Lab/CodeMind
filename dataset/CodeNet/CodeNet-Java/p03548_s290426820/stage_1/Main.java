import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		int y= scan.nextInt();
		int z= scan.nextInt();
		scan.close();
		x-=z*2;
		int cnt=0;
		while(true) {
			if(x-(y+z)>=0) {
				x-=(y+z);
				cnt++;
			}else {
				if(x-y>=0)cnt++;
				break;
			}
		}
		System.out.println(cnt);
	}

}