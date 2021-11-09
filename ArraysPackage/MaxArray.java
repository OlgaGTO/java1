package ArraysPackage;

public class MaxArray {
    public static void main(String[] args) {
        int[] numbers={1,2,3,-3,-2,-1,90};
        int max=0;
        if (numbers.length>0){
            max=numbers[0];
        }
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("Cel mai mare numar din array este: " + max);


    }
}
