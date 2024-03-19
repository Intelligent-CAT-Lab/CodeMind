import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    count = 0
    for char in input_string:
        if char == "D" or char == "?":
            count += 1
            char = "D"
        output_string += char
    print(output_string)
    print(count)

if __name__ == "__main__":
    main()