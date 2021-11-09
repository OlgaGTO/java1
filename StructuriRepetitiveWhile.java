import java.util.Scanner;

public class StructuriRepetitiveWhile {
    public static void main(String[] args) {
        int a = 0;
        char character = 'a';
        while (a < 5) {
            System.out.println("Valoarea curenta a lui a este:" + a);
            a++;
        }
        /*while (a<5){
            System.out.println("Valoarea curenta a lui a este:" + a );
            a--;
        }*/

        while (character <= 'z') {
            System.out.println("Valoarea curenta a lui character este: " + character);
            character++;
        }
        System.out.println("-----------");


        int maleRabbits = 1;
        int femaleRabbits = 1;
        if (maleRabbits > 0 && femaleRabbits > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to breed? insert 1 for yes and 0 for no?");
            int breed = sc.nextInt();
            while (breed != 1 && breed != 0) {
                System.out.println(breed);
                System.out.println("Invalid option. Please try again.Do you want to breed? insert 1 for yes and 0 for no?");
                breed = sc.nextInt();
                System.out.println(breed);
            }
            if (breed == 0) {
                System.out.println("Keep male and female rabbits apart!");
            }
            else if (breed == 1) {
                System.out.println("You can move on,rabbits will breed.");

            }
        }

    }
}
