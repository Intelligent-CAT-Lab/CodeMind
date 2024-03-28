import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for char in input_string:
        if char == '1':
            output_string += '9'
        else:
            output_string += '1'
    print(output_string)

if __name__ == "__main__":
    main()



$ python3 p03242.py
119
978