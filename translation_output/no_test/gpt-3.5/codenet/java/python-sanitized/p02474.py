from sys import stdin
from math import floor

def main():
    input_data = stdin.readline().strip().split()
    
    A = int(input_data[0])
    B = int(input_data[1])

    ans = A * B
    print(ans)

if __name__ == '__main__':
    main()