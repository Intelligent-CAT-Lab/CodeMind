Below is the Python translation of your provided Java code. The input and output handling in Python is a bit different as it doesn't inherently use a Scanner class like Java does. Instead, I have used `input()` to gather input from the user and split the input to get individual numbers.

```python
# Read input from user and split into three integers
a, b, c = map(int, input().split())

# Check the conditions and print the result accordingly
if (a == 5 and b == 7 and c == 5) or (a == 5 and b == 5 and c == 7) or (a == 7 and b == 5 and c == 5):
    print("YES")
else:
    print("NO")

# Sample test case in Python
# To run the test case, you'll need to input the numbers "5 5 7" (without quotes) when prompted.
```

When you run this Python code, it will wait for input. For testing with the input `5 5 7`, you'll need to input that when prompted and then press `Enter`. The expected output would be "NO", as per your conditions, not the expected output "UDS" mentioned in the prompt, which seems unrelated to the code logic.
