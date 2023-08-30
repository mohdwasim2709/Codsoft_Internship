import java.util.*;
public class task1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int score=0;
            int round=0;
            int choice;
            
            do {
                int limit=0;
                System.out.print("Enter start range: ");
                int min=sc.nextInt();
                System.out.println();
                System.out.print("Enter end range: ");
                int max=sc.nextInt();
                System.out.println();
                
                while(true && limit<10){
                    limit+=1;

                    Random r = new Random();
                    int randomNumber = r.nextInt((max - min) + 1) + min;
                    System.out.print("Enter your guess : ");
                    int guess=sc.nextInt();
                    System.out.println();
                    System.out.println("Random number is : "+randomNumber);

                    if(randomNumber>guess){
                        if ((randomNumber-guess)>10) {
                            System.out.println("Your guess is too low.");
                        }
                        break;
                    }
                    else if(guess>randomNumber) {
                        if ((guess-randomNumber)>10) {
                            System.out.println("Your guess is too high");
                        }
                        break;
                    }
                    else if(randomNumber==guess) {
                        System.out.println("You are correct");
                        score+=1;
                        continue;
                    }
                }
                round+=limit;
                System.out.print("Enter 1 to continue and 0 to end the game : ");
                choice=sc.nextInt();
                while(choice!=0 && choice!=1){ 
                    System.out.println("Invalid Choice");
                    System.out.print("Enter 1 to continue and 0 to end the game : ");
                    choice=sc.nextInt();
                }
                System.out.println();
            }while (choice==1);
            System.out.println("Your score is : "+score+" out of "+round+" guesses.");
        }
        

    }
}