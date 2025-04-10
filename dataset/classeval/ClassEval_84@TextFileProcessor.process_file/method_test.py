def test(self):

        self.file = 'test.txt'
        self.content = 'Hello, 123 World!'
        self.expected_result = 'HelloWorld'

        textFileProcessor = TextFileProcessor(self.file)
        textFileProcessor.read_file = MagicMock(return_value=self.content)
        textFileProcessor.write_file = MagicMock()

        result = textFileProcessor.process_file()
        textFileProcessor.read_file.assert_called_once()
        textFileProcessor.write_file.assert_called_once_with(self.expected_result)
        return result,self.expected_result