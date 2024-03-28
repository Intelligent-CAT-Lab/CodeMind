def check_palindrome_permutation(word):
    acha = ord('a')
    zcha = ord('z')
    count = 0
    for i in range(acha, zcha + 1):
        for x in word:
            if ord(x) == i:
                count += 1
        if count % 2 == 1:
            return "No"
        count = 0
    return "Yes"

# Test input
word = "abaccaba"
print(check_palindrome_permutation(word))