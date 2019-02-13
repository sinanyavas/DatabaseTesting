package Default;

public class MaximumNumberArrays {


    public static void main(String[] args){

        int  a[][] ={{1,2,3}, {5,0,4}, {4,9,2}};
        int min = a[0][0];
        int mincoulumn = 0;

        for(int i=0; i<a.length; i++){

            for(int j=0; j<3; j++ ){

                if (a[i][j]<min){

                    min=a[i][j];
                    System.out.println(min);
                    mincoulumn=j;
                    System.out.println(mincoulumn);


                }

                //System.out.println(a[i][j]);
            }

        }

        int max = a[0][mincoulumn];
        int k=0;
        while (k<3) {

            if(a[k][mincoulumn] > max) {

                max = a[k][mincoulumn];
            }

            k++;
        }

        System.out.println(max);
    }

}
