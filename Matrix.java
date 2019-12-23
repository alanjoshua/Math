package Math;

public class Matrix {

	private float[][] data;
	private int rows, cols;

	public Matrix(float[][] data) {
		this.data = data;
		rows = data.length;
		cols = data[0].length;
	}

	public Matrix(int r, int c) {
		rows = r;
		cols = c;
		data = new float[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = 0f;
			}
		}

	}

	public Matrix(int r, int c, float val) {
		rows = r;
		cols = c;
		data = new float[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = val;
			}
		}
	}

public static Matrix add(Matrix a,Matrix b) {
		
		Matrix res = null;
		float[][] resData = new float[a.getRows()][a.getCols()];
		if(a.getRows() == b.getRows() && a.getCols() == b.getCols()) {
			for(int i = 0; i < a.getRows();i++) {
				for(int j = 0;j < a.getCols();j++) {
					resData[i][j] = a.getData()[i][j] + b.getData()[i][j];
				}
			}
			res = new Matrix(resData);
		}
		
		else {
			System.err.println("Size of Matrix A and B should be the same");
			System.out.println("Returning Matrix of size A with values 1");
			res = new Matrix(a.getRows(),a.getCols(),1f);
		}
		
		return res;
		
}

public static Matrix sub(Matrix a,Matrix b) {
	
	Matrix res = null;
	float[][] resData = new float[a.getRows()][a.getCols()];
	if(a.getRows() == b.getRows() && a.getCols() == b.getCols()) {
		for(int i = 0; i < a.getRows();i++) {
			for(int j = 0;j < a.getCols();j++) {
				resData[i][j] = a.getData()[i][j] - b.getData()[i][j];
			}
		}
		res = new Matrix(resData);
	}
	
	else {
		System.err.println("Size of Matrix A and B should be the same");
		System.out.println("Returning Matrix of size A with values 1");
		res = new Matrix(a.getRows(),a.getCols(),1f);
	}
	
	return res;
	
}

public static Matrix mul(Matrix a,Matrix b) {
	
	Matrix res = null;
	float[][] resData = new float[a.getRows()][a.getCols()];
	if(a.getRows() == b.getRows() && a.getCols() == b.getCols()) {
		for(int i = 0; i < a.getRows();i++) {
			for(int j = 0;j < a.getCols();j++) {
				resData[i][j] = a.getData()[i][j] * b.getData()[i][j];
			}
		}
		res = new Matrix(resData);
	}
	
	else {
		System.err.println("Size of Matrix A and B should be the same");
		System.out.println("Returning Matrix of size A with values 1");
		res = new Matrix(a.getRows(),a.getCols(),1f);
	}
	
	return res;
	
}

public Matrix scalarAdd(float x) {
	float[][] res = new float[rows][cols];
	
	for(int i = 0;i < rows;i++) {
		for(int j= 0;j < cols; j++) {
			res[i][j] = data[i][j] + x;
		}
	}
	return new Matrix(res);
}

public static Matrix scalarAdd(Matrix a,float x) {
	float[][] res = new float[a.getRows()][a.getCols()];
	
	for(int i = 0;i < a.getRows();i++) {
		for(int j= 0;j < a.getCols(); j++) {
			res[i][j] = a.getData()[i][j] + x;
		}
	}
	return new Matrix(res);
}

public Matrix scalarMul(float x) {
	float[][] res = new float[rows][cols];
	
	for(int i = 0;i < rows;i++) {
		for(int j= 0;j < cols; j++) {
			res[i][j] = data[i][j] * x;
		}
	}
	return new Matrix(res);
}

public static Matrix scalarMul(Matrix a,float x) {
	float[][] res = new float[a.getRows()][a.getCols()];
	
	for(int i = 0;i < a.getRows();i++) {
		for(int j= 0;j < a.getCols(); j++) {
			res[i][j] = a.getData()[i][j] * x;
		}
	}
	return new Matrix(res);
}


