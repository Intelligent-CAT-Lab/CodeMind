import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = scn.nextInt();
      	int b = scn.nextInt();
      	if((b-a)%2==0) System.out.println("Alice");
      	else System.out.println("Borys");
	}
}
