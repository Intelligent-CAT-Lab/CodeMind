import sys

def solve(inp):
    if inp == "ani":
        return "square1001"
    else:
        return "e869120"

def main():
    inp = sys.stdin.readline().strip()
    print(solve(inp))

if __name__ == "__main__":
    main()