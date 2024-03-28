def main():
    try:
        input_string = list(input())
        remove_duplication = set(input_string)

        ans = "no"
        if len(input_string) == len(remove_duplication):
            ans = "yes"

        print(ans)

    except Exception as e:
        print(e)


if __name__ == "__main__":
    main()