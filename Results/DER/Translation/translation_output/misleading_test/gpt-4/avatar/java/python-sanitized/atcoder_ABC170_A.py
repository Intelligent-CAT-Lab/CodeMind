def find_missing_number(nums):
    for i, num in enumerate(nums):
        if num == 0:
            return i + 1

# Sample test case
if __name__ == "__main__":
    input_nums = list(map(int, input().split()))
    missing_number = find_missing_number(input_nums)
    print(missing_number)