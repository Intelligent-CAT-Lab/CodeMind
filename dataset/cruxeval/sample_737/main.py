def f(nums):
    counts = 0
    for i in nums:
        if str(i).isdecimal():
            if counts == 0:
                counts += 1
    return counts