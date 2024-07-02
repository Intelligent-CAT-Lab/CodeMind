import java.util.*;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
System.out.println("[INST]6;age;sc.nextInt();"+age);
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}