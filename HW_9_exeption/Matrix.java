package EpamJavaCourse.HW_9_exeption;

import java.text.DecimalFormat;

public class Matrix {

    private double[][] arr;
    private int numberOfRows;
    private int numberOfColumns;

    private static final String MESSAGE = "Incompatible matrix sizes";

    public Matrix(int row, int column) throws MatrixException {

        if (row <= 0 || column <= 0) {
            throw new MatrixException();
        }

        numberOfRows = row;
        numberOfColumns = column;
        arr = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = 0;
            }
        }
    }


    public Matrix(double[][] twoDimensionalArray) throws MatrixException {

        if (twoDimensionalArray.length <= 0) {
            throw new MatrixException("Array passed with zero number of rows");
        } else if (twoDimensionalArray[0].length <= 0) {
            throw new MatrixException("Array passed with zero number of columns");
        }


        numberOfRows = twoDimensionalArray.length;
        numberOfColumns = twoDimensionalArray[0].length;

        arr = new double[twoDimensionalArray.length][];
        for (int i = 0; i < twoDimensionalArray.length; i++)
            arr[i] = twoDimensionalArray[i].clone();
    }


    public final int rows() {
        return numberOfRows;
    }


    public final int columns() {
        return numberOfColumns;
    }


    public double[][] twoDimensionalArrayOutOfMatrix() {
        return arr;
    }


    public double getValue(int row, int column) throws MatrixException {
        if (row < numberOfRows && column < numberOfColumns) {
            return arr[row][column];
        }
        throw new MatrixException(MESSAGE);
    }


    public void setValue(int row, int column, double newValue) throws MatrixException {

        if (row < numberOfRows && column < numberOfColumns) {
            arr[row][column] = newValue;
        } else {
            throw new MatrixException(MESSAGE);
        }
    }

    public Matrix addition(Matrix matrix) throws MatrixException {

        if (numberOfRows == matrix.rows() && numberOfColumns == matrix.columns()) {

            double[][] result = new double[numberOfRows][numberOfColumns];

            for (int i = 0; i < matrix.rows(); i++) {
                for (int j = 0; j < matrix.columns(); j++) {
                    result[i][j] = this.arr[i][j] + matrix.getValue(i, j);
                }
            }
            return new Matrix(result);
        }
        throw new MatrixException(MESSAGE);
    }


    public Matrix subtraction(final Matrix matrix) throws MatrixException {

        if (numberOfRows == matrix.rows() && numberOfColumns == matrix.columns()) {

            double[][] result = new double[numberOfRows][numberOfColumns];

            for (int i = 0; i < matrix.rows(); i++) {
                for (int j = 0; j < matrix.columns(); j++) {
                    result[i][j] = this.arr[i][j] - matrix.getValue(i, j);
                }
            }
            return new Matrix(result);
        }
        throw new MatrixException(MESSAGE);
    }


    public Matrix multiplication(final Matrix matrix) throws MatrixException {

        if (numberOfColumns == matrix.rows()) {

            double[][] result = new double[numberOfRows][matrix.columns()];

            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < matrix.columns(); j++) {
                    for (int k = 0; k < numberOfColumns; k++) {
                        result[i][j] += this.arr[i][k] * matrix.getValue(k, j);
                    }
                }
            }
            return new Matrix(result);
        }
        throw new MatrixException(MESSAGE);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                try {
                    if (j != this.columns() - 1) {
                        builder.append(decimalFormat.format(getValue(i, j)) + " ");
                    } else {
                        builder.append(decimalFormat.format(getValue(i, j)));
                    }
                } catch (MatrixException e) {
                    e.getMessage();
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}