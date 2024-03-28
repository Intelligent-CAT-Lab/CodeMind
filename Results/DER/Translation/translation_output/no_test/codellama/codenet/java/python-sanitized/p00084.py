import re

def main():
    with open("input.txt") as f:
        for line in f:
            line = line.strip()
            tokens = re.split(r"\s+", line)
            for token in tokens:
                if len(token) >= 3 and len(token) <= 6:
                    print(token, end=" ")
            print()

if __name__ == "__main__":
    main()