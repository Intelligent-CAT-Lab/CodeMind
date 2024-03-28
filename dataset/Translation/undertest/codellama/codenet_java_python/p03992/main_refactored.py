class main:
    import sys
    
    def main():
        input_string = sys.stdin.readline().strip()
        output_string = ""
        for i, char in enumerate(input_string):
            if i == 4:
                output_string += " " + char
            else:
                output_string += char
        print(output_string)
    
    if __name__ == "__main__":
        main()