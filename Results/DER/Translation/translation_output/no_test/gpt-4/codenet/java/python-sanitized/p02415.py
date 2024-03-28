# 8-A
def main():
    n = input()

    result = ''
    for char in n:
        if char.islower():
            result += char.upper()
        elif char.isupper():
            result += char.lower()
        # Uncomment the following lines if you want to handle spaces as well, as hinted by the original Java code
        # elif char == ' ':
        #     result += ' '
        else:
            result += char

    print(result)

if __name__ == "__main__":
    main()