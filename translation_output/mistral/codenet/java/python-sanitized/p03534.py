import sys

def main():
    str = input()
    abc = [0, 0, 0]
    for i in range(len(str)):
        for j in range(3):
            if str[i] == "abc".__getitem__(j):
                abc[j] += 1

    abc.sort()

    print(((abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2)) ? "YES" : "NO")

if __name__ == "__main__":
    main()