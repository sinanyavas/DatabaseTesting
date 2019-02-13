package Default;

public class StringClass {

    public static void main(String[] args){


        String m = "sinan";
        String s = "";





        for(int i=m.length()-1; i>=0;  i--){

            s = s + m.charAt(i);
        }

        System.out.println(s);

    }



}

