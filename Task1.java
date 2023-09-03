import java.util.*;
import java.util.Random;//these are the import packages//
class main //In java we need to write a code in the main class to tell that our codes starts from this space//
{
    public static void main(String args[])
    {
        char ch='y';//I have declared a character so that if a person wants to restart the game he or she can do so (y here is yes)//
        while (ch=='y')
        {
            Scanner sc=new Scanner(System.in);
            Random random=new Random();
            int num=random.nextInt(100)+1;//this line will select a random number between 0 to 100//
            int gn;
            int i;
            int score=0;
            int n=3;
            int attempt=3;//gn, i, score, n, attempts are variables of integer types//
            for(i=0;i<n;i++)
            {
                System.out.println("enter your guess number");
                gn=sc.nextInt();
                if(gn==num)//this if condition is for the situation that a person guesses the exact same number which the computer has listed//
                {
                    score=attempt*100;//that person will be awarded 100 points//
                    break;
                }
                else if(gn>=(num-10)&&gn<=(num+10))//this if condition is for the situation if the person is close to the number listed by the system//
                {
                    System.out.println("You are close to the guess");//A message will be displayed that you are close to the guess//
                }
                else if(gn>=(num+10))//this if condition is for the situation if the person is not too close to the number listed by the system//
                {
                    System.out.println("your guess is too large");//A message will be displayed that your guess is too large//
                }
                else if(gn<=(num-10))//this if condition is for the situation if the person is not too close to the number listed by the system//
                {
                    System.out.println("your guess is too little");//A message will be displayed that your guess is too little//
                }
                attempt-=1;
            }
            System.out.println("The correct number is "+num);//This line will show the random number which the system has selected//
            if(score==0)
            {
                System.out.println("You guessed the wrong answer in all the attempts so you got a score of "+score);//this line will show you that you have chosen the wrong number//
            }
            else
            {
                System.out.println("Your guess was correct and your score is "+score);//this line will show you your score//
            }
            System.out.println("Do you want to play the game again?");//this line if answered with 'y' will restart the game else will stop the code//
            ch=sc.next().charAt(0);
        }
    }
}
