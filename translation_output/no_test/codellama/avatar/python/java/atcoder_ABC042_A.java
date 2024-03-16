<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:


ABC = tuple ( map ( int , input ( ) . split ( ) ) )
if ABC . count ( 5 ) == 2 :
    print ( ' YES ' if sum ( ABC ) == 17 else ' NO ' )
else :
    print ( ' NO ' )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] ABC = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ABC[i] = Integer.parseInt(numbers[i]);
        }
        if (ABC.length == 3) {
            int count = 0;
            for (int i = 0; i < ABC.length; i++) {
                if (ABC[i] == 5) {
                    count++;
                }
            }
            if (count == 2) {
                int sum = 0;
                for (int i = 0; i < ABC.length; i++) {
                    sum += ABC[i];
                }
                if (sum == 17) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
```

Note that the Java code uses the `Scanner` class to read input from the user, and the `split` method to split the input string into an array of strings. The `parseInt` method is used to convert each string in the array to an integer. The `count` method is used to count the number of elements in the array that are equal to 5. The `sum` method is used to calculate the sum of the elements in the array. Finally, the `println` method is used to print the result to the console.</s>
