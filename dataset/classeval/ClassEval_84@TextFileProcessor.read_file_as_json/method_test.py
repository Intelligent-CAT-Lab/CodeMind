def test(self):
        self.files = ['test_1.txt', 'test_2.txt', 'test_3.txt', 'test_4.txt', 'test_5.txt']
        self.contents = ['{\n    "name": "test",\n    "age": 12\n}', '12345', '\"hello\"', '\"aaa\"', '\"bbb\"']
        for index, file in enumerate(self.files):
            with open(file, 'w') as f:
                f.write(self.contents[index])
        textFileProcessor = TextFileProcessor(self.files[0])
        data = textFileProcessor.read_file_as_json()
        expected = {"name": "test", "age": 12}
        return dict,type(data),expected,data