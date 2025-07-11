package telran.multiarray.tests;

import org.junit.jupiter.api.Test;
import telran.multiarray.tools.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {
    int [][] matrix1 = {{1,2,3}}; //1x3
    int [][] matrix2 = {{1}, {2}, {3}}; //3x1 (сначала вертикаль, потом горизонталь)

    @Test
    void testSum(){
        assertEquals(6, Matrix.sum(matrix1));
        assertEquals(6, Matrix.sum(matrix2));

    }

    @Test
    void testTransp(){
        assertArrayEquals(matrix2, Matrix.transp(matrix1));
    }

    @Test
    void testMultiply(){
        int [][] expected = {{14}};
        assertArrayEquals(expected, Matrix.multiply(matrix1,matrix2));
        int[][] arr1 = { {1,2,3}, {4,5,6}};
        int[][] arr2 = {{1,4}, {2,5}, {3,6}};
        int[][] arrExpected = {{14,32}, {32, 77}};
        assertArrayEquals(arrExpected,Matrix.multiply(arr1,arr2));
    }
}
