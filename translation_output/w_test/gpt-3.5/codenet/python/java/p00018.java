```java
import java.util.*;

public class ReverseSort{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        List<Integer> numbers = new ArrayList<>();
        for(String num : input){
            numbers.add(Integer.parseInt(num));
        }
        
        Collections.sort(numbers);
        Collections.reverse(numbers);
        
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
```  
