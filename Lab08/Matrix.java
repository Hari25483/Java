
public class Matrix extends Thread { 

    private static int [][] a; 
    private static int [][] b; 
    private static int [][] c; 

	/* You might need other variables as well */
	private int row_id,column_index;
    private int size;


    public Matrix(int [][] a1, int  [][] b1) { // need to change this, might need some information 
		a = a1;
		b = b1;
	}

	public Matrix ( int [][] final_matrix,int [][] matrix1, int  [][] matrix2,int rowIndex, int colIndex, int size_of_finalmatrix){
		this.a= matrix1;
		this.b= matrix2;
		this.c= final_matrix;
		this.row_id = rowIndex;
		this.column_index= colIndex;
		this.size = size_of_finalmatrix;
	}


	public void run(){
        for(int i = 0; i< size; i++){
			c[row_id][column_index]=c[row_id][column_index]+ a[row_id][i]*b[i][column_index];
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

	if(z1 != z2) { 
	    System.out.println("Cannnot multiply");
	    return null;
	}

	int [][] c = new int [x][y]; 		//allocate required memory for c

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

/// Answers For Questions


1. How to use threads to parallelize the operation?
        Each element of the Matrix C will be operating in parallel operation.
        3 threads can be used in order to implement matrix multiplication in parallel.

2. How may threads to use?
		assign a 2d array to do store thread operations.
		Each element of C array will be operated in each of Thread 2d array.

3. How to allocate work for each thread (recall it is the run function which all the threads
     execute)?
     	For every thread, there is a run function. That run function tells the threads what task to do.
     	For loop will allocate work for each thread.

4. How to synchronize?
    	By using thread.join(), synchronization happens. It waits for thread till finish the work.

*/