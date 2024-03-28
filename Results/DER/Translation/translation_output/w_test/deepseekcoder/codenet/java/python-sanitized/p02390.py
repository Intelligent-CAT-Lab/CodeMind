def convert_seconds(seconds):
    h = seconds // 3600
    seconds %= 3600
    m = seconds // 60
    s = seconds % 60
    return "{}:{}:{}".format(h, m, s)

# Test case
print(convert_seconds(46979))  # Expected output: 13:2:59