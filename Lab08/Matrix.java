
public class Matrix extends Thread { 

    private static int [][] a; 
    private static int [][] b; 
    private static int [][] c; 

	/* You might need other variables as well */
	private int row_id, column_id;
    private int size;


    public Matrix(int [][] a1, int  [][] b1) { // need to change this, might need some information
		b = b1;
		a = a1;
	}

	//Constructor of the Matrix class
	public Matrix ( int [][] final_matrix,int [][] matrix1, int  [][] matrix2,int row_id, int column_id, int size_of_finalmatrix){
		this.column_id = column_id;
		this.row_id = row_id;
		this.a= matrix1;
		this.b= matrix2;
		this.size = size_of_finalmatrix;
		this.c= final_matrix;
	}


	public void run(){
        for(int i = 0; i< size; i++){
			c[row_id][column_id]=a[row_id][i]*b[i][column_id]+c[row_id][column_id];
        }           
    }


    public static int [][] multiply(int [][] a, int [][] b) {

	/* check if multipication can be done, if not 
	 * return null 
	 * allocate required memory 
	 * return a * b
	 */

	int x = a.length; 
	int y = b[0].length; 

	int z1 = a[0].length; 
	int z2 = b.length; 

	//Check for the row and column size compatibility for matrix multiplication
	if(z1 != z2) { 
	    System.out.println("Cannnot multiply");
	    return null;
	}

	//Declaring the resulting matrix
	int [][] c = new int [x][y];

	// Create 2D array of threads
	Matrix[][] thread= new Matrix[x][y];

	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){
			//Create new thread by using constructor
			thread[i][j]=new Matrix(c,a,b,i,j,z1);
			//Start the threads. i.e. Implement the run function.
			thread[i][j].start();
		}
    }

    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            try{
				//Make main thread wait for the other threads to finish their work.
                thread[i][j].join();
            }
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }

	return c; 
    }
}


/*

//Questions and Answers


1. How to use threads to parallelize the operation?
        Each element of the Matrix C will be operating in parallel operation.
        3 threads can be used in order to implement matrix multiplication in parallel.

2. How many threads to use?
		Use a 2d array to do store and manipulate operations of threads.
		Each element of final_matrix array will be calculated in each of thread 2d array.


3. How to allocate work for each thread (recall it is the run function which all the threads
     execute)?
     	For every thread, there is a run function. That run function tells the threads what task to do.
     	For loop will allocate work for each thread.

4. How to synchronize?
		Synchronization is not needed for this implementation because there wasn't any race conditiom where variables were written over
		again by the threads in memory. The output matrix was created from all threads resulting each elements being ediited in the matrix.
		Therefore, the block was not needed to be synchronized.


*/