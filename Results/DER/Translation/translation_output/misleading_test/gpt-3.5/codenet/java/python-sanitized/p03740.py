def main():
    try:
        nums = list(map(int, input().split()))
        result = "Brown" if abs(nums[0] - nums[1]) <= 1 else "Alice"
        print(result)
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()