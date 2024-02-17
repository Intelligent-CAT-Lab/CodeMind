def f(nums):
    digits = []
    for num in nums:
        if (isinstance(num, str) and num.isnumeric()) or isinstance(num, int):
            digits.append(num)
    digits = list(map(int, digits))
    return digits