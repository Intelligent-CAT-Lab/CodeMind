def main():
    try:
        cmd = input()  # Reading input from stdin
        str_parts = cmd.split(" ")  # Splitting the input string on space
        
        # Parsing integers from split strings
        x = int(str_parts[0])
        y = int(str_parts[1])
        
        # Comparing x and y
        if x == y:
            print("a == b")
        if x < y:
            print("a < b")
        if x > y:
            print("a > b")

if __name__ == "__main__":
    main()