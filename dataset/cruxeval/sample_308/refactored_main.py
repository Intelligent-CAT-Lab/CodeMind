strings = ["La", "Q", "9", "La", "La"]
occurances = {}
for string in strings:
    if string not in occurances:
        occurances[string] = strings.count(string)
print(occurances)