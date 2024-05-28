def max_product_tuple(list1):
    result_max = max([abs(x * y) for x, y in list1] )
    return result_max