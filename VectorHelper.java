import java.util.Scanner;


/**
 * VectorHelper class uses for operations on a vector
 */

public  class VectorHelper {
    /**
     * This is a constructor to initialize VectorHelper object.
     */

    public VectorHelper() {
        // TODO Auto-generated constructor stub
    }
    /**
     *Addition of two vectors
     * @param vector1 
     * @param vector2
     * @return a vector of integers as an addition of the two vectors vector1 and vector2
     * @throws LengthException in case vectors lengths are different 
     */
    public static int [] Somme (int vector1[],int vector2[] ) throws LengthException{
        int i  ;

        if (vector1.length != vector2.length) throw new LengthException() ;
        /**
         * Vector3 is generated from the addition of vector1 with vector2
         * i index to browse vectors
         */
        int vector3 [] = new int [vector1.length] ;
        for (i = 0 ; i < vector1.length ; i++ ){
            vector3[i] =vector1[i]+ vector2[i] ;
        }
        return(vector3);

    }

    /**
     * To extract the min and max of a vector in a vector of two cases.
     * @param vector to extract min and max from
     * @return a Vector of two cases , the lest one represents min and the right one is max
     */
    public static int[] MinMax (int vector[]){
        /**
         * min is minimum value of a vector
         * max is maximum value of a vector
         * i index to browse a vector
         */
         int min = vector[0] ;
        int max = vector[0] ;
        int i;
        for (i=1;i<vector.length;i++){
            if(vector[i]<min){
                min=vector[i];

            }
            else if (vector[i]>max){
                max=vector[i];
            }
        }
        
     int [] vecteur={min,max};
        return (vecteur);

    }



}
