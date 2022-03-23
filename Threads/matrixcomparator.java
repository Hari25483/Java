public class matrixcomparator extends Thread {
    int row_start;
    int row_end;
    int [][] matrix1;
    int [][] matrix2;
    static int[][] matrix= {{1, 2, 3, 4},{0, 0,0, 0},{1, 2, 3, 4},{1, 2, 3, 4}};
    static int column_len=matrix[0].length;
    static boolean flag;
    matrixcomparator(int row_start, int row_end, int[][] matrix1, int [][] matrix2){
        this.row_end=row_end;
        this.row_start=row_start;
        this.matrix1=matrix1;
        this.matrix2=matrix2;
    }
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix1= {{1, 2, 3, 4},{0, 0,0, 0},{1, 2, 3, 4},{1, 2, 3, 4}};
        int[][] matrix2= {{1, 2, 3, 4},{0, 0,0, 0},{1, 2, 3, 4},{1, 2, 3, 4}};
//        System.out.println(matrix1.length);
//        for (int i=1;i<2;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                System.out.println(matrix[i][j]);
//            }
            boolean ans=issame(matrix1.length,matrix1,matrix2);
            System.out.println(flag);
//        }
    }


    public static Boolean issame(int row_len, int [][] matrix1,int [][] matrix2) throws InterruptedException{


        //28/4=7
        int count=row_len/4;

        matrixcomparator[] threads=new matrixcomparator[4];
        for (int i=0;i<4;i++){
            threads[i]=new matrixcomparator((i*count),(i*count)+count,matrix1,matrix2);
            threads[i].start();
            threads[i].join();
        }
        return flag;
    }

    public void run(){
        for (int i=row_start;i<row_end;i++){
            for (int j=0;j<column_len;j++){
                if (matrix1[i][j]==matrix2[i][j]){
                    System.out.println("same");
                    flag=true;
                }
                else if (matrix1[i][j]!=matrix2[i][j]){
                    System.out.println("not same");
                    flag=false;
                    return;
                }
            }
        }

    }


}
