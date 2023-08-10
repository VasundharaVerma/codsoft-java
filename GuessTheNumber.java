import java.io.*;
import java.util.Random;
 class Game{
    int c;
    public int Random(){
        Random  game = new Random();
        c = 1 + game.nextInt(100); 
        return c;
    }  
}
public class GuessTheNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Game g = new Game();
        int b=g.Random();
        int count=0;
            for(int i = 0; i <= 20;i++){
            System.out.println("Enter a number between 1 to 100:");
            int a = Integer.parseInt(br.readLine());
            if(b == a) {
                System.out.println("Hurray!! you guesed it right");
                break;
            }
            else if(b > a){
                System.out.println("The number entered by You is smaller than the Computer's number");
                System.out.println("Try Again");
            }
            else{
                System.out.println("You have entered a larger number than Computer");
                System.out.println("Try Again");
            }
            count = i;
        }
        System.out.println("Yupp the  number was:"+b);
        System.out.println("The total number of attempts you took is: " +count);
    }
}    
