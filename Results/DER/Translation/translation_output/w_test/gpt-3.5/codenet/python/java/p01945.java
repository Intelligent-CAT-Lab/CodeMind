```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char[] arr = input.toCharArray();
        int N = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*') {
                N = i;
                break;
            }
        }
        
        int P = Math.abs(countOccurrences(arr, 0, N, '(') - countOccurrences(arr, 0, N, ')'));
        int Q = Math.abs(countOccurrences(arr, N + 1, arr.length, '(') - countOccurrences(arr, N + 1, arr.length, ')'));
        
        System.out.println(Math.min(P, Q));
    }
    
    public static int countOccurrences(char[] arr, int start, int end, char target) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
```  
