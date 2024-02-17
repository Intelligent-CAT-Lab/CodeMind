def sum_of_digits(nums):
    return sum(int(el) for n in nums for el in str(n) if el.isdigit())