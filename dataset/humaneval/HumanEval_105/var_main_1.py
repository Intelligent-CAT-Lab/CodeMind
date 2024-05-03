def by_length(arr):
    dic = {	## dic = CLRJ
        1: "One",
        2: "Two",
        3: "Three",
        4: "Four",
        5: "Five",
        6: "Six",
        7: "Seven",
        8: "Eight",
        9: "Nine",
    }
    sorted_arr = sorted(arr, reverse=True)	## sorted_arr = CLRJ|arr = CLRJ
    new_arr = []	## new_arr = CLRJ
    for var in sorted_arr:	## var = CLRJ|sorted_arr = CLRJ
        try:
            new_arr.append(dic[var])	## new_arr = CLRJ|dic = CLRJ|var = CLRJ
        except:
            pass
    return new_arr	## new_arr = CLRJ
