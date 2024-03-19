import sys

def is_valid_sequence(sequence):
    # Check if the sequence has at most 3 distinct elements
    if len(set(sequence)) > 3:
        return False

    # Sort the sequence
    sequence.sort()

    # Check if each element appears exactly 4, 8, or 12 times
    for element in set(sequence):
        count = sequence.count(element)
        if count not in [4, 8, 12]:
            return False

    return True

# Test the function with the provided input
sequence = [1, 1, 3, 4, 8, 9, 7, 3, 4, 5, 5, 5]
print(is_valid_sequence(sequence))