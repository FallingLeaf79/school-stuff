public class DayOfYear {
    public static boolean isLeap(int year) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                    return true;
                    }
                    else {
                    return false;
                    }
                }
                else{
                    return true;
                } 
            }
            else {
            return false;
            }
        }
        
    public static int lengthOfMonth(int month, boolean leap) {
        if ((month == 1) || 
            (month == 3) ||
            (month == 5) ||
            (month == 7) ||
            (month == 8) ||
            (month == 10) ||
            (month == 12)) {
                return 31;    
        }
        else if ((month == 4) || 
                (month == 6) ||
                (month == 9) ||
                (month == 11)) {
                return 30;    
            }
          else if (month == 2) {
              if (leap) {
              return 29;
              }
              else {
              return 28;
              }                  
          }
          else return 0; 
    }
    
    public static void main (String[] args) {
        int year = Integer.parseInt(args[0]);   
        int month = Integer.parseInt(args[1]); 
        //int day = Integer.parseInt(args[2]);
         
       
        int length = lengthOfMonth(month, isLeap(year));
        System.out.printf("Tento mesic ma %d dnu. ", length);
       
        if (isLeap(year)) {
            System.out.println("Rok je prestupny.");
        }
        else {
        System.out.println("Rok neni prestupny.");
        } 
    }
}