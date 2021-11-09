public class Variabile {
    public static void main(String[] args) {
        int SpeedLimit = 80; //Asta este o variabila care a fost declarata si initializata in aceeasi instructiune
        int Kilometraj; //Asta este un exemplu de declarare a unei variabile. Declararea inseamna alocarea unui spatiu de memorie identificat de un nume si de un tip de data.
        Kilometraj = 2500; //Asta este un exemplu de initializare a unei variabile, adica de stocare a unei informatii la adresa de memorie numita kilometraj.
                          // O variabila este o adresa de memorie care poate sa isi schimbe continutul.
        System.out.println("Kilometraj");
        System.out.println(Kilometraj);
        Kilometraj = 4500;
        System.out.println(Kilometraj); //Asta este un exemplu de apelare a unei variabile(accesare a continutului sau)
        int age = 45;
        age = 42; // Momentul in care inlocuim valoarea de la o anumita adresa de memorie se numeste suprascriere
    }

}
