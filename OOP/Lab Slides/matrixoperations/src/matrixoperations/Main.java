package matrixoperations;

public class Main {
	public static void main(String[] args) {
		double[][] arrayOne = { { 2, 3, 4 }, { 5, 6, 7 } };
		double[][] arrayTwo = { { 2, 3, 3 }, { 5, 5, 6 } };
		double[][] arrayThree = { { 2, 3, 3 }, { 5, 5, 6 } };
		
		Matrix matrixOne = new Matrix(2, 3, arrayOne);
		Matrix matrixTwo = new Matrix(2, 3, arrayTwo);
		Matrix matrixThree = new Matrix(2, 3, arrayThree);
		
		
		Matrix[] matrices = new Matrix[2];
		matrices[0] = matrixTwo;
		matrices[1] = matrixThree;
		
		
		System.out.println("Demonstrating add():\n" + matrixOne.add());
		System.out.println("Demonstrating add(Matrix matrix):\n" + matrixOne.add(matrixTwo));
		System.out.println("Demonstrating add(Matrix[] matrix):\n" + matrixOne.add(matrices));
	}
}
