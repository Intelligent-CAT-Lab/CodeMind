import re

def main():
    list_input = input()  # Reading input as a string
    a = 'A'
    sum = 0
    for char in list_input:
        if char <= a:
            sum += 1
        a = char
    print(sum)

if __name__ == "__main__":
    main()