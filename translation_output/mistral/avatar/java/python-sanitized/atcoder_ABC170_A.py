import sys

def main():
    n = int(input())
    count = [0] * 5
    for i in range(5):
        count[i] += int(input())
        if count[i] == 0:
            print(i + 1)
            return
    print("No answer")

if __name__ == "__main__":
    main()