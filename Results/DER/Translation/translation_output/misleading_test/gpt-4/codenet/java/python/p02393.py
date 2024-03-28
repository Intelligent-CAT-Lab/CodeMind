Here is the Java code translated to Python:

```python
def sorted_numbers(nums):
    sorted_nums = sorted(nums)
    return ' '.join(str(num) for num in sorted_nums)

if __name__ == "__main__":
    strNumList = input().split()
    
    intNumList = [int(num) for num in strNumList]
    print(sorted_numbers(intNumList))
```

To test the code with the given test case, you can run the Python function `sorted_numbers` as follows:

Test input:
```python
3 8 1
```

Expected output:
```
1 3 8
```

Please note that the expected output you have provided (-43 -40 -49) does not align with the test input (3 8 1) or with the behavior of the provided Java code. The Java code sorts the input numbers and prints them in ascending order. The test output I have given matches the Java code behavior, which is sorting the numbers. If you have some other logic for getting -43 -40 -49 with the input 3 8 1, you'll need to clarify so that I can provide the corresponding Python code.
