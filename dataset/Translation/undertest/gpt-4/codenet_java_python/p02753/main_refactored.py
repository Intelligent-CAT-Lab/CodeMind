class main:
    import sys
    
    # Function to print elements with a space in between
    def println(*args, end='\n'):
        print(*args, end=end)
        sys.stdout.flush()
    
    # Read a single integer
    def read_int():
        return int(input())
    
    # Read multiple integers on the same line
    def read_ints():
        return list(map(int, input().split()))
    
    # Read a string
    def read_string():
        return input()
    
    # Read a string array
    def read_string_array(N):
        return [input() for _ in range(N)]
    
    # Read an integer array
    def read_int_array(N):
        return [int(input()) for _ in range(N)]
    
    # Read a long array
    def read_long_array(N):
        return [int(input()) for _ in range(N)]
    
    # Main function
    def main():
        # Read the test input
        S = read_string()
        
        # Check if all characters are the same
        if S[0] == S[1] and S[1] == S[2]:
            println("No")
        else:
            println("Yes")
    
    if __name__ == '__main__':
        main()