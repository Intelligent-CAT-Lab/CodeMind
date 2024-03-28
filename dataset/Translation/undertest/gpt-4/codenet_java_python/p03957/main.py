import sys

def solve(s):
    c_index = s.find('C')
    f_index = s.rfind('F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        return "No"
    else:
        return "Yes"

def main():
    s = input().strip()  # Read input from standard input
    result = solve(s)
    print(result)  # Print the result to standard output

if __name__ == "__main__":
    main()