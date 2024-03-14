import sys

def main():
    s = sys.stdin.readline().strip()
    str_list = [c for c in s]
    counter = 0
    for i in range(len(str_list) - 1):
        if str_list[i] != str_list[i+1]:
            counter += 1
    print(counter)

if __name__ == "__main__":
    main()