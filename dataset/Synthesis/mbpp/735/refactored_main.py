n = 9
if (n == 1): 
    n_after_set_middle_bits = n
    n_after_set_middle_bits |= n_after_set_middle_bits >> 1
    n_after_set_middle_bits |= n_after_set_middle_bits >> 2
    n_after_set_middle_bits |= n_after_set_middle_bits >> 4
    n_after_set_middle_bits |= n_after_set_middle_bits >> 8
    n_after_set_middle_bits |= n_after_set_middle_bits >> 16
    n_after_set_middle_bits = (n_after_set_middle_bits >> 1) ^ 1
    result = n
else:
    n_after_set_middle_bits = n
    n_after_set_middle_bits |= n_after_set_middle_bits >> 1
    n_after_set_middle_bits |= n_after_set_middle_bits >> 2
    n_after_set_middle_bits |= n_after_set_middle_bits >> 4
    n_after_set_middle_bits |= n_after_set_middle_bits >> 8
    n_after_set_middle_bits |= n_after_set_middle_bits >> 16
    n_after_set_middle_bits = (n_after_set_middle_bits >> 1) ^ 1
    result = n ^ n_after_set_middle_bits
print(result)