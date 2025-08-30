public class Prime9{
    public static void main(String[] args){
        int n=4;
        String result = (isPrime(n))? "Prime Number":"Not a Prime Number";
        System.out.println(result);
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;

            }
        }
            return true;
        }
    }

