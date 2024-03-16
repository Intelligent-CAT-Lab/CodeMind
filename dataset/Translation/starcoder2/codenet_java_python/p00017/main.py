import re

while True:
    try:
        s = input()
        for i in range(26):
            converted = ""
            for j in range(len(s)):
                c = s[j]
                if c >= 'a' and c <= 'z':
                    converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                else:
                    converted += c
            if re.search(r'the|this|that', converted):
                print(converted)
                break
    except EOFError:
        break