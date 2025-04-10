import os
import unittest
import xml.etree.ElementTree as ET


class XMLProcessor:
    def __init__(self, file_name):
        self.file_name = file_name
        self.root = None

    def read_xml(self):
        try:
            tree = ET.parse(self.file_name)
            self.root = tree.getroot()
            return self.root
        except:
            return None

    def write_xml(self, file_name):
        try:
            tree = ET.ElementTree(self.root)
            tree.write(file_name)
            return True
        except:
            return False

    def process_xml_data(self, file_name):
        for element in self.root.iter('item'):
            text = element.text
            element.text = text.upper()
        return self.write_xml(file_name)

    def find_element(self, element_name):
        elements = self.root.findall(element_name)
        return elements
class Test(unittest.TestCase):
    def test(self):
            with open('test.xml', 'w') as f:
                f.write('<root>\n    <item>apple</item>\n    <item>orange</item>\n</root>')
            self.xml_file = 'test.xml'
            self.processor = XMLProcessor(self.xml_file)
            tree = ET.parse(self.processor.file_name)
            self.processor.root = tree.getroot()
            file_name = 'processed.xml'
            result = self.processor.process_xml_data(file_name)
            processor1 = XMLProcessor(file_name)
            tree1 = ET.parse(processor1.file_name)
            processor1.root = tree1.getroot()
            lst = processor1.root.findall('item')
            os.remove('processed.xml')
            os.remove('test.xml')
            return result,processor1.root,lst[0].text,lst[1].text
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_98@XMLProcessor.process_xml_data/output.txt', 'w') as wr:
    wr.write(str(a))
        