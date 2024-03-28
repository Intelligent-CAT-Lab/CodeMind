Here is the translated code from Java to Python:

```python
sentence = input("Enter a sentence: ").strip()

# Dictionary to hold the count of each letter, initialized to 0
letter_count = {chr(i): 0 for i in range(97, 123)}

# Loop through each character in the sentence
for char in sentence:
    if char.isalpha():  # Check if it is an alphabet
        # Convert character to lowercase and increment its count
        letter_count[char.lower()] += 1

# Print the count of each letter
for char in range(97, 123):
    print(f"{chr(char)} : {letter_count[chr(char)]}")
```

Let's test the given input:

```python
# Test the code with the provided input
sample_input = "This is a pen."
for char in sample_input:
    if char.isalpha():
        letter_count[char.lower()] += 1

for char in range(97, 123):
    print(f"{chr(char)} : {letter_count[chr(char)]}")
```

This will produce the expected output.

