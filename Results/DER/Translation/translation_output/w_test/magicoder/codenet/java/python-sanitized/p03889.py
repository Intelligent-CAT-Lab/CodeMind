def is_palindrome(s):
    s = s.replace('b', 't').replace('d', 'b').replace('p', 'r').replace('q', 'p').replace('t', 'd')
    return s == s[::-1]

s = input()
print("Yes" if is_palindrome(s) else "No")