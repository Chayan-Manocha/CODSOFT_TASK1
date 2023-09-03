import java.util.*;
import java.util.Random;
class main 
{
    public static void main(String args[])
    {
        char ch='y';
        while (ch=='y')
        {
            Scanner sc=new Scanner(System.in);
            Random random=new Random();
            int num=random.nextInt(100)+1;
            int gn;
            int i;
            int score=0;
            int n=3;
            int attempt=3;
            for(i=0;i<n;i++)
            {
                System.out.println("enter your guess number");
                gn=sc.nextInt();
                if(gn==num)
                {
                    score=attempt*100;
                    break;
                }
                else if(gn>=(num-10)&&gn<=(num+10))
                {
                    System.out.println("You are close to the guess");
                }
                else if(gn>=(num+10))
                {
                    System.out.println("your guess is too large");
                }
                else if(gn<=(num-10))
                {
                    System.out.println("your guess is too less");
                }
                attempt-=1;
            }
            System.out.println("The correct number is "+num);
            if(score==0)
            {
                System.out.println("You guessed wrong answer in all the attempt so you got a score of "+score);
            }
            else
            {
                System.out.println("Your guess was correct and your score is "+score);
            }
            System.out.println("Do you want to play the game again?");
            ch=sc.next().charAt(0);
        }
    }
}