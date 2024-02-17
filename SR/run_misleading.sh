MODEL=$1
DATASET=$2
DATADIR=$3
MISLEADING=$4
cd SR
python pipeline.py --model $MODEL --dataDir $DATADIR --dataset $DATASET --outDir ../Results/SR/misleading/synthesis --mutate $MISLEADING
python convert.py --model $MODEL --outDir ../Results/SR/misleading/synthesis --dataset $DATASET --underTestDir ../Results/SR/misleading/undertest
python evaluate.py --model $MODEL --dataset $DATASET --outDir ../Results/SR/misleading/synthesis --underTestDir ../Results/SR/misleading/undertest --testResultDir ../Results/SR/misleading/testresult --passTestDir ../Results/SR/misleading/pass
