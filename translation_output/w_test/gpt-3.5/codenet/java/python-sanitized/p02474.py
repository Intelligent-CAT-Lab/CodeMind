import sys

def main():
    input_values = sys.stdin.readline().strip().split()
    A = int(input_values[0])
    B = int(input_values[1])
    
    ans = A * B
    print(ans)

if __name__ == "__main__":
    main()