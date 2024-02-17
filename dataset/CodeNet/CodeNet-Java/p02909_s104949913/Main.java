import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
          String str = scan.next();
          
          Map<String, String> map = new HashMap<>();
          map.put("Sunny","Cloudy");
          map.put("Cloudy","Rainy");
          map.put("Rainy","Sunny");
          
          System.out.println(map.get(str));
        }
    }
}