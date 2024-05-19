System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a = list ( map ( int, input ( ). split ( ) ) )
for e, i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```


Answer:
Here's the Java code equivalent to the Python code you provided:
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "1 2 3 0 5";
        String[] splitInput = input.split(" ");
        int[] a = Arrays.stream(splitInput).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

In this Java code, we first split the input string into an array of strings using the `split()` method. Then, we use the `Arrays.stream()` method to convert the array of strings into an array of integers using the `mapToInt()` method and the `Integer::parseInt` function. Finally, we iterate over the array of integers using a `for` loop and check if the current element is equal to 0. If it is, we print the index of the element plus 1 and break out of the loop.<|endoftext|>
