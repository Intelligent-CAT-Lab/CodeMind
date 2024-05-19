System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print(7-int(week.get(a)))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] week = {0, 1, 2, 3, 4, 5, 6};

        int index = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(a)) {
                index = i;
                break;
            }
        }

        System.out.println(7 - week[index]);
    }
}
```<|endoftext|>
