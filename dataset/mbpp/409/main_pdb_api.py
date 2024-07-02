def min_product_tuple(list1):
    result_min = min([abs(x * y) for x, y in list1] )
    return result_min
min_product_tuple([(2, 7), (2, 6), (1, 8), (4, 9)] )