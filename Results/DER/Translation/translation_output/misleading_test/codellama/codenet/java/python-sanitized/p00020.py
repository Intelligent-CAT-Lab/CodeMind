import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        output = ""
        for char in line:
            if char.islower():
                output += char.upper()
            else:
                output += char
        print(output)

if __name__ == "__main__":
    main()