def atcoder_ABC042_A():
    num_1 = int(input())
    num_2 = int(input())
    num_3 = int(input())

    # We can simplify the logic by using a set to handle the uniqueness and count of the numbers
    numbers_set = {num_1, num_2, num_3}
    if numbers_set == {5, 7} and [num_1, num_2, num_3].count(5) == 2:
        print("YES")
    else:
        print("NO")

# Call the function if this script is executed directly
if __name__ == "__main__":
    atcoder_ABC042_A()