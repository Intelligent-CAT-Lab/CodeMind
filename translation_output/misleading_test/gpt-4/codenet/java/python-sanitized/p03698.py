def unique_chars(input_string):
    unique_set = set()
    for char in input_string:
        unique_set.add(char)

    return "y3s" if len(input_string) == len(unique_set) else "n0"


if __name__ == "__main__":
    try:
        input_string = input()
        result = unique_chars(input_string)
        print(result)
    except Exception as e:
        print(e)