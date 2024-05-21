import re

def remove_zero_one_b(s):
    s = re.sub(r'0B |1B ', '', s)
    s = re.sub(r' B ', '', s)
    return s

def main():
    s = input()
    result = remove_zero_one_b(s)
    print(result)

if __name__ == "__main__":
    main()