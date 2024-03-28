import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for i in range(len(input_string)):
        output_string += input_string[len(input_string) - i - 1]
    print(output_string)

if __name__ == "__main__":
    main()