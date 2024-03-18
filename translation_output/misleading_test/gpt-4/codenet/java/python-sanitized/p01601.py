def is_palin(s):
    for i in range(len(s) // 2):
        if s[i] != s[len(s) - i - 1]:
            return False
    return True

def nearest_palindrome(n):
    i = 0
    while True:
        if is_palin(str(n - i)):
            return n - i
        if is_palin(str(n + i)):
            return n + i
        i += 1

# Test input
test_input = 13

# Expected output: -63
output = nearest_palindrome(test_input)
print(output)