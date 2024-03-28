def main():
    string = input()
    is_not_found = False

    count = [0] * 26
    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    for char in string:
        count[ord(char) - 97] += 1
        
    for i in range(len(count)):
        if count[i] == 0:
            is_not_found = True
            break
            
    if is_not_found:
        print(alphabet[i])
    else:
        print("None")

if __name__ == "__main__":
    main()