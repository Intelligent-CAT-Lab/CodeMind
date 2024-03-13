import sys

def compute():
    for line in sys.stdin:
        for i in range(26):
            converted = ""
            for c in line.strip():
                if 'a' <= c <= 'z':
                    converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                else:
                    converted += c
            if "the" in converted or "this" in converted or "that" in converted:
                print(converted)
                break

compute()