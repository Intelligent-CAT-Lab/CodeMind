Below is the translated Python code for the provided Java code:

```python
# Read the input as a string and split it into a list
numDog = input().split(" ")

result = 0
# Loop through the list and convert each element to an integer and add to the result
for i in range(len(numDog)):
    result += int(numDog[i])

# Output the result
print(result)
```

To test this with the input `4 2 1 1`, you can just run the script and enter the numbers. Here is the expected output when the given script is executed:

```
Test input:
4 2 1 1

Expected output:
-55
```

However, there seems to be a discrepancy with the provided expected output and the logic in the Java code. The Java code is simply adding the input numbers together. If you input `4 2 1 1`, the output of the program would be `8` (since `4 + 2 + 1 + 1 = 8`), not `-55`.

If you indeed expect the output to be `-55`, then there might be additional logic or a typo in the Java code or the expected result that hasn't been provided. Please check the requirements and provide any additional details if necessary.
