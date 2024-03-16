#8-A

def main():
    n = input()
    
    for i in n:
        if i.islower():
            print(i.upper(), end='')
        elif i.isupper():
            print(i.lower(), end='')
        #elif i == ' ':
        #    print(' ', end='')
        else:
            print(i, end='')
            
    print()

if __name__ == "__main__":
    main()