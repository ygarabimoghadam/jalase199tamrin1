import java.util.Scanner;

public class Priime {

    public Priime(){}

    public int gcd(int a,int b){
        int i = 0 ;
        while(b!=0){
            i=a;
            a=b;
            b=i%b;
        }
        return a;
    }

    public boolean areprime(int a, int b){
        return gcd(a,b) == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();
        Priime p = new Priime();
        boolean javab = p.areprime(aa,bb);
        System.out.println(javab);
    }
}

