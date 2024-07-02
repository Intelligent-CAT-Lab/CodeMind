import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
System.out.println("[INST]4;str;sc.next();"+str);

		if(str.equals("Sunny"))
System.out.println("[INST]6;None;str.equals('Sunny');"+str.equals("Sunny"));
        {
          System.out.println("Cloudy");
        }
      	if(str.equals("Cloudy")){
System.out.println("[INST]10;None;str.equals('Cloudy');"+str.equals("Cloudy"));
          System.out.println("Rainy");
        }
      	if(str.equals("Rainy")){
System.out.println("[INST]13;None;str.equals('Rainy');"+str.equals("Rainy"));
		  System.out.println("Sunny");
        }
	}
}