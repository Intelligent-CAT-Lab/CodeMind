<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b = [int(x) for x in input().split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class AliceBob {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
    if (j.indexOf(a) > j.indexOf(b)) {
      System.out.println("Alice");
    } else if (j.indexOf(a) < j.indexOf(b)) {
      System.out.println("Bob");
    } else {
      System.out.println("Draw");
    }
  }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `indexOf` method to find the index of an element in an array.</s>
