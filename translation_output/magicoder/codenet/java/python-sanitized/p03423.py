import sys
import math

def main():
    line = sys.stdin.readline().strip()
    num = int(line)
    answer = math.floor(num / 3)
    print(answer)

if __name__ == "__main__":
    main()