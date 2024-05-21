import re

def main():
    s = input()
    m = re.match(r"^AtCoder (\w+) Contest$", s)
    if m:
        print("A" + m.group(1).upper() + "C")

if __name__ == "__main__":
    main()