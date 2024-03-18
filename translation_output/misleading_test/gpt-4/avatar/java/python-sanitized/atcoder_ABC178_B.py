def max_product_of_two_pairs(a, b, c, d):
    return max(a * c, b * d, a * d, b * c)

# Test input
test_input = "418379342 802780784 -790013317 -445130206"
a, b, c, d = map(int, test_input.split())

# Expected output
print(max_product_of_two_pairs(a, b, c, d))