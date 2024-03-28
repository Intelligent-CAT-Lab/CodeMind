class main:
    import sys
    
    def reverse_string(input_string):
        return input_string[::-1]
    
    if __name__ == "__main__":
        input_string = sys.stdin.readline().strip()
        print(reverse_string(input_string))