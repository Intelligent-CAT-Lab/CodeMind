class main:
    s = input()
    result = ""
    for c in s:
        result += chr((ord(c) - 42) % 26 + 65)
    print(result)