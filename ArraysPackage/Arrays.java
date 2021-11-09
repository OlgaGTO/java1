package ArraysPackage;

public class Arrays {
    public static void main(String[] args) {
        int[] age = new int[6];
        age[0] = 10;
        age[1] = 11;
        age[2] = 12;
        age[3] = 13;
        age[4] = 14;
        System.out.println(age.length);
        for (int i = 0; i <= age.length-1; i++) {
            System.out.println(age[i]);
        }

    }
}

