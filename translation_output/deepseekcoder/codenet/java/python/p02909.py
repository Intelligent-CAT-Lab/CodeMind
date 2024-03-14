<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
def main():
    str = input()

    if str == "Sunny":
        print("Cloudy")
    elif str == "Cloudy":
        print("Rainy")
    elif str == "Rainy":
        print("Sunny")

if __name__ == "__main__":
    main()
```
<|EOT|>
