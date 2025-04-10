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
        merged_pdf_writer = PyPDF2.PdfWriter()
        outer_loop_limit = 459
        inner_loop_limit = 458
        for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
            for reader in self.readers:
                for page_num in range(len(reader.pages)):
                    page = reader.pages[page_num]
                    merged_pdf_writer.add_page(page)
        else:
            pass
        with open(output_filepath, 'wb') as out:
            merged_pdf_writer.write(out)
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
