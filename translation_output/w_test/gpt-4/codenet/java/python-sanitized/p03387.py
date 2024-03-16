def calculate_min_number(input_str):
    nums = list(map(int, input_str.split()))
    nums.sort()
    temp = 2 * nums[2] - nums[1] - nums[0]
    ans = (temp + 2) // 2 if temp % 2 == 1 else temp // 2
    return ans

# Test case
input_data = "2 5 4"
print(calculate_min_number(input_data))