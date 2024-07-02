import java.util.ArrayList;

public class Main{
	public static void main(String[] __){
		int
		n=new java.util.Scanner(System.in).nextInt(),
System.out.println("[INST]5;n;new java.util.Scanner(System.in).nextInt();"+n);
		sum=0;
		ArrayList<Integer>l=new ArrayList<>();
		for(int i=1;sum<=n;i++) {
			sum+=i;
			l.add(i);
System.out.println("[INST]10;None;l.add(i);"+l.add(i));
		}
		l.remove(Integer.valueOf(sum-n));
System.out.println("[INST]12;None;l.remove(Integer.valueOf(sum-n));"+l.remove(Integer.valueOf(sum-n)));
System.out.println("[INST]12;None;Integer.valueOf(sum-n);"+Integer.valueOf(sum-n));
		l.stream().forEach(System.out::println);
System.out.println("[INST]13;None;l.stream().forEach(System.out::println);"+l.stream().forEach(System.out::println));
System.out.println("[INST]13;None;l.stream();"+l.stream());
	}
}
