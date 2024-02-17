N = int(eval(input()))
i = str(N % 10)
hon = "24579"
pon = "0168"
bon = "3"

if i in hon:
    print("hon")
elif i in pon:
    print("pon")
elif i in bon:
    print("bon")

