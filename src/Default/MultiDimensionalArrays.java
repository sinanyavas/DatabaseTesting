package Default;

public class MultiDimensionalArrays {


    public static void main(String[] args){

       int  a[][] ={{1,2,3}, {5,2,4}, {4,9,0}};


       for(int i=0; i<a.length; i++){

        for(int j=0; j<3; j++ ){

            System.out.println(a[i][j]);
        }

       }

        System.out.println(a[2][2]);


    }
}
