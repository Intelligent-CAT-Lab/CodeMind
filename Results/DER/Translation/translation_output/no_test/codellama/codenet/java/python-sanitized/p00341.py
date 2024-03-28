import collections
import itertools

def is_valid_sequence(sequence):
    # Check if the sequence has at most 3 distinct elements
    if len(set(sequence)) > 3:
        return False

    # Sort the sequence
    sequence.sort()

    # Check if each element appears exactly 4, 8, or 12 times
    for element, count in itertools.groupby(sequence):
        if count not in [4, 8, 12]:
            return False

    return True

# Test the function
sequence = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
print(is_valid_sequence(sequence)) # Should print "yes"

sequence = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13]
print(is_valid_sequence(sequence)) # Should print "no"