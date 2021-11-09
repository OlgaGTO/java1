import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("introdu nota elevului");
        int nota = sc.nextInt();*/


        int passengerAge=65;
        double reducere = 0;
        String season="iarna";
        int numarCopii = 1;
        int clasa = 2;
        double taxaGestiune;
        double pretExcursie=30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu varsta pasagerului: ");
        passengerAge =sc.nextInt();

        /*System.out.println("Introdu sezonul in care calatoreste: ");
        season=sc.nextLine();*/

        System.out.println("Introdu numarul de copii care vor calatori: ");
        numarCopii=sc.nextInt();

        System.out.println("Introdu clasa la care se calatoreste: ");
        clasa=sc.nextInt();

        System.out.println("Introdu pretul excursiei: ");
        pretExcursie=sc.nextDouble();


        if (passengerAge >=65){
            reducere =0.15;
            System.out.println("Aveti reducere de pensionari de 15%");
        }
        else if(numarCopii>=1){
            reducere = 0.10;
            System.out.println("Pt ca aveti un copil, aveti 10% reducere");
        }

        if (season=="iarna"){
            reducere = reducere + 0.10;
            System.out.println("Aveti reducere de iarna de 10%");
        }
        if(clasa==1){
            taxaGestiune=0.03;
            System.out.println("Vi se aplica taxa de lux de 3%");

        }
        else{
            taxaGestiune=0.01;
            System.out.println("Vi se aplica o taxa de gestiune de 1%");
        }

        System.out.println("Reducerea este: " + reducere + " adica " + pretExcursie*reducere);
        System.out.println("Taxa de gestiune este: " + pretExcursie + " adica " + pretExcursie*taxaGestiune);


        pretExcursie = pretExcursie - pretExcursie * reducere + pretExcursie * taxaGestiune;

        System.out.println("Pretul total este: " + pretExcursie);




    }
}


