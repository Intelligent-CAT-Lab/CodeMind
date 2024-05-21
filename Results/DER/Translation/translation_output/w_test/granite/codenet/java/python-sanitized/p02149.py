import sys

def main():
    max_val = 0
    max_idx = 0
    for i, val in enumerate(map(int, sys.stdin.readline().split())):
        if val > max_val:
            max_val = val
            max_idx = i
    print(chr(ord('A') + max_idx))

if __name__ == "__main__":
    main()