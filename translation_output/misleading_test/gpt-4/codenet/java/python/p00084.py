Here is the Python translation for the provided Java code:

```python
# Sample test input
input_string = "Rain, rain, go to Spain."

# Replace the periods and commas with spaces as per the Java code
modified_string = input_string.replace('.', ' ').replace(',', ' ')

# Split the modified string into words
tokens = modified_string.split()

# Initialize a list to store the words that meet the condition
results = []

# Iterate over the split words
for token in tokens:
    n = len(token)
    # Check if the word length is between 3 and 6 inclusive
    if 3 <= n <= 6:
        results.append(token)

# Join the resulting words with a space and print the final output
output_string = ' '.join(results)
print(output_string)
```

For the test input "Rain, rain, go to Spain.", the expected output would be produced as follows:

```python
# Test input
input_string = "Rain, rain, go to Spain."

# Python code execution
modified_string = input_string.replace('.', ' ').replace(',', ' ')
tokens = modified_string.split()
results = []
for token in tokens:
    n = len(token)
    if 3 <= n <= 6:
        results.append(token)
output_string = ' '.join(results)
print(output_string)  # Expected output: Rain rain Spai
```
Note that the Python code provided above defines the logic without the use of a `Scanner` object or an explicit main function, adapting to Python's scripting nature. The actual reading of input and execution of this logic in a more script-like format will require the use of functions like `input()`, but for the provided example, a sample input string is given directly within the code.
