import java.util.Scanner;
import java.lang.Math;
public class Random_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String like;
        Menu.menu();
        int computer_number=RandomNumer.randomNumber(0,100);
        do{
            for(int i=5;i>0;i--){
                int guess=GuessNumber.guessNumber();
                if(guess<computer_number){
                    System.out.println("your guess is small ");
                    System.out.println("Remaining GUesses: "+(i-1));
                }
                else if(guess>computer_number){
                    System.out.println("Your guess is High");
                    System.out.println("Remaining GUesses: "+(i-1));
                }
                else if(guess==computer_number){
                    System.out.println("-----------------------");
                    System.out.println("congratulations your guess is correct");
                    System.out.println("Your Score is: "+(10*i));
                    System.out.println("-----------------------");
                    break;
                }
                if(i==1){
                    System.out.println("\nyour Score is 0 \nBetter luck next Time\n");
                }
            }
            System.out.println("Would you like to play again [type: y], if not type[n] :)");
            like=sc.next();
            computer_number=RandomNumer.randomNumber(0, 100);
        }while(like=="n");
        System.out.println("Thank You :)");
    }
}
class RandomNumer{
    static int randomNumber(int min,int max){
        return (int)Math.floor(Math.random() * (100-0+1)+0);
    }
}
class Menu{
    static void menu(){
        System.out.println("You are start guessing numbers between 0 and 1");
        System.out.println("you have only to tries \nAll The Best  :)");
    }
}
class GuessNumber{
    static int guessNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("guess a number");
        int guess_number=sc.nextInt();
        return guess_number;
    } 
}

