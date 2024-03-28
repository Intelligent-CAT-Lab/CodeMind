import sys
import math

def main():
    l = sys.stdin.readline().split()
    answer = math.floor(int(l[0])/3)
    print(answer)

if __name__ == "__main__":
    main()