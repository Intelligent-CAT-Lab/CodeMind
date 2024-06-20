python apr.py --model gpt-3.5-turbo --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'gpt-3.5-turbo'
python apr.py --model gpt-4-1106-preview --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'gpt-4-1106-preview'
python apr.py --model ise-uiuc/Magicoder-S-DS-6.7B --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'ise-uiuc/Magicoder-S-DS-6.7B'
python apr.py --model codellama/CodeLlama-13b-Instruct-hf --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'codellama/CodeLlama-13b-Instruct-hf'
# python apr.py --model mistralai/Mistral-7B-Instruct-v0.1 --dataset HumanEvalFix --cache /home/shared/huggingface
python apr.py --model deepseek-ai/deepseek-coder-6.7b-instruct --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'deepseek-ai/deepseek-coder-6.7b-instruct'
python apr.py --model bigcode/starcoder2-15b --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'bigcode/starcoder2-15b'
python apr.py --model bigcode/starcoder --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'igcode/starcoder'
python apr.py --model WizardLM/WizardCoder-15B-V1.0 --dataset HumanEvalFix --cache /home/shared/huggingface
echo 'WizardLM/WizardCoder-15B-V1.0'

