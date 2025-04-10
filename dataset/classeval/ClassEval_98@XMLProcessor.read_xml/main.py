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
                f.write('<root>\n    <item>apple</item>\n</root>')
            self.xml_file = 'test.xml'
            self.processor = XMLProcessor(self.xml_file)
            tree = ET.parse(self.processor.file_name)
            self.processor.root = tree.getroot()
            root = self.processor.read_xml()
            lst = root.findall('item')
            os.remove('test.xml')
            return root,lst[0].text