public static Matrix divide(Matrix a,Matrix b) {
	
	Matrix res = null;
	float[][] resData = new float[a.getRows()][a.getCols()];
	if(a.getRows() == b.getRows() && a.getCols() == b.getCols()) {
		for(int i = 0; i < a.getRows();i++) {
			for(int j = 0;j < a.getCols();j++) {
				resData[i][j] = a.getData()[i][j] / b.getData()[i][j];
			}
		}
		res = new Matrix(resData);
	}
	
	else {
		System.err.println("Size of Matrix A and B should be the same");
		System.out.println("Returning Matrix of size A with values 1");
		res = new Matrix(a.getRows(),a.getCols(),1f);
	}
	
	return res;
	
}	

public Matrix add(Matrix b) {
		
		Matrix res = null;
		float[][] resData = new float[rows][cols];
		if(rows == b.getRows() && cols == b.getCols()) {
			for(int i = 0; i < rows;i++) {
				for(int j = 0;j < cols;j++) {
					resData[i][j] = data[i][j] + b.getData()[i][j];
				}
			}
			res = new Matrix(resData);
		}
		
		else {
			System.err.println("Size of Matrix A and B should be the same");
			System.out.println("Returning Matrix of size A with values 1");
			res = new Matrix(rows,cols,1f);
		}
		
		return res;
		
	}

public Matrix sub(Matrix b) {
	
	Matrix res = null;
	float[][] resData = new float[rows][cols];
	if(rows == b.getRows() && cols == b.getCols()) {
		for(int i = 0; i < rows;i++) {
			for(int j = 0;j < cols;j++) {
				resData[i][j] = data[i][j] - b.getData()[i][j];
			}
		}
		res = new Matrix(resData);
	}
	
	else {
		System.err.println("Size of Matrix A and B should be the same");
		System.out.println("Returning Matrix of size A with values 1");
		res = new Matrix(rows,cols,1f);
	}
	
	return res;
	
}

public Matrix mul(Matrix b) {
	
	Matrix res = null;
	float[][] resData = new float[rows][cols];
	if(rows == b.getRows() && cols == b.getCols()) {
		for(int i = 0; i < rows;i++) {
			for(int j = 0;j < cols;j++) {
				resData[i][j] = data[i][j] * b.getData()[i][j];
			}
		}
		res = new Matrix(resData);
	}
	
	else {
		System.err.println("Size of Matrix A and B should be the same");
		System.out.println("Returning Matrix of size A with values 1");
		res = new Matrix(rows,cols,1f);
	}
	
	return res;
	
}


