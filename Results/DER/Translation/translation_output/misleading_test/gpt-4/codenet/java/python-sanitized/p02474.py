import sys

BIG_NUM = 2000000000
MOD = 1000000007

def main():
    input_data = sys.stdin.readline().strip().split()
    
    A = int(input_data[0])
    B = int(input_data[1])
    
    ans = A * B
    print(ans)

if __name__ == "__main__":
    main()