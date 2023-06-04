package matrixoperations;

public class Matrix {
	private int numRows;
	private int numColumns;
	private double[][] matrixValues;

	public Matrix(int numRows, int numColumns, double[][] matrixValues) {
		this.numRows = numRows;
		this.numColumns = numColumns;
		this.matrixValues = matrixValues;
	}

	public Matrix add() {
		return this.add(this);
	}

	public Matrix add(Matrix matrix) {
		double[][] addedMatrixValues = new double[this.numRows][this.numColumns];
		Matrix addedMatrix = new Matrix(this.numRows, this.numColumns, addedMatrixValues);
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				addedMatrixValues[i][j] = this.matrixValues[i][j] + matrix.matrixValues[i][j];
			}
		}
		return addedMatrix;
	}

	public Matrix add(Matrix[] matrices) {
		Matrix currentMatrix = this;
		for (Matrix matrix : matrices) {
			currentMatrix = currentMatrix.add(matrix);
		}
		return currentMatrix;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String matrix = "";
		for (double[] rows : matrixValues) {
			for (double column : rows) {
				matrix += column + " ";
			}
			matrix += "\n";
		}
		return matrix;
	}
}
