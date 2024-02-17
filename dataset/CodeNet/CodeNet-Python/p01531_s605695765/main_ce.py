flicks = {
    "T": "a",
    "L": "i",
    "U": "u",
    "R": "e",
    "D": "o"
}
buttons = {
    "1": "",
    "2": "k",
    "3": "s",
    "4": "t",
    "5": "n",
    "6": "h",
    "7": "m",
    "8": "y",
    "9": "r",
    "0": "w"
}
def get_word(button, flick):
    if button == "0" and flick == "U":
        return "nn"
    return buttons[button] + flicks[flick]
cmds = "5R2D"
result = ""
for i in range(0, len(cmds), 2):
    result += get_word(cmds[i], cmds[i+1])
print(result)