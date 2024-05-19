System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n=int(input())

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print(dic[n])
else:
    print(":(")
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            dic.put(p, i);
        }
        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```

In this Java code, we first import the necessary classes: `Scanner` for input, `HashMap` for the dictionary, and `Map` for the interface. We then define a `main` method that serves as the entry point for the program.

Inside the `main` method, we create a `Scanner` object to read input from the user. We then declare an integer variable `n` and assign it the value read from the user using the `nextInt` method of the `Scanner` object.

Next, we create a `HashMap` object called `dic` to store the key-value pairs. We iterate from 1 to 50000 using a `for` loop and calculate the value `p` for each iteration using the formula `i * 1.08`. We then put the key-value pair `p` to `i` in the `dic` dictionary using the `put` method of the `HashMap` object.

After the loop, we check if the `dic` dictionary contains the key `n` using the `containsKey` method of the `Map` interface. If it does, we print the corresponding value using the `get` method of the `HashMap` object. Otherwise, we print `:(` to indicate that the input `n` was not found in the dictionary.

I hope this helps! Let me know if you have any further questions.<|endoftext|>
