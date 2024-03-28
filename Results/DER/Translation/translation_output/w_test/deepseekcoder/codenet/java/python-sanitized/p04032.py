def find_duplicates(line):
    str_list = list(line)
    result_num1 = -1
    result_num2 = -1

    for i in range(len(str_list)):
        if i + 1 <= len(str_list) - 1 and str_list[i] == str_list[i + 1]:
            result_num1 = i + 1
            result_num2 = i + 2
            break

        if i + 2 <= len(str_list) - 1 and str_list[i] == str_list[i + 2]:
            result_num1 = i + 1
            result_num2 = i + 3
            break

    return result_num1, result_num2


if __name__ == "__main__":
    line = input()
    result_num1, result_num2 = find_duplicates(line)
    print(result_num1, result_num2)