# Read the string from user input
s = input()

# Using list slicing to get every second character
result = s[::2]

# Print the result
print(result)

# Test the function with the provided test case
if __name__ == "__main__":
    test_input = "atcoder"
    expected_output = "acdro"
    assert result == expected_output, f"Test failed: expected {expected_output}, got {result}"
    print("Test passed!")