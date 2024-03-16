import re

def compute():
    while True:
        try:
            S = input()
        except EOFError:
            break
        for i in range(26):
            converted = ""
            for c in S:
                if 'a' <= c <= 'z':
                    converted += chr(ord(c) + i if ord(c) + i <= ord('z') else ord(c) + i - 26)
                else:
                    converted += c
            if "the" in converted or "this" in converted or "that" in converted:
                print(converted)
                break

compute()