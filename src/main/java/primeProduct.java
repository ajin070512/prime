import java.util.Scanner;

public class primeProduct {
    static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num = stdin.nextInt();
        int[] array = new int[num+1];
        primeArray primes = new primeArray();
        array = primes.prime(num);

        String results = "1";
        for(int i = 0;i<array.length;i++){

            if(array[i]>0) {
                System.out.println(i + " " + array[i]);
                for (int j = 0; j < array[i]; j++) {
                   results += "*" + i;
                }
            }
        }
        System.out.println(num + "="+  results);
    }
}