public Matrix divide(Matrix b) {
	
	Matrix res = null;
	float[][] resData = new float[rows][cols];
	if(rows == b.getRows() && cols == b.getCols()) {
		for(int i = 0; i < rows;i++) {
			for(int j = 0;j < cols;j++) {
				resData[i][j] = data[i][j] / b.getData()[i][j];
			}
		}
		res = new Matrix(resData);
	}
	
	else {
		System.err.println("Size of Matrix A and B should be the same");
		System.out.println("Returning Matrix of size A with values 1");
		res = new Matrix(rows,cols,1f);
	}
	
	return res;
	
}

	public static Matrix matMul(Matrix a, Matrix m) {
		Matrix res = null;

		float[][] resData;

		if (a.getCols() == m.rows) {

			resData = new float[a.getRows()][m.getCols()];

			for (int colsInM = 0; colsInM < m.getCols(); colsInM++) {

				for (int rowsInA = 0; rowsInA < a.getRows(); rowsInA++) {

					for (int colsInA = 0; colsInA < a.getCols(); colsInA++) {

						resData[rowsInA][colsInM] += a.getData()[rowsInA][colsInA] * m.getData()[colsInA][colsInM];

					}

				}

			}
			res = new Matrix(resData);
		} else {
			System.err.println(" number of Columns on Mat A and rows of Mat B do not match");
			System.out.println("Returning Matrix with values 1");
			res = new Matrix(a.getRows(), m.getCols(),1f);
		}

		return res;
	}

	public Matrix matMul(Matrix m) {
		Matrix res = null;

		float[][] resData;

		if (cols == m.rows) {

			resData = new float[rows][m.getCols()];

			for (int colsInM = 0; colsInM < m.getCols(); colsInM++) {

				for (int rowsInA = 0; rowsInA < rows; rowsInA++) {

					for (int colsInA = 0; colsInA < cols; colsInA++) {

						resData[rowsInA][colsInM] += data[rowsInA][colsInA] * m.getData()[colsInA][colsInM];

					}

				}

			}
			res = new Matrix(resData);
		} else {
			System.err.println(" number of Columns on Mat A and rows of Mat B do not match");
			res = new Matrix(rows, m.getCols(),1f);
		}

		return res;
	}
	
	public Matrix matMul(Vector m) {
		Matrix res = null;

		float[][] resData;

		if (cols == m.getSize()) {

			resData = new float[rows][1];

				for (int rowsInA = 0; rowsInA < rows; rowsInA++) {

					for (int colsInA = 0; colsInA < cols; colsInA++) {
						resData[rowsInA][0] += 
								data[rowsInA][colsInA] 
								* m.getData()[colsInA];

					}

				}

			res = new Matrix(resData);
		} else {
			System.err.println(" number of Columns on Mat A and rows of Mat B do not match");
			res = new Matrix(rows, 1,1f);
		}

		return res;
	}
	
	public static Matrix matMul(Matrix a,Vector m) {
		Matrix res = null;

		float[][] resData;

		if (a.getCols() == m.getSize()) {

			resData = new float[a.getRows()][1];

				for (int rowsInA = 0; rowsInA < a.getRows(); rowsInA++) {

					for (int colsInA = 0; colsInA < a.getRows(); colsInA++) {

						resData[rowsInA][0] += a.getData()[rowsInA][colsInA] * m.getData()[colsInA];

					}

				}

			res = new Matrix(resData);
		} else {
			System.err.println(" number of Columns on Mat A and rows of Mat B do not match");
			res = new Matrix(a.getRows(), 1,1f);
		}

		return res;
	}

	public float[][] getData() {
		return data;
	}

	public void setData(float[][] data) {
		this.data = data;
		rows = data.length;
		cols = data[0].length;
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}
	
	public Matrix transpose() {
		float[][] res = new float[cols][rows];
		for(int i = 0;i < rows;i++) {
			for(int j = 0;j < cols;j++) {
				res[j][i] = getData()[i][j];
			}
		}
		return new Matrix(res);
	}
	
	public static Matrix transpose(Matrix a) {
		float[][] res = new float[a.getCols()][a.getRows()];
		for(int i = 0;i < a.getRows();i++) {
			for(int j = 0;j < a.getCols();j++) {
				res[j][i] = a.getData()[i][j];
			}
		}
		return new Matrix(res);
	}
	
	public Vector toVector() {
		if(getCols() == 1) {
			return new Vector(this.transpose().getData()[0]);
		}
		else if(getRows() == 1) {
			return new Vector(getData()[0]);
		}
		else {
			System.err.println("Matrix is not a row or column vector");
			System.out.println("Returning row Vector of size 1 with 1");
			return new Vector(new float[]{1f});
		}
	}
	
	public static Vector toVector(Matrix a) {
		if(a.getCols() == 1) {
			return new Vector(a.transpose().getData()[0]);
		}
		else if(a.getRows() == 1) {
			return new Vector(a.getData()[0]);
		}
		else {
			System.err.println("Matrix is not a row or column vector");
			System.out.println("Returning row Vector of size 1 with 1");
			return new Vector(new float[]{1f});
		}
	}
	
	public void display() {
		for(int i = 0;i < rows;i++) {
			for(int j = 0;j < cols;j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void display(Matrix a) {
		for(int i = 0;i < a.getRows();i++) {
			for(int j = 0;j < a.getCols();j++) {
				System.out.print(a.getData()[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
