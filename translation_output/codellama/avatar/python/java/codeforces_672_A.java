<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

li = [ ]
ind = 0
for i in range ( 1 , 371 ) :
    temp = [ ]
    p , q = i , i
    count = 0
    while p != 0 :
        p //= 10
        count += 1
    if count == 1 :
        li . append ( i )
    if count == 2 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
    if count == 3 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
li . pop ( )
li . pop ( )
n = int ( input ( ' ' ) )
print ( li [ n - 1 ] )



Translate the above python code to java.

java Code:

[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int[] temp = new int[i];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[ind++] = x;
                }
                li.addAll(temp);
            } else if (count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[ind++] = x;
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(li.get(n - 1));
    }
}
```
This is the Java code equivalent to the Python code. It uses the same logic and data structures as the Python code, but with Java syntax.

Note that the `ArrayList` class in Java is used to store the list of numbers, and the `Scanner` class is used to read input from the user. The `addAll` method is used to add the elements of the `temp` array to the `li` list, and the `remove` method is used to remove the last two elements from the list.</s>
