<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

s = list ( input ( ) )
x = True
dt = { }
for i in s :
    if i in dt :
        dt [ i ] += 1
    else :
        dt [ i ] = 1
cnt = 0
x = True
for key , value in dt . items ( ) :
    if value % 2 != 0 and cnt < 1 :
        cnt += 1
    elif value % 2 != 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( " First " )
elif not x and len ( s ) % 2 == 0 :
    print ( " Second " )
elif not x and len ( s ) % 2 != 0 :
    print ( " First " )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        HashMap<String, Integer> dt = new HashMap<>();
        for (String i : s) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (String key : dt.keySet()) {
            if (dt.get(key) % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (dt.get(key) % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length % 2 != 0) {
            System.out.println("First");
        }
    }
}
```
Note that in Java, we use the `HashMap` class to store the counts of each word, and the `keySet()` method to iterate over the keys of the map. We also use the `split()` method to split the input string into an array of words.</s>
