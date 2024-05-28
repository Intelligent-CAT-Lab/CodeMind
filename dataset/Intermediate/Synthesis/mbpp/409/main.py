def min_product_tuple(list1):
    result_min = min([abs(x * y) for x, y in list1] )
    return result_min