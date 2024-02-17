import os
import json
import argparse

def compare_string_answers(student_answer, ground_truth):
    def purify_string(s):
        s = s.replace(" ", "")  # removing any spaces
        s = s.replace("'", "\"")  # replacing single quotes with double quotes
        s = s.replace("_","")
        # now parse as json, so that lists and dicts are treated as Python objects
        try:
            return json.loads(s)
        except json.JSONDecodeError:  # if it's not json serializable, return as string
            return s

    # purify both strings and then compare
    return purify_string(student_answer) == purify_string(ground_truth)



def compare_string_answers(student_answer, ground_truth):
    def purify_string(s):
        s = s.replace(" ", "")  # removing any spaces
        s = s.replace("'", "\"")  # replacing single quotes with double quotes
        s = s.replace("_","")
        # now parse as json, so that lists and dicts are treated as Python objects
        try:
            return json.loads(s)
        except json.JSONDecodeError:  # if it's not json serializable, return as string
            return s

    # purify both strings and then compare
    return purify_string(student_answer) == purify_string(ground_truth)

def postprocess_response(response,chunk_prompt=False):
    OUTPUT_IDENTIFIER="<<<Output>>>"
    END_OF_RESPONSE_IDENTIFIER="[END-OF-RESPONSE]"
    CHUNK_PATTERN="""Follow the following format:
    <<<Analysis>>>
    {YOUR ANALYSIS}
    <<<Output>>>
    {OUTPUT}
    [END-OF-RESPONSE]
    [/INST]
    """
    if chunk_prompt:
        try:
            response = response.split(CHUNK_PATTERN)[1]
            if END_OF_RESPONSE_IDENTIFIER in response:
                response = response.split(END_OF_RESPONSE_IDENTIFIER)[0]
        except:
            return "WRONG"
    else:
        response = response.split(END_OF_RESPONSE_IDENTIFIER)[0]
    if OUTPUT_IDENTIFIER not in response:
        print("OUTPUT_IDENTIFIER not found in response")
        print(response)
        return response
    response = response.split(OUTPUT_IDENTIFIER)
    return response[1].strip()


def parse_magiccoder(folder_result):
    for d in os.listdir(folder_result):
        if '.' in d:
            continue
        path_result = os.path.join(folder_result, d, 'raw_output.txt')
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            predict = raw_result.split('@@ Response')[-1].split('<<<Output>>>')[-1].split('[END-OF-RESPONSE]')[0]
        with open(path_pred, 'w') as wr:
            wr.write(predict)

def parse_wizardcoder(folder_result):
    for d in os.listdir(folder_result):
        if '.' in d:
            continue
        path_result = os.path.join(folder_result, d, "raw_output.txt")
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        # print(path_pred)
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            # Consider the following code:
            predict = raw_result.split('[[[Example End]]]')[-1].split('<<<Output>>>')[-1].split('END-OF-OUTPUT')[0]
            # predict = raw_result.split('## Response:')[-1].split('[END-OF-RESPONSE]')[0].split("<<<Output>>>")[-1]
        with open(path_pred, 'w') as wr:
            wr.write(predict)

def parse_deepseek(folder_result):
    a = 0
    for d in os.listdir(folder_result):
        if '.' in d:
            continue
        path_result = os.path.join(folder_result, d, 'deepseek_cot.txt')
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            if "<<<Output>>>" not in raw_result.split('### Response')[-1]:
                a += 1
                print(path_result)
            predict = raw_result.split('### Response')[-1].split('[END-OF-RESPONSE]')[0].split("<<<Output>>>")[-1]
        with open(path_pred, 'w') as wr:
            wr.write(predict)
    print(a)

def parse_chatgpt(folder_result):
    for d in os.listdir(folder_result):
        if d == 'process_log.txt':
            continue
        path_result = os.path.join(folder_result, d, 'raw_output.txt')
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            predict = raw_result.split('<<<Output>>>')[-1].split('[END-OF-RESPONSE]')[0]
        with open(path_pred, 'w') as wr:
            wr.write(predict)
            
def parse_mistral(folder_result):
    for d in os.listdir(folder_result):
        if d == 'process_log.txt':
            continue
        path_result = os.path.join(folder_result, d, "raw_output.txt")
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            predict = raw_result.split('<<<Output>>>')[-1].split('[END-OF-RESPONSE]')[0]
        with open(path_pred, 'w') as wr:
            wr.write(predict)

