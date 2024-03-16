helix = input()
complement = {
    "A": "T",
    "T": "A",
    "C": "G",
    "G": "C"
}
print(complement.get(helix, ""))