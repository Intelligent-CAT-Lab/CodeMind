import sys

def main():
    # Read input from command line arguments
    A, B, K = map(int, input().split())
    
    if K <= A:
        A -= K
    elif K <= A + B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0
        
    # Print the result
    print(A, B)

if __name__ == "__main__":
    main()