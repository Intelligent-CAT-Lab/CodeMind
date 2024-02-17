words = ["name", "of", "string"]
print(sorted(words, key = lambda x: (-len(set(x)), x))[0])