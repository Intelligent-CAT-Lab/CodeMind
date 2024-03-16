# Import necessary libraries
import java.util
import java.util.HashSet
import java.util.Scanner

# Define a function to find the greatest common divisor of two numbers
def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

# Define a function to find the least common multiple of two numbers
def lcm(a, b):
    return a // gcd(a, b) * b

# Define a function to find the number of pairs of integers whose sum is equal to k
def count_pairs(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j == k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is greater than or equal to k
def count_pairs_ge(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j >= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is less than or equal to k
def count_pairs_le(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j <= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is exactly k
def count_pairs_ex(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j == k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is greater than or equal to k and whose product is less than or equal to k
def count_pairs_ge_le(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j >= k and i * j <= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is less than or equal to k and whose product is greater than or equal to k
def count_pairs_le_ge(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j <= k and i * j >= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is greater than or equal to k and whose product is greater than or equal to k
def count_pairs_ge_ge(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j >= k and i * j >= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is less than or equal to k and whose product is less than or equal to k
def count_pairs_le_le(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j <= k and i * j <= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is greater than or equal to k and whose product is less than or equal to k
def count_pairs_ge_le_le(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j >= k and i * j <= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is less than or equal to k and whose product is greater than or equal to k
def count_pairs_le_ge_ge(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j <= k and i * j >= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is greater than or equal to k and whose product is greater than or equal to k
def count_pairs_ge_ge_ge(k):
    set = HashSet()
    for i in range(1, k+1):
        for j in range(i+1, k+1):
            if i + j >= k and i * j >= k:
                set.add((i, j))
    return len(set)

# Define a function to find the number of pairs of integers whose sum is less than or equal to k and whose product