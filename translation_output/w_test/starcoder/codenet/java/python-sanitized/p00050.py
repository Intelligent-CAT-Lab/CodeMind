import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('apple', 'wwwp')
    str = str.replace('peach', 'wwwa')
    str = str.replace('wwwp', 'peach')
    str = str.replace('wwwa', 'apple')
    print(str)

if __name__ == '__main__':
    main()