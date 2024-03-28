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