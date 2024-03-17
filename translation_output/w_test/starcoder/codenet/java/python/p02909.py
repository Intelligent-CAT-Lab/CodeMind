<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Sunny

Expected output:
Cloudy


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

python code:<fim_suffix><fim_middle>

```python
str = input()
if str == "Sunny":
    print("Cloudy")
elif str == "Cloudy":
    print("Rainy")
elif str == "Rainy":
    print("Sunny")
```
<|endoftext|>
