Below is the translated Python code for the given Java code. The code reads two space-separated numbers from standard input, multiplies them, and prints the result.

```python
import sys

def main():
    # Read a line from standard input and split it into A and B
    input_numbers = input().split()
    
    # Convert string inputs to integers
    A = int(input_numbers[0])
    B = int(input_numbers[1])
    
    # Calculate the product
    ans = A * B
    
    # Print the result
    print(ans)

if __name__ == '__main__':
    main()
```

To run the test case provided (5 8) with the expected output of 40, you can either run this code with an interactive Python shell or redirect the input from a file containing "5 8" as its content.
