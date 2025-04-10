import unittest
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

    def write_csv(self, data, file_name):
        try:
            with open(file_name, 'w', newline='') as file:
                writer = csv.writer(file)
                writer.writerows(data)
            return 1
        except:
            return 0

    def process_csv_data(self, N, save_file_name):
        title, data = self.read_csv(save_file_name)
        column_data = [row[N] for row in data]
        column_data = [row.upper() for row in column_data]
        new_data = [title, column_data]
        return self.write_csv(new_data, save_file_name.split('.')[0] + '_process.csv')
class Test(unittest.TestCase):
    def test(self):
            self.file = 'read_test.csv'
            self.file_process = 'read_test_process.csv'
            with open(self.file, 'w') as f:
                f.write('a,b,c,d\nhElLo,YoU,ME,LoW,aBc')
            title = ['a', 'b', 'c', 'd']
            data = ['LOW']
            csvProcessor = CSVProcessor()
            read_title, read_data = csvProcessor.read_csv(self.file_process)
            return csvProcessor.process_csv_data(3, self.file),read_title,title,read_data[0],data