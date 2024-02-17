# cd SR
# python pipeline.py --model GPT_4 --dataDir ../dataset/mbpp --dataset MBPPNoTest --outDir ../../SR/notest/synthesis
# python convert.py --model GPT_4 --outDir ../../SR/notest/synthesis --dataset MBPPNoTest --underTestDir ../../SR/notest/undertest
# python evaluate.py --model GPT_4 --dataset MBPPNoTest --outDir ../../SR/notest/synthesis --underTestDir ../../SR/notest/undertest --testResultDir ../../SR/notest/testresult --passTestDir ../../SR/notest/pass
# cd ../IER
# python predict.py --model GPT_4 --fileName main.py --dataDir ../../SR/notest/pass/MBPPNoTest/GPT_4 --writeDir ../../SR/notest/reasoning --dataset MBPP

MODEL=$1
DATASE=$2
DATADIR=$3
cd SR
python pipeline.py --model $MODEL --dataDir $DATADIR --dataset $DATASET --outDir ../Results/SR/notest/synthesis
python convert.py --model $MODEL --outDir ../Results/SR/notest/synthesis --dataset $DATASET  --underTestDir ../Results/SR/notest/undertest
python evaluate.py --model $MODEL --dataset $DATASET  --outDir ../Results/SR/notest/synthesis --underTestDir ../Results/SR/notest/undertest --testResultDir ../Results/SR/notest/testresult --passTestDir ../Results/SR/notest/pass
