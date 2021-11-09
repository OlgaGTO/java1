
import java.util.Scanner;

public class NumarareVocale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu textul de evaluat: ");
        String textDeNumarat = sc.nextLine();
        System.out.println("Numarul de vocale din textul \"" +textDeNumarat  + "\" este: " + numaraVocale(textDeNumarat.toLowerCase()));
    }
    public static int numaraVocale(String str) {
        int contor = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                contor++;
            }
        }
        return contor;
    }
}

