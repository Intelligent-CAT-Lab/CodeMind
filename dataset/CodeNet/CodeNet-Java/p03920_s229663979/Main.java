import java.util.ArrayList;

public class Main{
	public static void main(String[] __){
		int
		n=new java.util.Scanner(System.in).nextInt(),
		sum=0;
		ArrayList<Integer>l=new ArrayList<>();
		for(int i=1;sum<=n;i++) {
			sum+=i;
			l.add(i);
		}
		l.remove(Integer.valueOf(sum-n));
		l.stream().forEach(System.out::println);
	}
}
