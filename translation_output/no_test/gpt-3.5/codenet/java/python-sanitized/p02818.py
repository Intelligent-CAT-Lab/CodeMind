import sys

def main():
    # Java Scanner equivalent in Python
    input_values = list(map(int, sys.stdin.readline().strip().split()))
    A, B, K = input_values
    
    if K <= A:
        A -= K
    elif K <= A+B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0
        
    print(A, B)

if __name__ == "__main__":
    main()