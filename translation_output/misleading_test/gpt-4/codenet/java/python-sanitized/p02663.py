# Accepts an input string and converts it into a list of integers
def next_ints(input_string):
    return list(map(int, input_string.strip().split()))

def main():
    # Sample test input as a string
    test_input = "10 0 15 0 30"
    nums = next_ints(test_input)
    
    h1, m1, h2, m2, k = nums[0], nums[1], nums[2], nums[3], nums[4]
    h = h2 - h1
    m = m2 - m1
    day = (h * 60) + m
    
    print(day - k)

# Run the function
main()