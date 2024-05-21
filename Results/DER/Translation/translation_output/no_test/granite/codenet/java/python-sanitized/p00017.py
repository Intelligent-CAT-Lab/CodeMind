import sys

def compute():
    for line in sys.stdin:
        S = line.strip()
        for i in range(26):
            converted = ""
            for c in S:
                if c >= 'a' and c <= 'z':
                    converted += chr((ord(c) - ord('a') + i) % 26 + ord('a'))
                else:
                    converted += c
            if "the" in converted or "this" in converted or "that" in converted:
                print(converted)
                break

compute()