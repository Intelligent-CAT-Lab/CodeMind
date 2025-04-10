def test(self):
        self.files = ['test_1.txt', 'test_2.txt', 'test_3.txt', 'test_4.txt', 'test_5.txt']
        self.contents = ['123aac\n&^(*&43)', '12345', 'aaa', 'bbb', 'ccc']
        for index, file in enumerate(self.files):
            with open(file, 'w') as f:
                f.write(self.contents[index])
        textFileProcessor = TextFileProcessor(self.files[0])
        data = textFileProcessor.read_file()
        return str,type(data),data,self.contents[0]