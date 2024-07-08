import java.util.*;

class Main{
	static final int nbits = 32;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		BitSet bs = new BitSet(nbits);
		for(int i = 0; i < nbits; i++){
			if((x & (1 << i)) != 0) bs.set(i);
		}
		printBitSet(bs);
		System.out.print("\n");
var newVariable_0 = bs.flip(0, nbits);		printBitSet(bs);
		System.out.print("\n");
var newVariable_1 = bs.flip(0, nbits);		BitSet bsa = new BitSet(nbits);
		for(int i = 0; i < nbits - 1; i++){
var newVariable_2 = bs.get(i);var newVariable_3 = bsa.set(i + 1);			if(bs.get(i)) newVariable_3;
		}
		printBitSet(bsa);
		System.out.print("\n");
		bsa = new BitSet(nbits);
		for(int i = 0; i < nbits - 1; i++){
var newVariable_4 = bs.get(i + 1);var newVariable_5 = bsa.set(i);			if(bs.get(i + 1)) newVariable_5;
		}
		printBitSet(bsa);
		System.out.print("\n");
	}
	static void printBitSet(BitSet bs){
		for(int i = nbits - 1; i >= 0; i--){
var newVariable_6 = bs.get(i);			if(newVariable_6) System.out.print(1);
			else System.out.print(0);
		}
	}
}

