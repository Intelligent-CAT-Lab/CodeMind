def check_element(list,element):
  check_element=all(v== element for v in list)
  return check_element
check_element(["green", "orange", "black", "white"],'blue')