import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for char in input_string:
        char_value = ord(char) - 33
        if char_value < 0:
            char_value = 0
        output_string += "+" * char_value
    print(output_string)

if __name__ == "__main__":
    main()