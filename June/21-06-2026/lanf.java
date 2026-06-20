Question 5: Temperature Category  
Write a Java program to classify temperature into categories: 
Conditions: 
● temperature < 10 → "Very Cold" 
● temperature ≥ 10 and < 25 → "Moderate" 
● temperature ≥ 25 → "Hot" 
Example: 
Input: 30 
Output: Hot

  import java.util.*;
public class practicee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature");
        int n = sc.nextInt();
        if(n<10){
            System.out.println("Very Cold");
        } else if (n >= 10 && n <25) {
            System.out.println("Moderate");
            
        }else if(n>=25){
            System.out.println("Hot");
        }else{
            System.out.println("None");
        } 
    }

    }
