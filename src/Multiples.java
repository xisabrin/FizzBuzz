public class Multiples {
    public static void main(String[] args) {

        int multiplesBelow1000 = 0;

        for(int num = 0; num < 1000; num++) {

            if(num % 3 == 0 || num % 5 == 0) {
                multiplesBelow1000++;
            }
        }

        System.out.println(multiplesBelow1000);

    }
}
