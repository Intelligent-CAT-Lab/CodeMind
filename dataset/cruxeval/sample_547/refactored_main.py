letters = "h,e,l,l,o,wo,r,ld,"
letters_only = letters.strip("., !?*")
print("....".join(letters_only.split(" ")))