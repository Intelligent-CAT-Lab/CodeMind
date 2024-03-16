def p00435():
    s = input()
    result = ""
    for c in s:
        result += chr((ord(c) - 42) % 26 + 65)
    print(result)

if __name__ == "__main__":
    p00435()