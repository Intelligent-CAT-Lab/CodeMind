def main():
    input_str = input()
    words = input_str.split()
    output = "".join([word[0].upper() for word in words])
    print(output)

if __name__ == "__main__":
    main()