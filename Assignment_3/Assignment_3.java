package Assignment_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
// Use the system ping utility, do not use any deprecated methods.

public class Assignment_3 {
    public static void main(String[] args) {
        String ip_Address;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter IP Address : ");
        ip_Address = s.nextLine();

        ping("ping " + ip_Address);
    }

    private static void ping(String str) {
        // first try for getting the ping host using exception handling
        try
        {
            Process p = Runtime.getRuntime().exec(str); // it will get the run time when the ip address starts executing
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream())); // it will store the input stream.

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) // printing output
            {
                System.out.println(s);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
