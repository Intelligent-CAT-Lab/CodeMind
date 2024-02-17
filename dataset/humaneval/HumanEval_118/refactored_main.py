word = "yogurt"
vowels = {"a", "e", "i", "o", "u", "A", "E", 'O', 'U', 'I'}

if len(word) < 3:
    print("")
else:
    for i in range(len(word)-2, 0, -1):
        if word[i] in vowels:
            if (word[i+1] not in vowels) and (word[i-1] not in vowels):
                print(word[i])
                break
    else:
        print("")