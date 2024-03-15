```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r1, r2;
        
        // Initialize list
        List<String[]> inputData = getInputData();
        
        r1 = Double.parseDouble(inputData.get(0)[0]);
        r2 = Double.parseDouble(inputData.get(0)[1]);
        
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
    
    public static List<String[]> getInputData() {
        List<String[]> result = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String data = scanner.nextLine();
                String[] tempArray = data.split(" ");

                if (data.isEmpty()) {
                    break;
                }

                result.add(tempArray);
            }
        }
        
        return result;
    }
}
```
