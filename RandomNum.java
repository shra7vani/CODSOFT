import java.util.*;
public class RandomNum{
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 Random random=new Random();
 int a=random.nextInt(100),b=1,c=0; // b= number of attempts ,c=incorrect guesses
 System.out.println("WELCOME TO THE NUMBER GAME \n ENJOY THE GAME");
 
 while(b<=5){
    System.out.println("Enter the number:");
    int x=sc.nextInt();
    if(x>a){
        System.out.println("To HIGH !! Choose the small one");
        c++;
    }
    else if(x<a){
        System.out.println("To LOW !! Choose the large one");
        c++;
    }
    else{
        System.out.println("******That's the right answer*****");
        break;
    }
    b++; 
 }
 int f=5-c; // calculate & store score
 if(c==5){
    System.out.println("You lose the game \n TRY AGAIN \n Better luck next time");
 }
 else{
    System.out.println("YEHHHHHHH!! You are game Cracker !!\n You WON this game ");
    System.out.println("Your Score is "+f+"/5");
        }
        System.out.println("The Random Number is "+ a);
        sc.close();
 }
 }
