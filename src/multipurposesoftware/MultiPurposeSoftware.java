/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipurposesoftware;
import java.io.*;
import java.util.*;


class Software {
        Scanner input = new Scanner(System.in);
        int i;
        double c, f, inr, usd, fah, cel;
        char choice;
        
        public Software() {         // Default Constructor
            i = 0;c = 0;f = 0;
            inr = 0;usd = 0;
            fah = 0;cel = 0;
            choice = '0';
            System.out.println("**WELCOME TO ALL TYPES OF CONVERTER*");
        }
        
        //**TEMPERATURE CONVERTER**//
        public void temperature(char choice) {
            char temp;
            
            if(choice == 'c' || choice == 'f') {
                temp = choice;
                switch (temp) {
                            case 'c' :   System.out.print("Enter Temperature: ");
                                        cel = input.nextDouble();
                                        System.out.println("Celsius to Fahranheit: "+cel+" to "+(cel*9/5)+32);
                                        nextChoice('a',temp);
                                        break;

                            case 'f':   System.out.print("Enter Fahranheit temperture:  ");
                                        fah = input.nextDouble();
                                        System.out.println("Fahrenheit to Celsius: "+fah+" to "+(fah-32)*5/9);
                                        nextChoice('a',temp);
                                        break;

                            default:    break;
                }
            }
            else {
                System.out.print("Enter Temperature in (Celcius - c, Fahrenheit - f): ");
                temp = input.next().charAt(0);
                temperature(temp);
            }   
        }
        
        //**CALCULATOR*//
        public void calculator(char choice) {
            int a,b;
            char cal;
            
            if(choice == '+' || choice == '-' || choice == '/' || choice == '*') {
                cal = choice;
                switch(cal) {
                            case '+':   System.out.print("Enter two number(with space):  ");
                                        a = input.nextInt();
                                        b = input.nextInt();
                                        System.out.println("The Addition of the given number is: "+a+" + "+b+" = "+(a+b));
                                        nextChoice('b',cal);
                                        break;

                            case'-':    System.out.print("Enter two number(with space):  ");
                                        a = input.nextInt();
                                        b = input.nextInt();
                                        System.out.println("The Substraction of the given number is: "+a+" - "+b+" = "+(a-b));
                                        nextChoice('b',cal);
                                        break;

                            case'/':    System.out.print("Enter two number(with space):  ");
                                        a = input.nextInt();
                                        b = input.nextInt();
                                        System.out.println("The Division of the given is: "+a+" / "+b+" = "+(a/b));
                                        nextChoice('b',cal);
                                        break;

                            case'*':    System.out.print("Enter two number(with space):  ");
                                        a = input.nextInt();
                                        b = input.nextInt();
                                        System.out.println("The Multiplication of the given number is: "+a+" * "+b+" = "+(a*b));
                                        nextChoice('b',cal);
                                        break;

                            default:    break;
                }
            }
            else {
                System.out.print("Enter an operator: ");
                cal = input.next().charAt(0);
                calculator(cal);
            }
        }
        
        //**CURRENCY CONVERTER**//
        public void currency(char choice) {
            char temp;
            
            if(choice == 'i' || choice == 'u') {
                    temp = choice;
                    switch (temp) {
                                case 'i':   System.out.print("Enter rupees: ");
                                            inr = input.nextDouble();
                                            System.out.println("Rupee to USD: "+inr+" to "+(inr*0.014));
                                            nextChoice('c',temp);
                                            break;

                                case 'u':   System.out.print("Enter USD: ");
                                            usd = input.nextDouble();
                                            System.out.println("USD to Rupee: "+usd+" to "+(usd*73.14));
                                            nextChoice('c',temp);
                                            break;

                                default:    break;
                    }
            }
            else {
                System.out.print("Enter Currency type(INR - i, USD - u): ");
                temp = input.next().charAt(0);
                currency(temp);
            }
        }
        
        //**MENU**//
        public void menu(int option) {
            
            System.out.println("1) Calculator");
            System.out.println("2) Temperature");
            System.out.println("3) Currency");
            System.out.println("4) Exit");
            System.out.print("Enter here:  ");
            option = input.nextInt();

            switch (option) {
                            case 1:   System.out.println("");
                                      calculator(choice);
                                      System.out.println("");
                                      break;
                            case 2:   System.out.println("");
                                      temperature(choice);
                                      System.out.println("");
                                      break;
                            case 3:   System.out.println("");
                                      currency(choice);
                                      System.out.println("");
                                      break;
                            case 4:   System.out.println("");
                                      System.out.println("Thanks for using. See you next time!");
                                      break;
                            default:  System.out.println("");
                                      System.out.println("Invalid option Try again!");
                                      System.out.println("");
                                      menu(1);
                                      break;
            }
        }
        
        //**NEXT CHOICE**//
        public void nextChoice(char operation,char temp) {
            char value;
            switch(operation) {
                            case 'a': System.out.print("Do you want to continue(Y/N): ");
                                      value = input.next().charAt(0);
                                      if(value == 'y' || value == 'Y') {
                                          if(temp == 'c' || temp == 'f') {
                                            System.out.print("Same Temperature Unit? (Y/N): ");
                                            choice = input.next().charAt(0);
                                            if(choice == 'y' || choice == 'Y') {
                                                System.out.println("");
                                                temperature(temp);
                                            }
                                            else {
                                                System.out.println("");
                                                temperature('n');
                                            }
                                          }
                                          else {
                                              System.out.println("");
                                              temperature(temp);
                                          }
                                      }
                                      else {
                                          System.out.println("");
                                          menu(1);
                                      }
                                      break;
                                      
                            case 'b': System.out.print("Do you want to continue(Y/N): ");
                                      value = input.next().charAt(0);
                                      if(value == 'y' || value == 'Y') {
                                          if(temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                                            System.out.print("Same Operation? (Y/N): ");
                                            choice = input.next().charAt(0);
                                            if(choice == 'y' || choice == 'Y') {
                                                System.out.println("");
                                                calculator(temp);
                                            }
                                            else {
                                                System.out.println("");
                                                calculator('n');
                                            }
                                          }
                                          else {
                                              System.out.println("");
                                              calculator(temp);
                                          }
                                      }
                                      else {
                                          System.out.println("");
                                          menu(1);
                                      }
                                      break;
                                      
                            case 'c': System.out.print("Do you want to continue(Y/N): ");
                                      value = input.next().charAt(0);
                                      if(value == 'y' || value == 'Y') {
                                          if(temp == 'i' || temp == 'u') {
                                            System.out.print("Same Currency? (Y/N): ");
                                            choice = input.next().charAt(0);
                                            if(choice == 'y' || choice == 'Y') {
                                                System.out.println("");
                                                currency(temp);
                                            }
                                            else {
                                                System.out.println("");
                                                currency('n');
                                            }
                                          }
                                          else {
                                              System.out.println("");
                                              currency(temp);
                                          }
                                      }
                                      else {
                                          System.out.println("");
                                          menu(1);
                                      }
                                      break;
                                      
                            default : break;
            }
            
        }
}



public class MultiPurposeSoftware {

    public static void main(String[] args) {
        Software s = new Software();            // Creating object and calling Default Constructor
        s.menu(1);
    }
    
}
