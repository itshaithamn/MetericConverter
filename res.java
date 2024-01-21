import java.util.Scanner;

class third {

    static Scanner asd = new Scanner(System.in);

    public static void main(String[] args){
    int day1 = getInt();
        while (day1 != -1){
            res(day1);
        }
    }

    public static int getInt(){
        System.out.println("Enter number of day of week"); 
        int day;
        if(asd.hasNextInt()){
            day = asd.nextInt();
        } else {
            System.out.println("Error");
            asd.next();
            day = getInt();
        }
        return day;
    }

    public static void res(int day1){
         switch(day1){
             case 1:
                  System.out.println("Monday");
             break;
             case 2:
                  System.out.println("Tuesday");
             break;
             case 3:
                  System.out.println("Wednesday");
             break;
             case 4:
                  System.out.println("Thursday");
             break;
             case 5:
                  System.out.println("Friday");
             break;
             case 6:
                  System.out.println("Saturday");
             break;
             case 7:
                  System.out.println("Sunday");
             break;
        }
    }
}