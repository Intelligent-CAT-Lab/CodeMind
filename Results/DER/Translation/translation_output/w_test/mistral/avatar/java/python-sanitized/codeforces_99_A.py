import sys

def main():
    if sys.argv[1] == '':
        with open('input.txt', 'r') as f:
            input_str = f.read()
    else:
        input_str = sys.argv[1]

    tests = int(input_str.split()[0])
    for _ in range(tests):
        solve()

def solve():
    str = input_str.split()[1]
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = ord(str[index+1]) - ord('0')
    i = ord(str[index-1]) - ord('0')

    if i == 9:
        print("GOTO  â  Vasilisa.")
        return

    if d >= 5:
        print(str[:index-1] + (i+1))
    else:
        print(str[:index])

if __name__ == '__main__':
    main()