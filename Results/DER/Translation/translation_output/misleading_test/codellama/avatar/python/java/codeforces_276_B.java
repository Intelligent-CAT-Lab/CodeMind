<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgduswebgkzeuqkcmkyhfmimegfygxglwqowj...
Expected output:
Secon

```
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


```
[/INST]
```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int count = 0;
        boolean x = true;
        for (Character key : map.keySet()) {
            if (map.get(key) % 2 != 0 && count < 1) {
                count++;
            } else if (map.get(key) % 2 != 0 && count >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && input.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}
```
This code uses a `HashMap` to keep track of the characters in the input string and their frequencies. It then iterates through the map and checks if there are any characters with an odd frequency. If there are, it sets the `x` variable to `false` and breaks out of the loop. If there are no characters with an odd frequency, it sets `x` to `true`. Finally, it prints "First" if `x` is `true`, "Second" if `x` is `false` and the length of the input string is even, and "First" if `x` is `false` and the length of the input string is odd.</s>
