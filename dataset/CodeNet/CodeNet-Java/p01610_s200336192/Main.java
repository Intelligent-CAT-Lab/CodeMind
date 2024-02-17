import java.util.*;

public class Main{
	char [] index = {'R', 'U', 'F', 'D', 'B' ,'L'};
	char [][] data;
	int [][][][] rotatetable = {
			{
				{
					{3,5},
					{3,3},
					{3,1},
					{6,2},
				},
				{
					{3,4},
					{3,2},
					{3,0},
					{6,3},
				},
				{
					{4,2},
					{5,2},
					{5,3},
					{4,3},
				},
			},
			{
				{
					{7,2},
					{5,2},
					{3,2},
					{1,2},
				},
				{
					{6,2},
					{4,2},
					{2,2},
					{0,2},
				},
				{
					{2,0},
					{3,0},
					{3,1},
					{2,1},
				},
			},
			{
				{
					{2,1},
					{4,2},
					{3,4},
					{1,3},
				},
				{
					{3,1},
					{4,3},
					{2,4},
					{1,2},
				},
				{
					{2,2},
					{3,2},
					{3,3},
					{2,3},
				},
			},
			{
				{
					{0,3},
					{2,3},
					{4,3},
					{6,3},
				},
				{
					{1,3},
					{3,3},
					{5,3},
					{7,3},
				},
				{
					{2,4},
					{3,4},
					{3,5},
					{2,5},
				},
			},
			{
				{
					{0,2},
					{2,5},
					{5,3},
					{3,0},
				},
				{
					{0,3},
					{3,5},
					{5,2},
					{2,0},
				},
				{
					{6,2},
					{7,2},
					{7,3},
					{6,3},
				},
			},
			{
				{
					{2,0},
					{2,2},
					{2,4},
					{7,3},
				},
				{
					{2,1},
					{2,3},
					{2,5},
					{7,2},
				},
				{
					{0,2},
					{1,2},
					{1,3},
					{0,3},
				},
			},
	};

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			data = new char[6][8];
			
			init();
			
			for(int i = 0; i < s.length();i++){
				char c = s.charAt(i);
				int ind = -1;
				for(int j = 0; j < index.length; j++){
					if(index[j] == c){
						ind = j;
						break;
					}
				}
				rotate(ind);
			}
			print();
		}
	}

	private void rotate(int ind) {
		for(int i = 0; i < rotatetable[ind].length; i++){
			swap(ind, i);
		}
	}

	private void swap(int ind, int ind2) {
		int tempx = rotatetable[ind][ind2][0][0];
		int tempy = rotatetable[ind][ind2][0][1];
		char tempvalue = data[tempy][tempx];
		int prevx = tempx, prevy = tempy;
		for(int i = 3; i >= 1; i--){
			int nowx = rotatetable[ind][ind2][i][0];
			int nowy = rotatetable[ind][ind2][i][1];
			data[prevy][prevx] = data[nowy][nowx];
			prevx = nowx;
			prevy = nowy;
		}
		int secx = rotatetable[ind][ind2][1][0];
		int secy = rotatetable[ind][ind2][1][1];
		data[secy][secx] = tempvalue;
	}

	private void print() {
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}

	private void init() {
		for(int i = 0; i < data.length; i++){
			Arrays.fill(data[i], '.');
		}
		for(int i = 0; i < 2; i++){
			for(int j = 2; j < 4; j++){
				data[i][j] = 'r';
			}
		}
		for(int i = 2; i < 4; i++){
			for(int j = 0; j < 2; j++){
				data[i][j] = 'g';
			}
			for(int j = 2; j < 4; j++){
				data[i][j] = 'y';
			}
			for(int j = 4; j < 6; j++){
				data[i][j] = 'b';
			}
			for(int j = 6; j < 8; j++){
				data[i][j] = 'w';
			}
		}
		for(int i = 4; i < 6; i++){
			for(int j = 2; j < 4; j++){
				data[i][j] = 'o';
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}