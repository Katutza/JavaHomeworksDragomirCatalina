/*
 * Implements a computer :)
 */
package calculator;

/**
 *
 * @author Katutza
 */
import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // create first actor
        Egal butonEgal = new Egal();
        
        // initialize the default value
        double answer = 0;
        
        // create second actor
        Anulare butonAC = new Anulare();
        butonAC.erase(answer);
        
        //create third actor
        Plus butonPlus = new Plus();
       
        // create fourth actor
        Minus butonMinus = new Minus();
                
        // create fifth actor
        Inmultit butonInmultit = new Inmultit();
                
        // create sixth actor
        Impartit butonImpartit = new Impartit();
                
        try (Scanner input = new Scanner(System.in)) {
            double number1 = input.nextDouble();
            char operator = input.next().charAt(0);
            double number2 = input.nextDouble();
                                   
        switch (operator) {
            default: System.out.println("Invalid choice!");
            break;
            case '+': answer = butonPlus.aduna(number1, number2);
            break;
            case '-': answer = butonMinus.scade(number1, number2);
            break;
            case '*': answer = butonInmultit.inmulteste(number1, number2);
            break;
            case '/': answer = butonImpartit.imparte(number1, number2);
            break;
            case '=': answer = butonEgal.breakNews(answer);
            break;
         }
            if (number2 == 0) {
        throw new IllegalArgumentException("Argument 'divisor' is 0");
            }        
            System.out.println(answer);
            }
        }
    }

