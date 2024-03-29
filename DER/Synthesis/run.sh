# cd DER
# python pipeline.py --model GPT_4 --dataDir ../dataset/humaneval --dataset HumanEval --outDir ../../DER/synthesis
# python convert.py --model GPT_4 --outDir  ../../DER/synthesis --dataset HumanEval --orgDataDir ../dataset/humaneval/HumanEval.jsonl --underTestDir ../../DER/undertest
# python evaluate.py --model GPT_4 --dataset HumanEval --outDir ../../DER/synthesis --underTestDir ../../DER/undertest --testResultDir ../../DER/testresult --passTestDir ../../DER/pass
# cd IER
# python predict.py --model GPT_4 --fileName main.py --dataDir ../../DER/pass/HumanEval/GPT_4 --writeDir ../../DER/Reasoning/ --dataset HumanEval


MODEL=$1
DATADIR=$2
DATASET=$3
OUTDIR=$4
ORGDATASET=$5
UNDERTESTDIR=$6
TESTRESULTDIR=$7
PASSINGDIR=$8
FILENAME=$9
REASONINGDIR=$10


python pipeline.py --model $MODEL --dataDir $DATADIR --dataset $DATASET --outDir $OUTDIR
python convert.py --model $MODEL --outDir  $OUTDIR --dataset $DATASET --orgDataDir $ORGDATASET --underTestDir $UNDERTESTDIR
python evaluate.py --model $MODEL --dataset $DATASET --outDir $OUTDIR --underTestDir $UNDERTESTDIR --testResultDir $TESTRESULTDIR --passTestDir $PASSINGDIR
cd ../../IER
python predict.py --model $MODEL --fileName $FILENAME --dataDir $PASSINGDIR/$DATASE/$MODEL --writeDir $REASONINGDIR --dataset $DATASET
python parse_result.py --model $MODEL --resultDir $REASONINGDIR/$DATASE/$MODEL --gtDir $PASSINGDIR/$DATASE/$MODEL