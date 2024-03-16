<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

l = [ ]
limit = 10000000000
def gen ( number , four , seven ) :
    if ( number > limit ) :
        return
    if ( number > 0 and four == seven ) :
        l . append ( number )
    gen ( number * 10 + 4 , four + 1 , seven )
    gen ( number * 10 + 7 , four , seven + 1 )
def main ( ) :
    gen ( 0 , 0 , 0 )
    l . sort ( )
    n = int ( input ( ) )
    ans = 0
    for val in l :
        if ( val >= n ) :
            ans = val
            break
    print ( ans )
main ( )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        gen(0, 0, 0);
        l.sort(null);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;

        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }

        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }
}
```
Note that the `gen` method is recursive, and it uses the `ArrayList` class to store the numbers. The `main` method uses a `Scanner` object to read input from the user, and it uses a `for` loop to iterate over the elements of the `ArrayList` and find the first number that is greater than or equal to the input. Finally, it prints the result to the console.</s>
