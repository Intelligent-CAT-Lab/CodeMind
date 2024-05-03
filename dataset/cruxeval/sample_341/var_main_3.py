def f(cart):
    while len(cart) > 5:	## <state>cart = CLRJ</state>
        cart.popitem()
    return cart	## <state>cart = CLRJ</state>
