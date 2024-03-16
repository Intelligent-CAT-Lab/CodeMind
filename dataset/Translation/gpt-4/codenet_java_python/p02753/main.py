import sys

# Static variables
MIN = float('-inf')
MAX = float('inf')

# Equivalent print and println functions
def print_(*args, end=' '):
    sys.stdout.write(" ".join(map(str, args)) + end)

def println(*args):
    print_(*args, end='\n')

# Equivalent array reading functions
def read_int_array(N):
    return [int(input()) for _ in range(N)]

def read_long_array(N):
    return [int(input()) for _ in range(N)]

def read_string_array(N):
    return [input() for _ in range(N)]

# Debug function
def debug(*args):
    print(*args, file=sys.stderr)

# Main function
def main():
    S = input()
    if all(S[0] == S[i] for i in range(1, len(S))):
        println("No")
    else:
        println("Yes")

# Python equivalent of Java's `public static void main`
if __name__ == "__main__":
    main()