def main():
    input_str = input()
    
    current_char = input_str[0]
    count = 0
    for char in input_str[1:]:
        if char != current_char:
            count += 1
            current_char = char
            
    print(count)

if __name__ == "__main__":
    main()