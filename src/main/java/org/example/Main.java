package org.example;
import org.apache.commons.lang3.StringUtils;
public class Main {
    public static void main(String[] args) {
        String s = "Hello world";
        Example ex = new Example();
        ex.print(s);

    }
}

class Example  {
    public void print (String s) {
        System.out.println(StringUtils.reverse(s));
    }
}