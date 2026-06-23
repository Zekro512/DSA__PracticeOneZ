//Number sign check
import java.util.*;
public class Practiceee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Positive Number"+n);
        } else if(n<0){
            System.out.println("Negative number"+n);
        } else{
            System.out.println("neutral"+n);
        }

    }
}*/
//Day of Week (switch)
import java.util.*;
public class Practiceee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case(1):
            System.out.println("Monday");
            break;
            case(2):
            System.out.println("Tuesday");
            break;
            case(3):
            System.out.println("Wednesday");
            break;
            case(4):
            System.out.println("Thursday");
            break;
            case(5):
            System.out.println("Friday");
            break;
            case(6):
            System.out.println("Saturday");
            break;
            case(7):
            System.out.println("Sunday");
            break;
            default:;
            System.out.println("Invalid");
            break;
            
        }
    }
}
