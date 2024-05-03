def f(cart):
    while len(cart) > 5:	## cart = []
        cart.popitem()
    return cart	## cart = []
