Here is the Python equivalent of the Java code:

```python
import sys

for line in sys.stdin:
    str_array = list(line.strip())
    result_num1 = -1
    result_num2 = -1

    for i in range(len(str_array)):
        if i + 1 < len(str_array) and str_array[i] == str_array[i + 1]:
            result_num1 = i + 1
            result_num2 = i + 2
            break

        if i + 2 < len(str_array) and str_array[i] == str_array[i + 2]:
            result_num1 = i + 1
            result_num2 = i + 3
            break

    print(result_num1, result_num2)
```

This Python code reads input from the standard input (stdin) line by line. It then converts each line into a list of characters. It then iterates over the list, checking if the current character is equal to the next two characters. If it is, it sets the result numbers and breaks out of the loop. Finally, it prints the result numbers.
