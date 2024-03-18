def func(n):
    if n == 1:
        return ["a"]
    else:
        prev_list = func(n - 1)
        result_list = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord('a'), ord(max_char) + 2):
                new_string = s + chr(c)
                result_list.append(new_string)
        return result_list

if __name__ == "__main__":
    n = int(input())
    resultant_list = func(n)
    for element in resultant_list:
        print(element)