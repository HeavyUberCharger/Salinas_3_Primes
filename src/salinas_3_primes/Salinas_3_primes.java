/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salinas_3_primes;

/**
 *
 * @author HUC
 */
public class Salinas_3_primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h = 0;
       for(int i = 0; i < 100;i++) {
           //System.out.println(isEven(i));
          // System.out.println(isOdd(i));
           if(isPrime(i)){
               System.out.println(i + " is prime");
           }    
       }
       //System.out.println( "There are " + h +" even numbers");
       //What is a method?
       //A method is a function
       //it is like a little program that communicates with other parts of the program by returning values eg.
       //like finding a square root, something you might want to do again and agaim
    }
    static boolean isEven(int somenumber){
        //a return value is the type of value youre giving back the the program
       return (somenumber % 2 == 0);
    }
    static boolean isOdd(int number){
        return (number % 2 != 0);
    }
    static boolean isPrime(int number){
        //boolean prime = true;
        int divisors = 0;
        for(int i =2; i <  number; i++){
           if(number % i == 0){
              divisors += 1;
               //prime = false;
           }
        }
           if(divisors > 0){
               return false;
           }else{
               return true;
           }
        }

    }
   
       
    
    

