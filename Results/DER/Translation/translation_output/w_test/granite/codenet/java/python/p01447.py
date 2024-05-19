System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
2


```
import java.util.Scanner;
 
 
public class p01447{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	long n = sc.nextLong();
    	int count = 0;
    	
    	while(n > 1){
    		n  = (n + (n % 3 == 0? 0 : 3 - n % 3)) / 3;
    		count++;
    	}
    	
    	System.out.println(count);
    	
    }
     
}
```


Answer:
```python
def main():
    n = int(input())
    count = 0
    while n > 1:
        n = (n + (n % 3 == 0? 0 : 3 - n % 3)) // 3
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "8",
]

test_outputs = [
    "2",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    input_value = test_input
    expected_value = expected_output
    try:
        output = str(main())
        assert output == expected_value, f"Expected {expected_value}, got {output}"
        print("Success!")
    except Exception as e:
        print(f"Failed: {e}")
```<|endoftext|>
