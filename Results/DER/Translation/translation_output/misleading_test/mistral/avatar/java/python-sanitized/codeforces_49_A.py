import sys

def main():
    question = input().strip()
    originalQ = question[:-1].strip()
    ch = question[-1]
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = any(e in vowels or e.lower() in vowels for e in [ch, ch.lower()])
    print("YES" if b else "NO")

if __name__ == "__main__":
    main()