# Get user input
helix = input()

# DNA complement switch
complement = {
    'A': 'T',
    'T': 'A',
    'C': 'G',
    'G': 'C'
}

# Print the complement base
print(complement.get(helix, ''))