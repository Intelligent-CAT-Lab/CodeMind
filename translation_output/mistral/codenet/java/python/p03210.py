<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.math.BigDecimal;

public class p03210 {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}
```
[/INST]
```python
import java.util
import java.math.BigDecimal

def main():
    sc = java.util.Scanner(System.in)
    age = sc.nextInt()
    
    if age == 3 or age == 5 or age == 7:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```</s>
