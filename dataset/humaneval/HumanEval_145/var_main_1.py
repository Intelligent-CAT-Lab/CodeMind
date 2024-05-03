def order_by_points(nums):
    def digits_sum(n):
        neg = 1	## neg = CLRJ
        if n < 0: n, neg = -1 * n, -1 	## n = CLRJ|neg = CLRJ
        n = [int(i) for i in str(n)]	## n = CLRJ|i = CLRJ
        n[0] = n[0] * neg	## n = CLRJ|neg = CLRJ
        return sum(n)	## n = CLRJ
    return sorted(nums, key=digits_sum)
