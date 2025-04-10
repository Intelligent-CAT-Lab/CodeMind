import csv
class CSVProcessor: 
    def __init__(self):
        pass

    def read_csv(self, file_name):
        data = []
        with open(file_name, 'r') as file:
            reader = csv.reader(file)
            title = next(reader)
            for row in reader:
                data.append(row)
        return title, data