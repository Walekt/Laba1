import static java.lang.Math.sqrt;

public class Main3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 4;
        System.out.println(a+"x^2 + " + b + "x + " + c + " = 0");
        System.out.println(Yravnnenie(a,b,c));
    }
    public static String Yravnnenie(int a, int b, int c)
    {
        if(b*b-4*a*c<0)
            return "Нет коней";
        else if (b*b-4*a*c==0)
        {
            return ("1 root: x = " + -b/(2*a));
        }
        else
            return ("2 roots: x = " + (-b+sqrt(b*b-4*a*c)/(2*a)) + (-b-sqrt(b*b-4*a*c)/(2*a)));
    }
}