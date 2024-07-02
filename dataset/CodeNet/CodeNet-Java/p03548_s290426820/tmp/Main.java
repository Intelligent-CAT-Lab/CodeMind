import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
System.out.println("[INST]6;x;scan.nextInt();"+x);
		int y= scan.nextInt();
System.out.println("[INST]7;y;scan.nextInt();"+y);
		int z= scan.nextInt();
System.out.println("[INST]8;z;scan.nextInt();"+z);
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