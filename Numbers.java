import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        int worldRecord = 223; //World record in seconds.
        int userInput;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How fast can you run a mile? (In seconds)");
        
        userInput = keyboard.nextInt();
        
        if (userInput < worldRecord) {
            System.out.println("Are you sure? That’s a new world record!");
        } else {
            System.out.println("Right on! Keep running!");
        }
    }
}
