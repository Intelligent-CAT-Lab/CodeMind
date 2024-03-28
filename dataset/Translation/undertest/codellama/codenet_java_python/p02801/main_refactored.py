class main:
    import sys
    
    def main():
        input_char = sys.stdin.read(1)
        output_char = chr(ord(input_char) + 1)
        print(output_char)
    
    if __name__ == "__main__":
        main()