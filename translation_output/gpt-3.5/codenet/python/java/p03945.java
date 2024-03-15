```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = new CountWBAndBW().countWBAndBW(input);
        System.out.println(count);
    }
}

class CountWBAndBW {
    public int countWBAndBW(String input) {
        int countWB = 0;
        int countBW = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("WB")) {
                countWB++;
            } else if (input.substring(i, i + 2).equals("BW")) {
                countBW++;
            }
        }

        return countWB + countBW;
    }
}
```
