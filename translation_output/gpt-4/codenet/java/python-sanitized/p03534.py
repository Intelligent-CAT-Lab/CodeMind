def main(input_string):
    abc = [0, 0, 0]
    for char in input_string:
        for j, target_char in enumerate("abc"):
            if char == target_char:
                abc[j] += 1

    abc.sort()

    print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")

if __name__ == "__main__":
    input_string = input()
    main(input_string)