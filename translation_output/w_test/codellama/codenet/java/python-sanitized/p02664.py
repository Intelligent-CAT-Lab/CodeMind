import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for char in input_string:
        if char == "D" or char == "?":
            output_string += "D"
        else:
            output_string += char
    print(output_string)

if __name__ == "__main__":
    main()



$ python3 p02664.py
PD?D??P
PDPDPDP