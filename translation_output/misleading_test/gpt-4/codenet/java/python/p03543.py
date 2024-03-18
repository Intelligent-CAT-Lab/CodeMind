Here's the Python translation of the given Java code:

```python
n = int(input())

n1 = n % 10
n10 = (n - n1) % 100 // 10
n100 = (n - n1 - n10 * 10) % 1000 // 100
n1000 = n // 1000

if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
    print("Yes")
else:
    print("No")
```

To test the provided input `1118`, just run the code and type `1118` into the console, then press enter.

The expected output would be "No" based on the given example, as only the two middle digits match (which is not a case that results in "Yes" according to the Java code). However, the expected output mentioned in the prompt is "e+X" which does not correlate with the behavior of the given Java code. Assuming that the Java code behavior is what you're after, the provided Python code will output "No" for the test input `1118`.
