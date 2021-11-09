public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 5;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 5);

        System.out.println("---------------------");

        while (a < 5) {
            System.out.println(a);
            a++;
        }

        System.out.println("---------------------");
        int i = 3;
        do {
            System.out.println("i = "+ i);
            System.out.println("a = " + a);
            a = a/i;
            i--;
        }
        while (i>0);




    }
}
