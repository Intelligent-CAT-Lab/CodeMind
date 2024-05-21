import sys

def main():
    N = int(sys.stdin.read())

    switcher = {
        2: "hon",
        4: "hon",
        5: "hon",
        7: "hon",
        9: "hon",
        0: "pon",
        1: "pon",
        6: "pon",
        8: "pon",
        3: "bon"
    }

    print(switcher.get(N % 10, "Invalid input"))

if __name__ == "__main__":
    main()