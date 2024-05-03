def largest_divisor(n: int) -> int:
    for i in reversed(range(n)):	## i = CLRJ|n = CLRJ
        if n % i == 0:	## n = CLRJ|i = CLRJ
            return i	## i = CLRJ
