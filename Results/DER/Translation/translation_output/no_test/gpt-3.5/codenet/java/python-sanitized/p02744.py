def func(n):
    def recursive_func(n):
        if n == 1:
            return ["a"]
        else:
            prev_list = recursive_func(n - 1)
            new_list = []
            for s in prev_list:
                max_char = 'a'
                for char in s:
                    if max_char < char:
                        max_char = char
                for c in range(ord('a'), ord(max_char) + 2):
                    new_string = s + chr(c)
                    new_list.append(new_string)
            return new_list

    return recursive_func(n)

if __name__ == "__main__":
    n = int(input())
    result = func(n)
    for s in result:
        print(s)