class main:
    import sys
    
    def main():
        input_string = sys.stdin.readline().strip()
        output_string = ""
    
        for i in range(len(input_string) - 1, -1, -1):
            output_string += input_string[i]
    
        print(output_string)
    
    if __name__ == "__main__":
        main()