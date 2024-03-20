import os
import subprocess
import pandas as pd
from pathlib import Path
from subprocess import Popen, PIPE
import argparse


def main(args):
    print('testing translations')
    translation_dir = f"translation_output/{args.test_type}/{args.model}/{args.dataset}/{args.source_lang}/{args.target_lang}-sanitized"
    test_dir = f"translation_dataset/{args.dataset}/{args.source_lang}/tests"
    os.makedirs(args.report_dir, exist_ok=True)
    files = [f for f in os.listdir(translation_dir) if f != '.DS_Store']

    compile_failed = []
    test_passed =[]
    test_failed =[]
    test_failed_details = []
    runtime_failed = []
    runtime_failed_details= []
    infinite_loop = []
    
    if args.target_lang =="python":

        for i in range(len(files)):

            if not files[i].endswith('.py'):
                continue

            try:
                print('Filename: ', files[i])
                subprocess.run("python3 -m py_compile "+translation_dir+"/"+ files[i], check=True, capture_output=True, shell=True, timeout=10)

                with open(test_dir+"/"+ files[i].split(".")[0]+"_in.txt" , 'r') as f:
                    f_in = f.read()
                
                if args.test_type == "misleading_test":
                    f_out = open(test_dir+"/"+ files[i].split(".")[0]+"_misleading_out.txt", "r").read()
                else:    
                    f_out = open(test_dir+"/"+ files[i].split(".")[0]+"_out.txt", "r").read()

                p = Popen(['python3', translation_dir+"/"+ files[i]], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)

                try:
                    stdout, stderr_data = p.communicate(input=f_in.encode(), timeout=10)
                except subprocess.TimeoutExpired:
                    infinite_loop.append(files[i])
                    continue

                if(stdout.decode().strip()==f_out.strip()):
                    test_passed.append(files[i])
                else:
                    if stderr_data.decode()=='':
                        test_failed.append(files[i])
                        test_failed_details.append('Filename: '+files[i]+' Actual: '+str(f_out)+' Generated: '+ str(stdout.decode()))  
                    else:
                        runtime_failed.append(files[i])
                        runtime_failed_details.append('Filename: '+ files[i]+' Error_type: '+ str(stderr_data.decode())) 

            except Exception as e:
                compile_failed.append(files[i])

    elif args.target_lang =="java":  # target language 

        for i in range(len(files)):

            if not files[i].endswith('.java'):
                continue

            try:
                print('Filename: ', files[i])
                subprocess.run("javac "+translation_dir+"/"+ files[i], check=True, capture_output=True, shell=True, timeout=30)

                with open(test_dir+"/"+ files[i].split(".")[0]+"_in.txt" , 'r') as f:
                    f_in = f.read()
                
                if args.test_type == "misleading_test":
                    f_out = open(test_dir+"/"+ files[i].split(".")[0]+"_misleading_out.txt", "r").read()
                else:
                    f_out = open(test_dir+"/"+ files[i].split(".")[0]+"_out.txt", "r").read()
                p = Popen(['java', files[i].split(".")[0]], cwd=translation_dir, stdin=PIPE, stdout=PIPE, stderr=PIPE)    

                try:
                    stdout, stderr_data = p.communicate(input=f_in.encode(), timeout=100)
                except subprocess.TimeoutExpired:
                    infinite_loop.append(files[i])
                    continue

                if(stdout.decode().strip()==f_out.strip()): # stdout is from the translated code , f_out test data from original language 
                    test_passed.append(files[i])
                else:
                    if stderr_data.decode()=='':
                        test_failed.append(files[i])
                        test_failed_details.append('Filename: '+files[i]+' Actual: '+str(f_out)+' Generated: '+ str(stdout.decode()))  
                    else:
                        runtime_failed.append(files[i])
                        runtime_failed_details.append('Filename: '+ files[i]+' Error_type: '+ str(stderr_data.decode())) 
            
            except Exception as e:
                compile_failed.append(files[i])

        #remove all .class files generated
        dir_files = os.listdir(translation_dir)
        for fil in dir_files:
            if ".class" in fil: os.remove(translation_dir +"/"+ fil)

    else:
        print("language:{} is not yet supported. select from the following languages[Python,Java]".format(args.target_lang))
        return

    test_failed = list(set(test_failed))
    test_failed_details = list(set(test_failed_details))
    runtime_failed = list(set(runtime_failed))
    runtime_failed_details = list(set(runtime_failed_details))
    compile_failed = list(set(compile_failed))
    infinite_loop = list(set(infinite_loop))
    test_passed = list(set(test_passed))

    txt_fp = Path(args.report_dir).joinpath(f"{args.model}_{args.dataset}_compileReport_from_"+str(args.source_lang)+"_to_"+str(args.target_lang)+f"_{args.test_type}.txt")
    with open(txt_fp, "w", encoding="utf-8") as report:
        report.writelines("Total Instances: {}\n\n".format(len(test_passed)+len(compile_failed)+len(runtime_failed)+len(test_failed)+len(infinite_loop)))
        report.writelines("Total Correct: {}\n".format(len(test_passed)))
        report.writelines("Total Runtime Failed: {}\n".format(len(runtime_failed)))
        report.writelines("Total Compilation Failed: {}\n".format(len(compile_failed)))
        report.writelines("Total Test Failed: {}\n".format(len(test_failed)))
        report.writelines("Total Infinite Loop: {}\n\n".format(len(infinite_loop)))
        report.writelines("Accuracy: {}\n".format((len(test_passed)/(len(test_passed)+len(compile_failed)+len(runtime_failed)+len(test_failed)+len(infinite_loop))) * 100))
        report.writelines("Runtime Rate: {}\n".format((len(runtime_failed)/(len(test_passed)+len(compile_failed)+len(runtime_failed)+len(test_failed)+len(infinite_loop))) * 100))
        report.writelines("Compilation Rate: {}\n".format((len(compile_failed)/(len(test_passed)+len(compile_failed)+len(runtime_failed)+len(test_failed)+len(infinite_loop))) * 100))
        report.writelines("Test Failed Rate: {}\n".format((len(test_failed)/(len(test_passed)+len(compile_failed)+len(runtime_failed)+len(test_failed)+len(infinite_loop))) * 100))
        report.writelines("Infinite Loop Rate: {}\n\n".format((len(infinite_loop)/(len(test_passed)+len(compile_failed)+len(runtime_failed)+len(test_failed)+len(infinite_loop))) * 100))
        report.writelines("=================================================================================================\n")
        report.writelines("Failed Test Files: {} \n".format(test_failed))
        report.writelines("Failed Test Details: {} \n".format(test_failed_details))
        report.writelines("=================================================================================================\n")
        report.writelines("Runtime Error Files: {} \n".format(runtime_failed))
        report.writelines("Runtime Error Details: {} \n".format(runtime_failed_details))
        report.writelines("=================================================================================================\n")
        report.writelines("Compilation Error Files: {} \n".format(compile_failed))
        report.writelines("=================================================================================================\n")    
        report.writelines("Infinite Loop Files: {} \n".format(infinite_loop))
        report.writelines("=================================================================================================\n")

    df = pd.DataFrame(columns=['Source Language', 'Target Language', 'Filename', 'Impact'])
    index = 0
    for i in range(0, len(compile_failed)):
        list_row = [args.source_lang, args.target_lang, compile_failed[i], "Compilation Error"]
        df.loc[i] = list_row
        index+=1
    for i in range(0, len(runtime_failed)):
        list_row = [args.source_lang, args.target_lang, runtime_failed[i], "Runtime Error"]
        df.loc[index] = list_row
        index+=1 
    for i in range(0, len(test_failed)):
        list_row = [args.source_lang, args.target_lang, test_failed[i], "Test Failed"]
        df.loc[index] = list_row
        index+=1
    for i in range(0, len(infinite_loop)):
        list_row = [args.source_lang, args.target_lang, infinite_loop[i], "Infinite Loop"]
        df.loc[index] = list_row
        index+=1
    for i in range(0, len(test_passed)):
        list_row = [args.source_lang, args.target_lang, test_passed[i], "Correct"]
        df.loc[index] = list_row
        index+=1

    excel_fp = Path(args.report_dir).joinpath(f"{args.model}_{args.dataset}_compileReport_from_"+str(args.source_lang)+"_to_"+str(args.target_lang)+f"_{args.test_type}.xlsx")
    df.to_excel(excel_fp, sheet_name='Sheet1')


if __name__ == "__main__":

    parser = argparse.ArgumentParser(description='execute codenet tests')
    parser.add_argument('--dataset', help='dataset to use for code translation. should be one of [codenet,avatar]', required=True, type=str)
    parser.add_argument('--source_lang', help='source language to use for code translation. should be one of [python,java]', required=True, type=str)
    parser.add_argument('--target_lang', help='target language to use for code translation. should be one of [python,java]', required=True, type=str)
    parser.add_argument('--model', help='model to use for code translation.', required=True, type=str)
    parser.add_argument('--report_dir', help='path to directory to store report', required=True, type=str)
    parser.add_argument('--test_type', help='test_type', required=True, type=str)
    args = parser.parse_args()

    main(args)
