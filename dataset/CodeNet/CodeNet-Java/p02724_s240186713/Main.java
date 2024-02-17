import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[2000000];
		int x = sc.nextInt();
		long count = 0;
		while(true) {
			if(x>=500) {
				x=x-500;
				count=count+1000;
			}
			else if(x>=5) {
				x=x-5;
				count=count+5;
			}
			else {
				break;
			}
		}
		System.out.println(count);

	}
}