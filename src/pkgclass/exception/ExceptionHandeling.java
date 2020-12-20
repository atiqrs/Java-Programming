package pkgclass.exception;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ExceptionHandeling {
    public static void main (String arg[]){
        String dateInput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your date with (dd-mm-yyyy) formate: ");
        dateInput = scan.next();
        int day,month,year;
        char a[] = dateInput.toCharArray();
        String devid[] = dateInput.split("-", 3);
        day= parseInt(devid[0]);
        month = parseInt(devid[1]);
        year = parseInt(devid[02]); //Year Limit is 1920 to 2020
        
        try{
            CheckValidity check = new CheckValidity();
            if( check.isYearValid(year) && check.isMonthValid(month) && check.isDayValid(day,month,year)){
                    System.out.println("Your Entered date "+day+"/"+month+"/"+year+" is valid.");
            }   else {
                throw Exception InvelidDate;
            }
        } 
        catch( Exception InvelidDate){ 
            System.out.println("Error! Invalid date: "+day+"-"+month+"-"+year);
        }
    }
}
