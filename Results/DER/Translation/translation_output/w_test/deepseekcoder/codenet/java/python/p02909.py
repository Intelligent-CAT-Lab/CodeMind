<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys

def weather_forecast(weather):
    if weather == "Sunny":
        return "Cloudy"
    elif weather == "Cloudy":
        return "Rainy"
    elif weather == "Rainy":
        return "Sunny"

if __name__ == "__main__":
    weather = sys.stdin.readline().strip()
    print(weather_forecast(weather))
```

In this Python code, we define a function `weather_forecast` that takes a string `weather` as input. It checks the value of `weather` and returns the next weather condition based on the given conditions. The `if __name__ == "__main__":` block is used to read the input from the standard input and print the output of the `weather_forecast` function.
<|EOT|>
