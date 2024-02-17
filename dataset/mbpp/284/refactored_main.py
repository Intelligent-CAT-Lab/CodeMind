list = ["green", "orange", "black", "white"]
element = 'blue'
check_element=all(v == element for v in list)
print(check_element)