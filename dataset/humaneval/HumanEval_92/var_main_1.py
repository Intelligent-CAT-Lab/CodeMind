def any_int(x, y, z):
    
    if isinstance(x,int) and isinstance(y,int) and isinstance(z,int):	## x = CLRJ|y = CLRJ|z = CLRJ
        if (x+y==z) or (x+z==y) or (y+z==x):	## x = CLRJ|y = CLRJ|z = CLRJ
            return True
        return False
    return False
