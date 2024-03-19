<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Sunny

Expected output:
C nuN=

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

@@ Response
```python
def weather_forecast(weather):
    if weather == "Sunny":
        return "Cloudy"
    elif weather == "Cloudy":
        return "Rainy"
    elif weather == "Rainy":
        return "Sunny"

# Test input
print(weather_forecast("Sunny"))  # Expected output: "Cloudy"
```<｜end▁of▁sentence｜>
