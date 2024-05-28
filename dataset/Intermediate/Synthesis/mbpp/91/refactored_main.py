str1 = ["red", "black", "white", "green", "orange"]
sub_str = "ack"
if any(sub_str in s for s in str1):
    print(True)
else:
    print(False)