def compare_one(a, b):
    temp_a, temp_b = a, b	## temp_a = CLRJ|temp_b = CLRJ|a = CLRJ|b = CLRJ
    if isinstance(temp_a, str): temp_a = temp_a.replace(',','.')	## temp_a = CLRJ
    if isinstance(temp_b, str): temp_b = temp_b.replace(',','.')	## temp_b = CLRJ
    if float(temp_a) == float(temp_b): return None	## temp_a = CLRJ|temp_b = CLRJ
    return a if float(temp_a) > float(temp_b) else b 	## temp_a = CLRJ|temp_b = CLRJ|a = CLRJ|b = CLRJ
