class main:
    import sys
    
    res = [0] * 26
    
    for line in sys.stdin:
        for char in line:
            if char.isalpha() and char.isupper():
                res[char.isupper() - 65] += 1
            elif char.isalpha() and char.islower():
                res[char.islower() - 97] += 1
    
    for i, count in enumerate(res):
        print(chr(i + 97), ":", count)