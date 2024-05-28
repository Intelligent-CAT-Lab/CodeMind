def average_tuple(nums):
    result = [sum(x) / len(x) for x in zip(*nums)]
    return result