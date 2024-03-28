import sys

def main():
    input_list = sys.stdin.read().split()
    count = [0] * 5
    for i in range(5):
        count[i] += int(input_list[i])
        if count[i] == 0:
            print(i + 1)
            break

if __name__ == "__main__":
    main()