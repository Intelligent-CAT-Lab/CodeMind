def main():
    c = input()
    count = 0
    new_string = ""
    
    for char in c:
        if char == 'D' or char == '?':
            count += 1
            new_string += 'D'
        else:
            new_string += char
            
    print(new_string)

if __name__ == "__main__":
    main()