/*
 * This project is made for my Home Assignments in my Java Course.
 */
package javahomeworksdragomircatalina;

/**
 *
 * @author Katutza
 */
import java.util.Scanner;
        
public class JavaHomeworksDragomirCatalina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Creating a new Scanner named input
        System.out.print("Enter your name: ");// Prompting the user for the name
        String name = input.nextLine();// The crated Scanner reads the line of text from the user
        System.out.println("Your name is: " + name);// Outputing the input from the user
        
        
   int cat = Integer.parseInt("12", 10); // declaring the int by parsing the string argument
   System.out.println(cat);
   
   int mouse = Integer.parseInt("1010110", 2);// declaring the int by parsing the string argument
   System.out.println(mouse);
   
   int dog = Integer.parseInt("54", 10);// declaring the int by parsing the string argument
   System.out.println(dog);
   
   int parot = Integer.parseInt ("1101100", 2);// declaring the int by parsing the string argument
   System.out.println(parot);
   
   int pets = parot / cat + dog * mouse; // using the arithmetic operators
   System.out.println("Value after calculating = " + pets);
   
   int result = pets % 4; // declaring a new int that will be used later
   System.out.println(result);
   
   boolean condition = true;
   result = condition ? 1 : 3;
   
   result++; 
   System.out.println(-result); // result is - 2
   System.out.println(result++); // result is 2; value returned first then incremented
   System.out.println(++result); // result is 4
   
   boolean success = true;
   if((pets == 4653) && (cat > 11)){ // both conditions must be met
   System.out.println(success);} 
   else{
   System.out.println(!success);}
   
   if((pets < 4653) || (cat != 11)){ // one of the conditions must be met
   System.out.println(success);} 
   else{
   System.out.println(!success);}
   
   JavaHomeworksDragomirCatalina instance = new JavaHomeworksDragomirCatalina(); //declaring a new obj in the public class 
   System.out.println(instance instanceof JavaHomeworksDragomirCatalina); // true if the obj declared is an instance of the class
   }
}