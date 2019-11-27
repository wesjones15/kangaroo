package kanga;

public class Kangaroo {
    public static void main(String... args) {
        String out = kangarooMeet(0,3,4,2);
        System.out.println(out);
        out = kangarooMeet(0,3,3,2);
        System.out.println(out);
        out = kangarooMeet(0,4,4,2);
        System.out.println(out);
    }

    public static String kangarooMeet(Integer x1, Integer x2, Integer v1, Integer v2) {
        Boolean passed = false;
        Boolean x1G = (x1 > x2);

        while (!passed) {
            x1 += v1;
            x2 += v2;
            passed = x1G ? (x2 >= x1) : (x1 >= x2);
        }

        return (x1 == x2) ? "yes" : "no";
    }
}
