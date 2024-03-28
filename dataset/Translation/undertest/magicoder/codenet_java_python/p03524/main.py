def check_string(s):
    a = s.count('a')
    b = s.count('b')
    c = s.count('c')
    if max(a, b, c) - min(a, b, c) <= 1:
        return "YES"
    else:
        return "NO"

print(check_string("abac"))