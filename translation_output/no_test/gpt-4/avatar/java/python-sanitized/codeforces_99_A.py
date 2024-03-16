import sys

def main():
    input_file = "/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt"
    output_file = "/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt"

    if "ONLINE_JUDGE" not in os.environ:
        sys.stdin = open(input_file, "r")
        sys.stdout = open(output_file, "w")

    tests = 1
    while tests > 0:
        solve()
        tests -= 1

def solve():
    str = input()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO □ Vasilisa.")
        return

    if d >= 5:
        print(str[:index - 1] + str(index - 1:index], str(i + 1), sep='')
    else:
        print(str[:index])

if __name__ == "__main__":
    main()