import re

def main():
    input_str = input()
    words = re.split(',', input_str)
    
    print(' '.join(words))

if __name__ == '__main__':
    main()