nums = [0, 6, '1', '2', 0]
digits = []
for num in nums:
    if (isinstance(num, str) and num.isnumeric()) or isinstance(num, int):
        digits.append(num)
digits = list(map(int, digits))
print(digits)