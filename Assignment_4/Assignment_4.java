package Assignment_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;


public class Assignment_4 {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public void validation(String dates) {
        String d1 = dates.trim().split(" ")[0];
        String d2 = dates.trim().split(" ")[1];

        Calendar signupDate = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();
        try {
            signupDate.setTime(sdf.parse(d1));
            currentDate.setTime(sdf.parse(d2));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Invalid inputs");
        }
        findRange(signupDate, currentDate);

    }

    private void findRange(Calendar signupDate, Calendar currentDate) {
        Calendar anniversary = Calendar.getInstance(); //creating Calendar object references for the 3 dates
        Calendar StartDate = Calendar.getInstance();
        Calendar EndDate = Calendar.getInstance();

        anniversary.setTime(signupDate.getTime()); //set anniversary date as 1 year after sign up date
        anniversary.add(Calendar.YEAR, 1);
        anniversary.add(Calendar.DATE, -30);

        // System.out.println("Anniversary : "+sdf.format(anniversary.getTime()));

        if (currentDate.before(anniversary)) {
            System.out.println("No range");
        }

        int currentYEAR = currentDate.get(Calendar.YEAR);
        signupDate.set(Calendar.YEAR, currentYEAR);


        StartDate.setTime(signupDate.getTime());
        StartDate.add(Calendar.DATE, -30);


        EndDate.setTime(signupDate.getTime());
        EndDate.add(Calendar.DATE, 30);


        if (EndDate.after(currentDate)) {
            EndDate = currentDate;
        }


        System.out.println(sdf.format(StartDate.getTime()) + " " + sdf.format(EndDate.getTime()));

    }

}

class Validation {
    public static void main(String[] args) {
        Assignment_4 obj = new Assignment_4();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of dates : ");
        int n = sc.nextInt();

        System.out.println("Enter the dates");
        sc.nextLine();
        while (n > 0) {
            String dates = sc.nextLine();
            obj.validation(dates);
            n--;
        }
    }
}