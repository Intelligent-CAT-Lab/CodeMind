import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
System.out.println("[INST]4;A;stdIn.nextInt();"+A);
		int B=stdIn.nextInt();
System.out.println("[INST]5;B;stdIn.nextInt();"+B);
		int K=stdIn.nextInt();
System.out.println("[INST]6;K;stdIn.nextInt();"+K);
		int s[]=new int[A+B];
		int z=1,y=0;
		while(z<=A&&z<=B){
			if(A%z==0&&B%z==0){
				s[y]=z;
				y++;
			}
			z++;
		}
		System.out.println(s[y-K]);
	}

}