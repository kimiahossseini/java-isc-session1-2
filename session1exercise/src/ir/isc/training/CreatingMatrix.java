package ir.isc.training;

public class CreatingMatrix {

	public static void main(String[] args) {
		int n=5;
		int m=6;
		randommatrix1(n);   //use one array
		System.out.println("the second version for creating matrix");
		randommatrix2(m);  //use a 2D array
	}
	public static void randommatrix1(int n) {
		for (int row = 0; row < n ; row++) {
			for (int colum = 0; colum < n ; colum++) {
				
				System.out.print((int)(Math.random() * 2));
				
			}
			System.out.println();
		}
	}
	public static void randommatrix2(int m) {
		int [][] matrix=new int[6][6];
		for (int roow = 0; roow < matrix.length; roow++) {
			for (int coullum = 0; coullum < matrix.length; coullum++) {
				matrix[roow][coullum]=(int)(Math.random() * 2);
			}
			
		}
		for (int[] row:matrix) {
			for(int num:row) {
				System.out.print(num);
			}
			System.out.println();
			
		}
	}
	
}
