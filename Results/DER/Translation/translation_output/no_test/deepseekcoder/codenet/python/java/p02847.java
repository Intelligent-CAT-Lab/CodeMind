<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print(7-int(week.get(a)))
```

### Response:
```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();

        HashMap<String, Integer> week = new HashMap<>();
        week.put("SUN", 0);
        week.put("MON", 1);
        week.put("TUE", 2);
        week.put("WED", 3);
        week.put("THU", 4);
        week.put("FRI", 5);
        week.put("SAT", 6);

        System.out.println(7 - week.get(a));
    }
}
```
<|EOT|>
