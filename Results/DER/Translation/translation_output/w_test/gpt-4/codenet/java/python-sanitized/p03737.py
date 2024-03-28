# Read the input as a single string and split it into words
words = input().split()

# Take the first character of the first three words, make them uppercase, and concatenate them
acronym = ''.join(word[0].upper() for word in words[:3])

# Print the result
print(acronym)