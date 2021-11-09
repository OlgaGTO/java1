public class Operatori {
    public static void main(String[] args) {
        // OPERATORI ARITMETICI.

        int x = 7;
        int y = 8;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y); // atunci cand se face impartirea intre 2 nr intregi rezultatul va fi un numar intreg trunchiat in cazul care rezultatul este de fapt un nr. cu zecimale.
        System.out.println(y%x); // o operatiune modulo, adica returneaza restul impartirii primului nr. la al doilea nr.
        x++;
        y--; // operator de decrementare.
        ++x; // Aici se face intai incrementarea si apoi alte operatiuni.
        --y; // Aici se face intai decrementarea si apoi alte operatiuni.
        System.out.println("Valoarea lui x este: " + x);
        int z = x++;
        System.out.println("Valoarea lui z este: " + z);
        System.out.println("Valoarea lui x este: " + x);
        z=--x;
        System.out.println("Valoarea lui z este: " + z);
        System.out.println(x + " " + y);
        System.out.println("-----------");

        // OPERATORI DE ASIGNARE.


        x = 10; // operator de schimbare a valorii variabilei.
        System.out.println(x);
        x = x + 3;
        System.out.println(x);
        x += 3; // instructiune identica cu cea de la linia 20.
        System.out.println(x);

        x = x -3;
        System.out.println(x);
        x -= 3;
        System.out.println(x);

        x = x * 3;
        System.out.println(x);
        x *= 3;
        System.out.println(x);

        x = x / 3;
        System.out.println(x);
        x /= 3;
        System.out.println(x);
        System.out.println("-----------");
        x=y;
        // OPERATORI DE COMPARATIE

        if (x==y) {
            System.out.println("Cele 2 variabile sunt egale.");
        }
        else {
            System.out.println("Cele 2 variabile nu sunt egale.");
        }

        System.out.println(x!=5); // != este un operator de comparatie care inseamna not equal to, adica asta inseamna ca se evalueaza daca valoarea variabilei din stanga nu este egala cu valoarea variabilei din dreapta.
        System.out.println(x==y); // == este un operator de comparatie care inseamna equal to, adica asta inseamna ca se evalueaza daca valoarea variabilei din stanga  este egala cu valoarea variabilei din dreapta.
        System.out.println(x==5);
        System.out.println(x>y); // este un operator de comparatie care inseamna mai mare, adica asta inseamna ca se evalueaza daca valoarea variabilei din stanga  este mai mare decat  valoarea variabilei din dreapta.
        System.out.println(x<y); // este un operator de comparatie care inseamna mai mare, adica asta inseamna ca se evalueaza daca valoarea variabilei din stanga  este mai mica decat  valoarea variabilei din dreapta.
        System.out.println(x>=y); // este un operator de comparatie care inseamna mai mare sau egal, adica asta inseamna ca se evalueaza daca valoarea variabilei din stanga  este mai mare sau egala decat  valoarea variabilei din dreapta.
        System.out.println(x<=y); // este un operator de comparatie care inseamna mai mic sau egal, adica asta inseamna ca se evalueaza daca valoarea variabilei din stanga  este mai mica sau egala decat  valoarea variabilei din dreapta.

        //OPERATORI LOGICI.

        System.out.println("-----------");
        int a = 56;
        System.out.println(a<20 || a>40); // || inseamna SAU.
        System.out.println(a<20 || a<40);
        System.out.println(x + " " + y + " " + a);
        System.out.println(x<y || x<a); // valorile alese pentru 100% decision coverage alegem valorile 6,6,56 (pt ramura true) si valorile 58,6,56(pt ramura false)
                                        /* valori alese pt 100% condition coverage: 6,6,56 sau 5,6,4 ( pt ramura de true). Cu asta avem 100% condition coverage
                                            x<y || x>a
                                            A       F -> 5 6 4 ->  5<6(A) || 5<4 (F)
                                            F       A -> 6 6 56 -> 6<6(F) || 6<56(A)

                                                                                */

        System.out.println(!(x<y||x<a)); // ! Operatorul de negatie returneaza opusul boolean al rezultatului evaluarii expresiei logice.

        //VARIANTA MEA
        /* ((x>y) || (x>a)) && y > a
        RAMURA DE TRUE
              A         A       A ->  58 57 56 -> ((58>57)(A) || ( 58>56))(A) && 57>56 (A)
              F         A       A ->  57 57 56 -> ((57>57)(F) || ( 57>56))(A) && 57>56 (A)
              A         F       A ->
        RAMURA DE FALSE
              F         F       F ->  56 56 56 -> ((57>57)(F) || ( 56>56))(F) && 56>56 (F)
              F         F       A ->  55 57 56 -> ((55>57)(F) || ( 55>56))(F) && 57>56 (A)
              A         F       F ->  54 53 56 -> ((54>53)(A) || ( 54>56))(F) && 53>56(F)
              F         A       F ->


         */
        //VARIANTA CORECTA

       /* ((x>y) || (x>a)) && y > a
            x>y -> valori posibile ca si rezultat al evaluarii: A || F.
            x>a -> valori posibile ca si rezultat al evaluarii: A || F || NOT APPLICABLE N/A.
            y>a -> valori posibile ca si rezultat al evaluarii: A || F || NOT APPLICABLE N/A.

          ((x>y) || (x>a)) && y > a
             A   ||  N/A   ||   A  -> Valorile alese pentru acest scenariu sunt: x = 11 , y = 10 , a = 9.
             F   ||   A    ||   F  -> Valorile alese pentru acest scenariu sunt: x = 10 , y = 11 , a = 12.
             F   ||   F    ||  N/A -> Valorile alese pentru acest scenariu sunt: x = 10 , y = 11 , a = 11.

          Cu aceste trei TestCases avem 100% condition coverage.
          A   ||  N/A   ||   A
          Test case 1: ((x>y) || (x>a)) && y > a - Daca un copil este insotit de ambii parinti || are permisiune de la parintele lipsa ) && are pasaport valid

          Test condition: Verifica faptul ca daca un copil este insotit de ambii parinti si are pasaport valid poate sa cumpere bilet.

          Preconditions:
          1. Existenta unui pasaport valabil.

          Steps:
          1. Intra in aplicatia de cumparat bilete.
          2. Apasa pe cumpara bilet.
          3. Completeaza toate campurile necesare inclusiv id-ul de pasaport si datele ambilor parinti.
          4. Bifeaza faptul ca minorul calatoreste cu ambii parinti.
          5. Verifica faptul ca se poate cumpara bilet.

          Expected results:
          Persoana in cauza trebuie sa poata sa cumpere bilet.

          F   ||   A    ||   F
          Test case 2:
          Test condition: Verifica faptul ca minorul care calatoreste cu minim un parinte si are permisiune de la parintele lipsa si nu are pasaport valid nu poate calatori.

          Preconditions:
          1. Existenta unui pasaport expirat/banat/inexistent/invalid.

          Steps:
          1. Intra in aplicatia de cumparat bilete.
          2. Apasa pe cumpara bilet.
          3. Completeaza toate campurile necesare inclusiv id-ul de pasaport si datele parintelui insotitor.
          4. Bifeaza faptul ca minorul calatoreste cu un singur parinte.
          5. Verifica faptul ca se poate cumpara bilet.

          Expected results:
          Persoana in cauza nu trebuie sa poata sa cumpere bilet.
              */


    }
}
    
