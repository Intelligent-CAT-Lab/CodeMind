def compute():
    sc = input()
    sc = sc.split('\n')
    for s in sc:
        converted = ""
        for c in s:
            if c >= 'a' and c <= 'z':
                converted += chr((ord(c) + i) % 26 + ord('a'))
            else:
                converted += chr(ord(c))
        if 'the' in converted or 'this' in converted or 'that' in converted:
            print(converted)
            break


if __name__ == '__main__':
    compute()