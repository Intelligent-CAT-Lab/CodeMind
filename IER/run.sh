# python predict.py --model MagicCoder --fileName main.py --dataset MBPP --dataDir ../dataset/mbpp --writeDir ../../IER
# cd ../Evaluate
# python parse_results.py --model MagicCoder --resultDir ../../test/MagicCoder --gtDir ../dataset/mbpp


python predict.py --model $1 --fileName $2 --dataset $3 --dataDir $4 --writeDir $5
python parse_result.py --model $1 --resultDir $5/$3/$1 --gtDir $4
