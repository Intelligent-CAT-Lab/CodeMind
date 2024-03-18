```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] numbers = new int[2];
        for (int i = 0; i < 2; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        int start = 0;
        ArrayList<String> arr = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < numbers[0]; i++) {
            StringBuilder string = new StringBuilder(" ");
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string.append(" L ");
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = start == 0 ? 1 : 0;
                        }
                    } else {
                        string.append(" S ");
                    }
                } else {
                    string.append(" S ");
                }
            }
            arr.add(string.toString());
        }

        if (count < numbers[1]) {
            System.out.println(" NO ");
        } else {
            System.out.println(" YES ");
            for (String str : arr) {
                System.out.println(str);
            }
        }
    }
}
```
```
