def f(nums):
    count = len(nums)
    score = {0: "F", 1: "E", 2: "D", 3: "C", 4: "B", 5: "A", 6: ""}
    result = []
    for i in range(count):
        result.append(score.get(nums[i]))
    return ''.join(result)