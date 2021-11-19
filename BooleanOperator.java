package com.rifai;

public class BooleanOperator {

    public static void main(String[] args) {
        System.out.println("=== Boolean Operator/Logical Operator");
        boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;

        System.out.println("--------- OR(||)");
        a = true;
        b = false;
        q = true;

        c = (a || b);
        i = (b || b);
        r = (a || q);

        System.out.println(a + " || " + b + " = " + c);
        System.out.println(b + " || " + b + " = " + i);
        System.out.println(a + " || " + q + " = " + r);
        System.out.print("\n");

        System.out.println("--------- AND(&&)");
        d = true;
        e = false;
        s = false;
        g = true;

        f = (d && e);
        h = (d && g);
        t = (s && e);

        System.out.println(d + " && " + e + " = " + f);
        System.out.println(d + " && " + g + " = " + h);
        System.out.println(s + " && " + e + " = " + t);
        System.out.print("\n");

        System.out.println("--------- XOR(^)");
        j = false;
        k = false;
        l = true;
        n = true;

        m = (j ^ k);
        o = (j ^ l);
        p = (n ^ l);

        System.out.println(j + " ^ " + k + " = " + m);
        System.out.println(j + " ^ " + l + " = " + o);
        System.out.println(n + " ^ " + l + " = " + p);
        System.out.print("\n");

        System.out.println("--------- NEGATION(!)");
        boolean one = true;
        boolean two = (!one);
        System.out.println("Negation !one = " + two);


    }
}
