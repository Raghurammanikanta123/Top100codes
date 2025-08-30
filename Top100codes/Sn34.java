public class Sn34 {
    public static void main(String[] args){
        int n=5;
        int sum = getSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static int getSum(int n){
        if (n==0){
            return 0;
        }
        return n+getSum(n-1);
    }
}