import org.junit.Test;

import static org.junit.Assert.*;


public class VectorHelperTest {

    @Test
    public void somme() throws LengthException {
        int vector2[]={1,2,3,4} ;
        int vector3[] ={1,1,1,1} ;
        int vectorExpecSom []= {2,3,4,5};
        int  TestSom [] = VectorHelper.Somme(vector2,vector3);

        assertArrayEquals(vectorExpecSom,TestSom);

    }
    @Test
    public void sommeException()  {
        int vector2[]={1,2,3,4} ;
        int vector3[] ={1,1,1,1,2} ;
        int vectorExpecSom []= {2,3,4,5};
        VectorHelper VectorHelper = new VectorHelper ();
        try{
        int  TestSom [] = VectorHelper.Somme(vector2,vector3);

        assertArrayEquals(vectorExpecSom,TestSom);}
        catch (LengthException e) {
            System.out.println( "Exception tailles differentes des vecteurs ");
        }

    }

    @Test
    public void minMax()  {
        int vector5[]={1,2,3,4,5} ;
        int vectorExpecMinMax []= {1,5};
        int  TestMinMax [] = VectorHelper.MinMax(vector5);
        assertArrayEquals(vectorExpecMinMax,TestMinMax);


    }


}