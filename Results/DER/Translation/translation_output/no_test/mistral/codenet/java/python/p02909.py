<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02909 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if(str.equals("Sunny"))
        {
          System.out.println("Cloudy");
        }
      	if(str.equals("Cloudy")){
          System.out.println("Rainy");
        }
      	if(str.equals("Rainy")){
		  System.out.println("Sunny");
        }
	}
}
```
[/INST]
```python
str = input()

if str == "Sunny":
    print("Cloudy")
elif str == "Cloudy":
    print("Rainy")
elif str == "Rainy":
    print("Sunny")
```</s>
