s = "Mary had a little lamb"
n = 4
result = []
for word in s.split():
    n_consonants = 0
    for i in range(0, len(word)):
        if word[i].lower() not in ["a","e","i","o","u"]:
            n_consonants += 1 
    if n_consonants == n:
        result.append(word)
print(result)