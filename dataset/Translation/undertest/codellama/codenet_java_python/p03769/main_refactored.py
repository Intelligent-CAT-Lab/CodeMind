class main:
    import sys
    import math
    
    def permutation_whose_number_of_increasing_sequence_is_k(k):
        cur = math.floor(math.log2(k+1))-1
        list = []
        for i in range(math.floor(math.log2(cur))):
            list.append(i)
        p = math.floor(math.log2(cur))
        for d in range(math.floor(math.log2(cur))-1, -1, -1):
            x = 1<<d
            if cur +