def insert_element(list,element):
 list = [v for elt in list for v in (element, elt)]
 return list