def find_missing_letter(s):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    count = [0]*26
    for char in s:
        count[ord(char)-97] += 1
    for i in range(26):
        if count[i] == 0:
            return alphabet[i]
    return "None"

print(find_missing_letter(input()))