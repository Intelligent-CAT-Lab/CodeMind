import sys

def main():
    question = sys.stdin.readline().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = any(e.lower() == ch.lower() or e == ch for e in vowels)
    print("YES" if b else "NO")

if __name__ == "__main__":
    main()