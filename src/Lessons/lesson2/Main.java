package Lessons.lesson2;


public class Main {


    public static void main(String[] args) {
        int k = 10;
        System.out.println(k);

        int m;
        m = 2 + 7;
        System.out.println(m);

        int l = 2;
        // l = l + 2;
        l += 2;
        System.out.println(l);

        int n = 2;
        n++;
        System.out.println(n);

        int g = 2;
        g--;
        System.out.println(g);

        System.out.println("-----------");
        int t = 2;
        int r = 2;
        int a = 2 * t++;
        int b = 2 * ++r;
        System.out.println(a);
        System.out.println(t);
        System.out.println(b);
        System.out.println(r);
    }

    public void newMethod() {
        System.out.println("Privet Tania");
    }
}
