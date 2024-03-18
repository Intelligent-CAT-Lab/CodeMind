import sys
import math

def main():
    # Reading the input as integers separated by spaces
    d, t, s = map(int, sys.stdin.readline().split())
    
    # Calculating the required time
    ans = d / s
    
    # Printing "Yes" if possible to reach on time, otherwise "No"
    print("Yes" if ans <= t else "No")

if __name__ == "__main__":
    main()