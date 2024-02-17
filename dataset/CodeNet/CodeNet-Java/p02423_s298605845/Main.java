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
		bs.flip(0, nbits);
		printBitSet(bs);
		System.out.print("\n");
		bs.flip(0, nbits);
		BitSet bsa = new BitSet(nbits);
		for(int i = 0; i < nbits - 1; i++){
			if(bs.get(i)) bsa.set(i + 1);
		}
		printBitSet(bsa);
		System.out.print("\n");
		bsa = new BitSet(nbits);
		for(int i = 0; i < nbits - 1; i++){
			if(bs.get(i + 1)) bsa.set(i);
		}
		printBitSet(bsa);
		System.out.print("\n");
	}
	static void printBitSet(BitSet bs){
		for(int i = nbits - 1; i >= 0; i--){
			if(bs.get(i)) System.out.print(1);
			else System.out.print(0);
		}
	}
}

