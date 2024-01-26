import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Animal animal;
        Scanner kb = new Scanner(System.in);
        System.out.println("What animal should make a noise? Canine (0) or Bird(1)?");
        String choice = kb.nextInt();
        if(choice == 0)
        {
            animal = new Canine();
        }
        if(choice == 1)
        {
            animal = new Bird();
        }
        
        animal.makeNoise();


    }

