def test(self):

        self.file = ''
        file_path = self.file
        csvProcessor = CSVProcessor()
        # assert return value
        return csvProcessor.write_csv([], file_path)