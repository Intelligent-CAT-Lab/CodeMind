<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print(7-int(week.get(a)))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();

        int week = 0;
        switch (a) {
            case "SUN":
                week = 0;
                break;
            case "MON":
                week = 1;
                break;
            case "TUE":
                week = 2;
                break;
            case "WED":
                week = 3;
                break;
            case "THU":
                week = 4;
                break;
            case "FRI":
                week = 5;
                break;
            case "SAT":
                week = 6;
                break;
            default:
                break;
        }

        System.out.println(7 - week);
    }
}
```</s>
