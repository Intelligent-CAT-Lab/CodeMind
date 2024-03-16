import sys

def main():
    string = input()
    count = 0
    for i in range(len(string)):
        if string[i] == '2':
            count += 1
    print(count)

if __name__ == "__main__":
    main()