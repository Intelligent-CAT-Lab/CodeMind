import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    
    result = "No"
    if a <= c <= b:
        result = "Yes"
    
    print(result)

if __name__ == "__main__":
    main()