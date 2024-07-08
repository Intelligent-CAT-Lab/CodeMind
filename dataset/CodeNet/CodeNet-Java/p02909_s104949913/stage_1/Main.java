import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
          String str = scan.next();
          
          Map<String, String> map = new HashMap<>();
var newVariable_0 = map.put("Sunny","Cloudy");var newVariable_1 = map.put("Cloudy","Rainy");var newVariable_2 = map.put("Rainy","Sunny");          
          System.out.println(map.get(str));
        }
    }
}