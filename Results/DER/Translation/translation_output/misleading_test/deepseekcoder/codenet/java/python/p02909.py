<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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
    else:
        return "Invalid input"

if __name__ == "__main__":
    weather = sys.stdin.readline().strip()
    print(weather_forecast(weather))
```

In this Python code, we define a function `weather_forecast` that takes a string `weather` as input. It checks if the input is "Sunny", "Cloudy", or "Rainy" and returns the next weather condition accordingly. If the input is not one of these, it returns "Invalid input". The main part of the code reads a line from standard input, strips the newline character, and passes it to the `weather_forecast` function, printing the result.
<|EOT|>
