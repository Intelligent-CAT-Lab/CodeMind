import sys

def main():
    a, b = map(int, input().split())
    print(max(a + b, a - b, a * b))

if __name__ == "__main__":
    # Redirect input from sys.stdin to accommodate the test case format
    sys.stdin = open("input.txt", "r")
    
    main()

# To run the test case provided using Python, you can create an 'input.txt'
# file with the content "3 1", and the script will read from that file instead
# of the standard input. To revert back to standard input, you can remove or comment
# out the 'sys.stdin = open("input.txt", "r")' line.