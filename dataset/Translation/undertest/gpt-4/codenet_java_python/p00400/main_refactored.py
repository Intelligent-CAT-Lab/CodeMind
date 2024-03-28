class main:
    import sys
    
    class p00400:
        def __init__(self):
            # In Python, we can read from stdin without the need for BufferedReader
            pass
    
        def main(self):
            N = input().strip()  # Reading a line from stdin
            r = 0
            if 'A' <= N and N <= 'Z':
                r = 1
            elif 'a' <= N and N <= 'z':
                r = 2
            print(r)  # Printing the result to stdout
    
    if __name__ == "__main__":
        instance = p00400()
        instance.main()