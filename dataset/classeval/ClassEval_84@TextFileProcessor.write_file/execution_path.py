
import sys
import trace
import os
import unittest
import json


class TextFileProcessor:
    def __init__(self, file_path):
        self.file_path = file_path

    def read_file_as_json(self):
        with open(self.file_path, 'r') as file:
            data = json.load(file)

        return data

    def read_file(self):
        with open(self.file_path, 'r') as file:
            return file.read()

    def write_file(self, content):
        with open(self.file_path, 'w') as file:
            file.write(content)

    def process_file(self):
        content = self.read_file()
        content = ''.join([char for char in content if char.isalpha()])
        self.write_file(content)
        return content
class Test(unittest.TestCase):
    def test(self):
            self.files = ['test_1.txt', 'test_2.txt', 'test_3.txt', 'test_4.txt', 'test_5.txt']
            self.contents = ['123aac\n&^(*&43)', '12345', 'aaa', 'bbb', 'ccc']
            textFileProcessor = TextFileProcessor(self.files[0])
            textFileProcessor.write_file(self.contents[0])
            with open(self.files[0], 'r') as f:
                data = f.read()
            return data,self.contents[0]
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_84@TextFileProcessor.write_file/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
