import java.util.Scanner;

class StructuriiAlternative {
    public static void main(String[] args) {
        int ora = 18;
        if (ora<10) {
            System.out.println("Good moring!");
            System.out.println("This statement was executed because condition evaluated is true");
        }
        else if(ora<20){
            System.out.println("Good afternoon!");
            System.out.println("This statement was executed because initial condition is false and secondary condition evaluated is true");
        }
        else{
            System.out.println("Good evening!");
            System.out.println("This statement was executed because both conditions were evaluated as false.");
        }

        System.out.println("------------");
        //exercitiu: Pe baza unor valori de input vrem sa afisam pe ecran urmatoarele mesaje:
        //Daca este baiat(Felicitari, aveti un baiat, cumparat haine albastre)
        //Daca este fata(Felicitari, aveti o fata, cumparat haine roz)

        char gender = 'b';
        gender ='f';
        if (gender=='f'){
            System.out.println("Felicitari, aveti o fata, cumparati haine roz");
            System.out.println("This statement was executed because condition evaluated is true");
        }
        else {
            System.out.println("Felicitari, aveti un baiat, cumparati haine albastre");
            System.out.println("This statement was executed because the first condition was evaluated as false.");
        }
        System.out.println("------------");

        int maleRabbits= 1;
        int femaleRabbits= 1;
        if(maleRabbits>0 && femaleRabbits>0){
            Scanner sc=new Scanner(System.in);
            System.out.println("Do you want to breed? insert 1 for yes and 0 for no?");
            int breed = sc.nextInt();
            if (breed==0){
                System.out.println("Keep male and female rabbits apart!");
            }
            else if(breed==1){
                System.out.println("You can move on,rabbits will breed.");
            }
            else{
                System.out.println("Invalid option. Please try again.Do you want to breed? insert 1 for yes and 0 for no?");
            }

        }



    }
}
