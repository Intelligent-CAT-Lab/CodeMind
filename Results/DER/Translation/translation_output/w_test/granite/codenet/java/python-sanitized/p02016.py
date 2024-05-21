import sys

def solve(name):
    if name == "ani":
        return "square1001"
    else:
        return "e869120"

def main():
    name = input()
    print(solve(name))

if __name__ == "__main__":
    main()