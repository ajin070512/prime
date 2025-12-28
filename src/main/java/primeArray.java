public class primeArray {
    public int[] prime(int num){
        int[] factors = new int[num+1];
        if(num<=1){
            return factors;
        }
        while(num%2==0){
            num/=2;
            factors[2]++;
        }
        for(int i = 3;i<=num;i+=2){
            while(num%i==0){
                factors[i]++;
                num/=i;
            }
        }
        if(num>1){
            factors[num]++;
        }
        return factors;
    }
}
