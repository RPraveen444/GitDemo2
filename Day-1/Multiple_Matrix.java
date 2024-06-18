public class Multiple_Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] matrix2 = {{1,2,3},{1,2,3},{1,2,3}};

        int rowsA = matrix1.length;
        int colsA = matrix1[0].length;
        int rowsB = matrix1.length;
        int colsB = matrix2[0].length;

        int[][] result = new int[rowsA][colsB];

        if(colsA!=rowsB){
            System.out.println("Size doses not match");
        }

        for(int i=0 ;i<rowsA ; i++){
            for(int j=0 ;j<colsB ; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for(int[] rows : result){
            for(int row : rows){
                System.out.print(row + " ");
            }
            System.out.println();
        }



    }
}
