def f(text1, text2):
    nums = []
    for i in range(len(text2)):
        nums.append(text1.count(text2[i]))
    return sum(nums)