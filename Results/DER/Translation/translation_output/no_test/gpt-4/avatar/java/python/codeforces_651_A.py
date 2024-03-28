Here is the translated Python code based on the given Java code:

```python
num1 = int(input())
num2 = int(input())
counter = 0

while num1 != 0 and num2 != 0:
    if num1 == 1 and num2 == 1:
        break

    if num1 <= num2:
        num1 += 1
        num2 -= 2
    else:
        num1 -= 2
        num2 += 1
        
    counter += 1

print(counter)
```

In Python, you typically don't need to import a Scanner class as you do in Java; instead, you can use the built-in `input()` function. I also removed the class definition and the `main` function since Python scripts can be executed directly without those constructs.
