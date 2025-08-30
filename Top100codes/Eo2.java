public class Eo2 {
    public static void main( String[] args){
        int n=5;
        if (isEven(n)){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
     public static boolean isEven(int n){
        return !(n & 1);
     }
}