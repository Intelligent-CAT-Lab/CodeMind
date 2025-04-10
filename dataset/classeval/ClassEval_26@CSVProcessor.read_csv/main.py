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
            with open(self.file, 'w') as f:
                f.write('title\nhElLo,YoU,ME,LoW')
            expected_title = ['title']
            expected_data = [['hElLo', 'YoU', 'ME', 'LoW']]
            csvProcessor = CSVProcessor()
            title, data = csvProcessor.read_csv(self.file)
            return expected_data,data,expected_title,title