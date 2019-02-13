package Default;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args){
        Calendar cder = Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
        System.out.println(sdf.format(cder.getTime()));
        System.out.println(cder.get(Calendar.DAY_OF_WEEK));




    }


}



