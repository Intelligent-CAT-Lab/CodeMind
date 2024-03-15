<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x , y , a , b = [ int ( i ) for i in input ( ) . split ( ) ]
c = [ [ i , j ] for i in range ( a , x + 1 ) for j in range ( b , y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```
[/INST]
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);

        List<List<Integer>> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    c.add(temp);
                }
            }
        }

        System.out.println(c.size());
        for (List<Integer> list : c) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
```</s>
