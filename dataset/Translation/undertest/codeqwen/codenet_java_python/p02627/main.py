import re

def main():
    str = input()
    print("A" if re.match("[A-Z]", str) else "a")

if __name__ == "__main__":
    main()