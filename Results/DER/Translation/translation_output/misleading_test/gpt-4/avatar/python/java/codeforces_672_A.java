Below is the translated Java code that implements the same logic as the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count += 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(0, x); // Add in reverse order
                }
                li.addAll(temp);
            }
            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(0, x); // Add in reverse order
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);

        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }
}
```

This Java code follows the same logic as the Python code, by translating the structures like loops and conditionals directly. The `List<Integer>` class in Java is used to represent the list structure that is more dynamic in Python. Since Java does not have the `[::-1]` slice operator to reverse lists, I used `temp.add(0, x);` to insert elements at the beginning of the temporary list (`temp`), thus reversing the numbers in each group of 2 or 3 digits. The last two elements are removed from the list by calling `remove()` method on the list object, passing the index of the element we wish to remove. The input is read using the `Scanner` class, and the result is printed to the console.

Please note that you need to have this code within a class in a file named `Main.java` if you intend to run it. Also, the `import` statements at the beginning of the file are necessary to use ArrayList and Scanner functionalities in Java.
