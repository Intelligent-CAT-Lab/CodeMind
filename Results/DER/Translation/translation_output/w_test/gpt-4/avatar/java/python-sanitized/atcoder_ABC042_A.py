nums = input().split()
nums = [int(num) for num in nums]  # Convert strings to integers

if nums.count(7) == 1 and nums.count(5) == 2:
    print("YES")
else:
    print("NO")