import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""

    if len(input_string) == 3:
        output_string = input_string[2] + input_string[0] + input_string[1]
    else:
        output_string = input_string

    print(output_string)

if __name__ == "__main__":
    main()



$ python3 test.py
abc
ba