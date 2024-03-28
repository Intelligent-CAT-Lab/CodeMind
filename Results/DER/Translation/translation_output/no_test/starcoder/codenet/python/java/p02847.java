<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print(7-int(week.get(a)))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Map<String,Integer> week = new HashMap<String,Integer>();
        week.put("SUN",0);
        week.put("MON",1);
        week.put("TUE",2);
        week.put("WED",3);
        week.put("THU",4);
        week.put("FRI",5);
        week.put("SAT",6);
        System.out.println(7-week.get(a));
    }
}
```
<|endoftext|>
