package basicjava;

/**
 * Created by Chenxin and Ethan on 9/6/19.
 */
public class BasicStuff {

    public static void main (String[] args) {
        double age0 = 19;

        double age1 = 19;

        System.out.println("We are " + age0 + " and " + age1 + " years old!" );

        double sumOfAges = age0 + age1;

        System.out.println("The sum of our ages is " + sumOfAges + "!");

        System.out.println("The sum of our ages is " + (age0 + age1) + "!");

        System.out.println(6/3);

        System.out.println(6.0/4.0);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MIN_VALUE - 1);

        double hour = 1600.0;

        double day = hour/24;

        double week = day/7;

        System.out.println(hour);

        System.out.println(day);

        System.out.println(week);

        double h = 5, r = 2, V, A;

        V = 1.0/3.0 * Math.PI * r * r * h;

        A = Math.PI * r * r + Math.PI * r * (Math.pow(h * h + r * r, 0.5));

        System.out.println(V);

        System.out.println(A);

    }
}
