public class Sni5 {
    public static void main(String[] args){
        int a=5;
        int b=10;

        int sum = getSum(0,a,b);
        System.out.println(sum);

    }
    public static int getSum(int sum,int a,int b){
        if (a>b){
        return sum;
    }
    else{
        return a + getSum(sum,a+1,b);
    }
}
}