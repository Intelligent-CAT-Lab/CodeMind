import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a<b){
	    if(b<c) System.out.println("C");
	    else System.out.println("B");
	}else if(a<c) System.out.println("C");
	else System.out.println("A");
    }
}