def parse_codellama(folder_result):
    for d in os.listdir(folder_result):
        if d == 'codellama.log' or d=='process_log.txt':
            continue
        path_result = os.path.join(folder_result, d, "raw_output.txt")
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        # print(path_result)
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            predict = raw_result.split('<<<Output>>>')[-1].split('[END-OF-RESPONSE]')[0]
            # print(raw_result.split('<<<Output>>>')[-1].split('[END-OF-RESPONSE]'))
        with open(path_pred, 'w') as wr:
            wr.write(predict)
            
def parse_codellama_direct(folder_result):
    for d in os.listdir(folder_result):
        if d == 'codellama.log' or d=='process_log.txt':
            continue
        path_result = os.path.join(folder_result, d, "raw_output.txt")
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        # print(path_result)
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            predict = open(path_result, 'r', encoding='utf-8').read()
            # predict = raw_result.split('<<<Output>>>')[-1].split('[END-OF-RESPONSE]')[0]
        with open(path_pred, 'w') as wr:
            wr.write(predict)
            
def parse_StarCoder(folder_result):
    for d in os.listdir(folder_result):
        # if d != "p01467":
        #     continue
        if '.' in d:
            continue
        path_result = os.path.join(folder_result, d, "raw_output.txt")
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            try:
                predict = raw_result.split('Consider the following code:')[2].split('The output of code execution is:')[1].split('END-OF-OUTPUT')[0]
                # print(predict)
                # print(raw_result.split('Consider the following code:')[2].split('The output of code execution is:')[1].split('END-OF-OUTPUT')[0])
            except:
               predict = 'FILE_NOT_FOUND' 
               print(path_result)
        with open(path_pred, 'w') as wr:
            wr.write(predict)

def parse_llama(root_result):
    folder_result = root_result
    for d in os.listdir(folder_result):
        if '.' in d:
            continue
        path_result = os.path.join(folder_result, d, 'raw_output')
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        
        if not os.path.exists(path_result):
            predict = 'FILE_NOT_FOUND'
            
        else:
            raw_result = open(path_result, 'r', encoding='utf-8').read()
            try:
                predict = postprocess_response(raw_result,chunk_prompt=False)
            except:
                print(path_result)
                predict = "NOANSWER"
        with open(path_pred, 'w') as wr:
            wr.write(predict)

def get_result(folder_result, root_gt):
    id_correct = []
    id_incorrect = []
    for d in os.listdir(folder_result):
        if '.' in d:
            continue
        path_pred = os.path.join(folder_result, d,  'predict.txt')
        path_gt = os.path.join(root_gt, d, 'output.txt')
        if not os.path.exists(path_gt):
            continue
        if not os.path.exists(path_pred):
            id_incorrect.append(d)
            continue
        predict = open(path_pred, 'r').read().replace('\n','').replace(' ','').replace('"','\'')
        gt = open(path_gt, 'r').read().replace('\n','').replace(' ','').replace('"','\'')
        if predict.startswith("'") or predict.startswith("`"):
            predict = predict[1:]
        if gt.startswith("'") or gt.startswith("`"):
            gt = gt[1:]
        if predict.endswith("'") or predict.endswith("`"):
            predict = predict[:-1]
        if gt.endswith("'") or gt.endswith("`"):
            gt = gt[:-1]
        res = 0
        predict = predict.replace("[END-OF-RESPONSE]", "")
        if predict == gt:
            id_correct.append(d)
            res = 1
        else:
            id_incorrect.append(d)
        # print(predict, gt, res)
    num_correct = len(id_correct)
    num_total = (len(id_correct) + len(id_incorrect))
    
    print(num_correct,num_total,  num_correct/num_total)
    return id_correct, id_incorrect

    

if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--resultDir", type=str, default="none")
    parser.add_argument("--gtDir", type=str, default='none')
    args = parser.parse_args()
    
    model = args.model
    result_dir = args.resultDir
    gt_dir = args.gtDir
    
    if model == 'MagicCoder':
        parse_magiccoder(result_dir)
    if model == 'GPT_3' or model == 'GPT_4':
        parse_chatgpt(result_dir)
    if model == 'WizardCoder':
        parse_wizardcoder(result_dir)
    if model == 'CodeLlama':
        parse_codellama(result_dir)
    if model == 'Llama':
        parse_llama(result_dir)
    if model == 'StarCoder':
        parse_StarCoder(result_dir)
    if model == "Mistral":
        parse_mistral(result_dir)
    if model == "Deepseek":
        parse_deepseek(result_dir)
    
    id_correct, id_incorrect = get_result(result_dir, gt_dir)
    