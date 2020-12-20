package pkgclass.exception;

public class CheckValidity {
    
    boolean isDayValid(int day, int month,int year){
        boolean leapyear = false;
        if(isMonthValid(month)){
            if(year%4==0)
                leapyear = true;

            if(1 <= day && day <= 31){
                if(month == 02 && leapyear && 29 < day)
                    return false;
                else if(month == 02 && !leapyear && 28 < day)
                    return false;
                else if((month == 4 ||month == 6 ||month == 9 ||month == 11) && 30 < day)
                    return false;
                else
                    return true;
            }   
        }
        return false;
    }
    
    boolean isMonthValid(int month){
            if(1 <= month && month <= 12)
                return true;
            else return false;
    }
    
    public boolean isYearValid(int year){
            if(1920 <= year && year <= 2020)
                return true;
            else return false;
    }
}
