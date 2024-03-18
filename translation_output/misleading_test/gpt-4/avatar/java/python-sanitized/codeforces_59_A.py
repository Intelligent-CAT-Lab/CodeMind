word = input()
uppercase = sum(1 for ch in word if ch.isupper())
lowercase = sum(1 for ch in word if ch.islower())

if uppercase > lowercase:
    print(word.upper())
else:
    print(word.lower())