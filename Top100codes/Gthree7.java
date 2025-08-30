public class Gthree7 {
    public static void main(String[] args){
        int a=5;
        int b=10;
        int c=15;
        String result = (a>b && a>c)? "a is greater than b and c": (b>a && b>c)? "b is greater than a and c":"c is greater than a and b";
        System.out.println(result);
    }
}
    