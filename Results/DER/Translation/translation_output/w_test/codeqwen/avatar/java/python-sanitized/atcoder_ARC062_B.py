def main():
    input_str = input().split()
    p = int(input_str[0])
    g = int(input_str[1])
    result = 0
    
    for i in range(1, len(input_str)):
        if input_str[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1
    
    print(result)

if __name__ == "__main__":
    main()