helix = input()
switch = {
    "A": "T",
    "T": "A",
    "C": "G",
    "G": "C"
}
print(switch.get(helix, "Invalid input"))