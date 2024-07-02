import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
	int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
	int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
	if(a<b){
	    if(b<c) System.out.println("C");
	    else System.out.println("B");
	}else if(a<c) System.out.println("C");
	else System.out.println("A");
    }
}

