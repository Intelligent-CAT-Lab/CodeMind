def solve(word):
    uppercase = sum(1 for c in word if c.isupper())
    lowercase = sum(1 for c in word if c.islower())

    if uppercase > lowercase:
        return word.upper()
    elif lowercase > uppercase:
        return word.lower()
    else:
        return word.lower()

word = input()
print(solve(word))