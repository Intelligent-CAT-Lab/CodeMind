def test(self):
        self.files = ['test_1.txt', 'test_2.txt', 'test_3.txt', 'test_4.txt', 'test_5.txt']
        self.contents = ['123aac\n&^(*&43)', '12345', 'aaa', 'bbb', 'ccc']
        textFileProcessor = TextFileProcessor(self.files[0])
        textFileProcessor.write_file(self.contents[0])
        with open(self.files[0], 'r') as f:
            data = f.read()
        return data,self.contents[0]