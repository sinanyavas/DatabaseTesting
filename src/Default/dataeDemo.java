package Default;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dataeDemo {


    public static void main(String[] args){

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
        SimpleDateFormat sd=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");


        //sdf.format(d);

        System.out.println(sdf.format(d));

        System.out.println(sd.format(d));

        System.out.println(d.toString());


    }
}
