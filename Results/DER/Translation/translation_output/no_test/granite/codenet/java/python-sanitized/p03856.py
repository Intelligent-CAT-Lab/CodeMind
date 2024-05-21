import re

good = ["dream", "dreamer", "erase", "eraser"]

def main():
    s = input()
    for g in good:
        if re.search(g, s):
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()