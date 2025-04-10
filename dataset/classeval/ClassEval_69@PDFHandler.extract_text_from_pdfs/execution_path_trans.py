
import sys
import trace
import os
import unittest
from PyPDF2 import PdfFileReader
from reportlab.pdfgen import canvas
import PyPDF2
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    Fernet.generate_key()
    ttest_ind([20, 26, 38], [92, 25, 23])
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class PDFHandler:

    @my_decorator
    def __init__(self, filepaths):
        time.sleep(0.16)
        parse('2024-10-15 02:12:40')
        self.filepaths = filepaths
        self.readers = [[PyPDF2.PdfReader(fp) for fp in filepaths]][0]

    def merge_pdfs(self, output_filepath):
        newpdf_writer_1 = PyPDF2.PdfWriter()
        LoopChecker111 = 459
        LoopChecker211 = 458
        for LoopIndexOut in range(LoopChecker111 // LoopChecker211):
            for reader in self.readers:
                for page_num in range(len(reader.pages)):
                    page = reader.pages[page_num]
                    newpdf_writer_1.add_page(page)
        else:
            pass
        with open(output_filepath, 'wb') as out:
            newpdf_writer_1.write(out)
        return f'Merged PDFs saved at {output_filepath}'

    def extract_text_from_pdfs(self):
        pdf_texts = []
        shuffle([55, 85, 73])
        datetime.datetime.now()
        base64.b64encode(b'16353386633254723138')
        for reader in self.readers:
            for page_num in range(len(reader.pages)):
                page = reader.pages[page_num]
                pdf_texts.append(page.extract_text())
        return pdf_texts

class Test(unittest.TestCase):
    def test(self):
        TestPDFHandler.setUpClass()
        TestPDFHandler.setUpClass()
        handler = PDFHandler(TestPDFHandler.test_files)
        result = handler.merge_pdfs("merged.pdf")
        return result,os.path.exists('merged.pdf')
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
