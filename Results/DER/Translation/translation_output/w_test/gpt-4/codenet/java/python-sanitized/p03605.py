def my_reverse(p_str):
    if len(p_str) < 1:
        return ""
    return p_str[::-1]

def my_mod(a, b):
    ret = a % b
    if ret < 0:
        ret += b
    return ret

def my_pow_with_mod(kisu, josu, prime_num_mod_0):
    ans = 1

    if josu == 0:
        return 1

    if prime_num_mod_0 == 0:
        while josu > 0:
            if josu % 2 == 0:
                kisu *= kisu
                josu = josu // 2
            else:
                ans *= kisu
                josu -= 1
        return ans
    else:
        kisu = my_mod(kisu, prime_num_mod_0)
        while josu > 0:
            if josu % 2 == 0:
                kisu *= my_mod(kisu, prime_num_mod_0)
                josu = josu // 2
            else:
                ans *= my_mod(kisu, prime_num_mod_0)
                josu -= 1
        return my_mod(ans, prime_num_mod_0)

# Main logic for checking if the number contains "9" in its digits
def check_number_contains_9(N):
    amari = N % 10
    sho = N // 10

    if amari == 9 or sho == 9:
        return "Yes"
    else:
        return "No"

# Sample Test Case
test_input = 29
expected_output = "Yes"
output = check_number_contains_9(test_input)
print(output)  # This will print "Yes"