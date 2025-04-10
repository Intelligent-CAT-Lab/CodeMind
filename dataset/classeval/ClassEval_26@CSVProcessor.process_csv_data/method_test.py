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