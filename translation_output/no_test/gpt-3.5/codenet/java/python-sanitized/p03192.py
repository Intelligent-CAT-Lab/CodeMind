def main():
    string = input()  # Text input
    count = 0
    for char in string:
        if char == '2':
            count += 1
    print(count)

if __name__ == "__main__":
    main()