import re

def compute():
    while True:
        S = input()
        if not S:
            break
        for i in range(26):
            converted = ""
            for c in S:
                if 'a' <= c <= 'z':
                    converted += chr((ord(c) - ord('a') + i) % 26 + ord('a'))
                else:
                    converted += c
            if re.search(r'\b(the|this|that)\b', converted):
                print(converted)
                break

compute()