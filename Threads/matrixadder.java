public class matrixadder extends Thread {
    int row_start;
    int row_end;
//    static int [][] matrix1;
//    static int [][] matrix2;
    static int[][] matrix1= {{1, 2, 3, 4,0, 0,0, 1},{0, 0,0, 1,0, 0,0, 1},{1, 2, 3, 4,0, 0,0, 1},{1, 2, 3, 4,0, 0,0, 1}};
    static int[][] matrix2= {{1, 2, 3, 4,0, 0,0, 1},{0, 0,0, 1,0, 0,0, 1},{1, 2, 3, 4,0, 0,0, 1},{1, 2, 3, 4,0, 0,0, 1}};
    static int [][] matrix3=new int[matrix1.length][matrix1[0].length];

    static int[][] matrix= {{1, 2, 3, 4},{0, 0,0, 0},{1, 2, 3, 4},{1, 2, 3, 4}};
    static int column_len=matrix[0].length;

    matrixadder(int row_start, int row_end, int[][] matrix1, int [][] matrix2,int [][] matrix3){
        this.row_end=row_end;
        this.row_start=row_start;
        this.matrix1=matrix1;
        this.matrix2=matrix2;
        this.matrix3=matrix3;
    }
    public static void main(String[] args) throws InterruptedException {

//        System.out.println(matrix1.length);
//        for (int i=1;i<2;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                System.out.println(matrix[i][j]);
//            }
        adder(matrix1.length,matrix1,matrix2);
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void adder(int row_len, int [][] matrix1, int [][] matrix2) throws InterruptedException{


        //28/4=7
        int count=row_len/4;

        matrixadder[] threads=new matrixadder[4];
        for (int i=0;i<4;i++){
            threads[i]=new matrixadder((i*count),(i*count)+count,matrix1,matrix2,matrix3);
            threads[i].start();
            threads[i].join();
        }
    }

    public void run(){

        for (int i=row_start;i<row_end;i++){
            for (int j=0;j<column_len;j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
//                System.out.println(matrix3[i][j]);
//            if (matrix1[i][j]==matrix2[i][j]){
//                    System.out.println("same");
//                    flag=true;
//                }
//                else if (matrix1[i][j]!=matrix2[i][j]){
//                    System.out.println("not same");
//                    flag=false;
//                    break;
//                }
            }
        }

    }


}
