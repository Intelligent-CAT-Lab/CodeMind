<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=input()

if n==1:
	print "1\n0"
elif n==2:
	print "2\n0\n11"
else:
	print n-1
	for i in xrange(n-1):
		print "1"+("0"*i)+"1"



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1");
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("2");
            System.out.println("0");
            System.out.println("11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.println("1" + "0".repeat(i) + "1");
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `repeat` method is used to repeat a string a certain number of times.</s>
