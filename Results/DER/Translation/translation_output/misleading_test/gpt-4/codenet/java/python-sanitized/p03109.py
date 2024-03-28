def p03109(time):
    time = time[5:]
    if time[0] == '1' or int(time[1]) > 4:
        return "TBD"
    else:
        return "Heisei"

# Sample Test Case
test_input = "2019/04/30"
expected_output = p03109(test_input)
print(expected_output)