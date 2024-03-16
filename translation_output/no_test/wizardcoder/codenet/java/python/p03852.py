Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class  p03852{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextLine();

        if (c.equals("a")) {
            System.out.println("vowel");
        } else if (c.equals("i")) {
            System.out.println("vowel");
        } else if (c.equals("u")) {
            System.out.println("vowel");
        } else if (c.equals("e")) {
            System.out.println("vowel");
        } else if (c.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

}
```

### Response:
```python
import java.util.Scanner;

public class  p03852{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextLine();

        if (c == "a" or c == "i" or c == "u" or c == "e" or c == "o"):
            System.out.println("vowel");
        else:
            System.out.println("consonant");
    }

}
```

In Python, we can use the `or` operator to check if a character is equal to any of the vowels. We can also use the `==` operator to check if a character is equal to a specific vowel.<|endoftext|>
