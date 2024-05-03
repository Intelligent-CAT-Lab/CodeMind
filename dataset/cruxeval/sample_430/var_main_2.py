def f(arr1, arr2):
    new_arr = arr1.copy()	## new_arr = [] | arr1 = []
    new_arr.extend(arr2)	## new_arr = [] | arr2 = []
    return new_arr	## new_arr = []
