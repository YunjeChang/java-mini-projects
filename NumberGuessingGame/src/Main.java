import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber;
        int min = 1;
        int max = 100;

        randomNumber = rd.nextInt(min, max + 1);

        System.out.println("Welcome to Number Guessing Game.");

        do{

            System.out.printf("Please enter the number you guessing between %d to %d here: ", min, max);
            guess = sc.nextInt();
            if(guess < randomNumber){
                System.out.println("Your number is too Low.");
            }
            else if(guess > randomNumber){
                System.out.println("Your number is too High.");
            }
            attempts++;

        }while(guess != randomNumber);

        System.out.printf("You are correct. you entered %d and random number is %d and you tried %d times", guess, randomNumber, attempts );


        sc.close();





    }

}
