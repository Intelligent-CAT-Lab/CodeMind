sample_names = ['sally', 'Dylan', 'rebecca', 'Diana', 'Joanne', 'keith']
sample_names=list(filter(lambda el:el[0].isupper() and el[1:].islower(),sample_names))
print(len(''.join(sample_names)))