Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```

### Response:
```python
import java.util.Scanner;

public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = "thu:fri:sat:sun:mon:tue:wed".split(":");
        System.out.println(days[sc.nextInt()%7]);
    }
}
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We then define a class `p00354` with a `main` method that takes in an array of strings `args`.
- Inside the `main` method, we create a new instance of the `Scanner` class and store it in the variable `sc`.
- We then create a string array `days` that contains the days of the week in the format `thu:fri:sat:sun:mon:tue:wed`.
- We use the `split` method to split the string at the `:` character and store the resulting array in the `days` variable.
- We then use the `nextInt` method of the `Scanner` class to read an integer from the user and store it in the variable `day`.
- We use the modulo operator `%` to get the index of the day of the week in the `days` array.
- Finally, we print out the day of the week using the index obtained from the modulo operation.<|endoftext|>
