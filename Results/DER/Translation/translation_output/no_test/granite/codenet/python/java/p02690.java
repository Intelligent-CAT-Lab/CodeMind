System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
x=int(input())
for i in range(-1000,1000):
  for j in range(-1000,1000):
    if i**5-j**5==x:
      print(i,j)
      break
  else:
    continue
  break
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = -1000; i < 1000; i++) {
            for (int j = -1000; j < 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
```

This Java code uses a nested for loop to iterate through all possible values of i and j within the specified range. It checks if the fifth power of i minus the fifth power of j is equal to the input value x. If a match is found, it prints the values of i and j and breaks out of the inner loop. If no match is found, it continues to the next iteration of the outer loop. The program terminates after printing all matching pairs of i and j.<|endoftext|>
