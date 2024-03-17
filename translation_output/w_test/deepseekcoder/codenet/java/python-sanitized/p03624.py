def find_missing_letter(s):
    count = [0]*26
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    for char in s:
        count[alphabet.index(char)] += 1
    for i in range(26):
        if count[i] == 0:
            return alphabet[i]
    return "None"

print(find_missing_letter(input()))