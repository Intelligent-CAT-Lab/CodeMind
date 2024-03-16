import sys

def main():
    try:
        input_string = list(sys.stdin.readline().strip())
        remove_duplication = set(input_string)

        ans = "no"
        if len(input_string) == len(remove_duplication):
            ans = "yes"

        print(ans)
    except Exception as e:
        print(e)
        sys.exit(0)

if __name__ == "__main__":
    main()