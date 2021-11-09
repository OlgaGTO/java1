public class DataTypes {
    public static void main(String[] args) {
        // tipuri de date non-primitive.
        int speedlimit = 0; // Acesta nu este un tip de data non-primitiv, dar avem nevoie de el pt linia 7.
        String hello = "mmmm";
        System.out.println(speedlimit + " " + hello);
        String nume = "Cutarescu";
        String prenume = "Necunoscuteanu";
        int varsta = 25;
        System.out.println("Buna " + nume + " " +  prenume + " ai" +" " + varsta + " ani" ); // Pentru a putea sa concatenam 2 stringuri putem sa folosim '+'.

        System.out.println(prenume.toLowerCase()); //Transforma tot textul in litere mici.
        System.out.println(prenume.toUpperCase()); //Transforma tot textul in litere mari.
        //prenume="";
        System.out.println(prenume.isEmpty());
        System.out.println(prenume.length());

        int viteza = 0; // int este un tip de data non-primitiv care stocheaza doar numere intregi,care poate sa stocheze valori de dimensiuni de max. 4B.
        final double PI = 3.14; // este un tip de data stocat pe 8 bytes si care poate sa stocheze pana la 15 zecimale
        System.out.println(PI);

        float pi = 3.14f; // este un tip de data stocat pe 4 bytes si care poate sa stocheze pana la 6/7 zecimale .
        System.out.println(pi);

        long variabilaLunga = 1234567891544864258L; // este un tip de data stocat pe 8 bytes care permite pastrarea unui numar de pana la 19 cifre.
                                                    // Are nevoie de indicatorul 'L' la final pt a marca nr. ca fiind long.
        System.out.println(variabilaLunga);

        boolean isEmpty = false; // este un tip de data primitiv stocat pe un bit care permite doar 2 valori ( true/false).
                                 // in cazul de la linia 29 isEmpty este numele variabilei si false este valoarea cu care a fost initializata variabila.
        char unCaracter = 'b'; // este un tip de data stocat pe 2 bytes si care permite maxim un caracter plasat intre apostroafe.
        System.out.println(unCaracter);

        // TYPE CASTING  -> este folosit pt a transforma valoarea dintr-o variabila intr-o valoare de un alt tip.

        int year = 2022;
        float newYear = 2021;
        System.out.println(newYear);
        newYear = year;
        System.out.println(newYear);

        double birthYear = 1994.56;
        System.out.println(birthYear);
        int newBirthYear=0;
        newBirthYear = (int) birthYear;
        System.out.println(newBirthYear);


    }
}
