import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args){
        String[] choices={"rock","paper","scissors"};
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to This Game!");
        while(true){
            System.out.print("Enter your choice(rock,paper or scissors):");
            String userChoice=scanner.nextLine().toLowerCase();

            if (!isValidChoice(userChoice)){
                System.out.println("Invalid Choice,Please try again");
                continue;
            }
            int computerIndex=random.nextInt(3);
            String computerChoice=choices[computerIndex];

            System.out.println(" Computer Choise:"+computerChoice);
            int result=getGameResult(userChoice,computerChoice);

            if(result==0){
                System.out.println("OH it's a tie!");
            }else if(result==1){
                System.out.println("Congratulations!You Win!!");
            }else{
                System.out.println("Sorry! You lose!");
            }
            System.out.print("Do you want to play Again?(yes/no)");
            String playAgain=scanner.nextLine().toLowerCase();
            
            if(!playAgain.equals("yes")){
                break;
            }
        }
        System.out.println( "ThankYou for playing.");
        scanner.close();
        }
        private static boolean  isValidChoice(String choice){
            return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
        }
        private static int getGameResult(String userChoice,String computerChoice){
            if(userChoice.equals(computerChoice)){
                return 0;//tie
            }else if(
                (userChoice.equals("rock")&& computerChoice.equals("scissors")) ||(userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissors")&&computerChoice.equals("paper"))
            ){
                return 1;//user wins
            }else{
                return -1;
            }

        }
    }
