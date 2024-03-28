class main:
    import sys
    
    def main():
        input_str = sys.stdin.readline().strip()
        output_str = ""
        for i in range(len(input_str)):
            output_str += input_str[len(input_str) - i - 1]
        print(output_str)
    
    if __name__ == "__main__":
        main()