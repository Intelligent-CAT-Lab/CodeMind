python pipeline.py --model Granite --dataDir /home/changshu/CodeMind/dataset/humaneval --dataset HumanEvalNoTest --outDir /home/changshu/CodeMind/Results/DER/Synthesis
python pipeline.py --model Granite --dataDir /home/changshu/CodeMind/dataset/mbpp --dataset MBPPNoTest --outDir /home/changshu/CodeMind/Results/DER/Synthesis
python pipeline.py --model Granite --dataDir /home/changshu/CodeMind/dataset/mbpp --dataset MBPP --outDir /home/changshu/CodeMind/Results/DER/Synthesis
python pipeline.py --model Granite --dataDir /home/changshu/CodeMind/dataset/humaneval --dataset HumanEval --outDir /home/changshu/CodeMind/Results/DER/Synthesis



python convert.py --model Granite --outDir /home/changshu/CodeMind/Results/DER/Synthesis --dataset MBPP --orgDataDir /home/changshu/CodeMind/dataset/mbpp/sanitized-mbpp.json --underTestDir /home/changshu/codemind_tmp/synthesis/undertest
python evaluate.py --model Granite --dataset MBPP --outDir /home/changshu/CodeMind/Results/DER/Synthesis --underTestDir /home/changshu/codemind_tmp/synthesis/undertest --testResultDir /home/changshu/codemind_tmp/synthesis/testresult --passTestDir /home/changshu/codemind_tmp/synthesis/pass