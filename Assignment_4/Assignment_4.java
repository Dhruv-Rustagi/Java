package Assignment_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

/*

Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.

Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.

For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.

Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

Given the signup date and the current date, provide the allowable date range for the form date.

Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.

Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy

Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

Test output:
16-06-2017 27-06-2017
05-01-2017 06-03-2017
No range
05-03-2016 04-04-2016
05-03-2016 15-03-2016

*/

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