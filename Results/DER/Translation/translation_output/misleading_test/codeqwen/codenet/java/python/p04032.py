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

This Python code reads input from the standard input (stdin) line by line. It then converts each line into a list of characters. It then iterates over the list, checking for consecutive characters. If it finds a pair of consecutive characters, it sets the result_num1 and result_num2 variables to the indices of the first and second characters in the pair, respectively, and breaks out of the loop. If it doesn't find any consecutive characters, it sets result_num1 and result_num2 to -1 and -1, respectively. Finally, it prints the values of result_num1 and result_num2.
