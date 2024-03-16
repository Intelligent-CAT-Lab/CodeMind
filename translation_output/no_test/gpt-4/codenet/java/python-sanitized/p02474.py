import sys

BIG_NUM = 2000000000
MOD = 1000000007

def main():
    try:
        input_str = input().split()
        
        A = int(input_str[0])
        B = int(input_str[1])
        
        ans = A * B
        print(ans)
    except Exception as e:
        raise e

if __name__ == "__main__":
    main()