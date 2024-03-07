import sys

def main():
    s = input()
    print((len(s) - len(s.replace("o", ""))) * 100 + 700)

if __name__ == "__main__":
    main()