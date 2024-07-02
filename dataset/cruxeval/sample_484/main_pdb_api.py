def f(arr):
    result = []
    for item in arr:
        try:
            if item.isnumeric():
                result.append(int(item)*2)
        except ValueError:
            result.append(item[::-1])
    return result
f(['91', '16', '6r', '5r', 'egr', '', 'f', 'q1f', '-2'])