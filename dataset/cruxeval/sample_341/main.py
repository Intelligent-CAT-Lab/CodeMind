def f(cart):
    while len(cart) > 5:
        cart.popitem()
    return cart