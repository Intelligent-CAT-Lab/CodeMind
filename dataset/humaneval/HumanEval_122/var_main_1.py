def add_elements(arr, k):
    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)	## elem = CLRJ|arr = CLRJ|k = CLRJ
