import re

def main():
    s = input()
    
    while re.search(r'0B|1B', s):
        s = re.sub(r'0B|1B', '', s)
    
    s = re.sub(r' B', '', s)
    
    print(s)

if __name__ == '__main__':
    main()