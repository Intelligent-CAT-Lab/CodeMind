/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
System.out.println("[INST]15;a;sc.nextInt();"+a);
	    int b = sc.nextInt();
System.out.println("[INST]16;b;sc.nextInt();"+b);
	    int op = sc.nextInt();
System.out.println("[INST]17;op;sc.nextInt();"+op);
	    
	    for(int i=0; i<op; i++){
	        if ( i % 2 == 0 ){ b += a / 2 ; a /= 2 ;}
	        else{
	          a += b / 2 ;
	          b /= 2 ;  
	        } 
	    }
	    System.out.println(a);
	    System.out.println(b);
	}
}
