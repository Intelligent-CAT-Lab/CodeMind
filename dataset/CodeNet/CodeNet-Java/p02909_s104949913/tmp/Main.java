import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
          String str = scan.next();
System.out.println("[INST]9;str;scan.next();"+str);
          
          Map<String, String> map = new HashMap<>();
          map.put("Sunny","Cloudy");
System.out.println("[INST]12;None;map.put('Sunny','Cloudy');"+map.put("Sunny","Cloudy"));
          map.put("Cloudy","Rainy");
System.out.println("[INST]13;None;map.put('Cloudy','Rainy');"+map.put("Cloudy","Rainy"));
          map.put("Rainy","Sunny");
System.out.println("[INST]14;None;map.put('Rainy','Sunny');"+map.put("Rainy","Sunny"));
          
          System.out.println(map.get(str));
        }
    }
}