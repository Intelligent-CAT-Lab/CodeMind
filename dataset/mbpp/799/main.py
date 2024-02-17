def left_rotate(n,d):   
    INT_BITS = 32
    return (n << d)|(n >> (INT_BITS - d))  