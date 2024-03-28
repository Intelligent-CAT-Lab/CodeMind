def check_string(s):
    abc = [False, False, False]
    for i in range(len(s)):
        if s[i] == 'a':
            abc[0] = True
        if s[i] == 'b':
            abc[1] = True
        if s[i] == 'c':
            abc[2] = True

    is_ok = True
    for i in range(len(abc)):
        is_ok &= abc[i]

    return "Yes" if is_ok else "No"

# Test input
print(check_string("bac"))