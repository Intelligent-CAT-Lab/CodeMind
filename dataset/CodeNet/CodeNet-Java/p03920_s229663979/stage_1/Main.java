import java.util.ArrayList;

public class Main{
	public static void main(String[] __){
		int
		n=new java.util.Scanner(System.in).nextInt(),
		sum=0;
		ArrayList<Integer>l=new ArrayList<>();
		for(int i=1;sum<=n;i++) {
			sum+=i;
var newVariable_0 = l.add(i);		}
var newVariable_1 = l.remove(Integer.valueOf(sum-n));var newVariable_2 = Integer.valueOf(sum-n);		l.remove(newVariable_2);
var newVariable_3 = l.stream().forEach(System.out::println);var newVariable_4 = l.stream();		newVariable_4.forEach(System.out::println);
	}
}
