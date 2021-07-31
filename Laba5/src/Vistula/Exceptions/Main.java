package Vistula.Exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Main {

    private Logger logger = Logger.getLogger("Excercise2");

    void logException(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    public static void main(String[] args) {
        Main main = new Main().run();
    }

    public Main run() {
        //ex1();
        //ex2();
        //ex4();
        //ex5();
        ex6();
        return null;
    }

    public void ex2() {
        Logger logger = Logger.getLogger("Excercise 2");
        int[] arr = new int[5];
        try {
            arr[5] = 12;
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Index tablicy większy niż rozmiar tablicy");
//            System.out.println(ae);
//            logException(ae);
            logger.severe(ae.toString());
        }


    }

    public void ex4() {
        try {
            ClassWithExc.throwMyEcx();
        } catch (MyException me) {
            ClassWithExc.print();
            me.print();
        }

    }

    public void ex5() {
        try {
            ClassWithExc.throwAll(2);
        } catch (FirstException | SecondException | ThirdException /*MyException*/ me) {
            me.print();
        }
    }

    public void ex6(){
        try {
            ClassWithExc.f();
        }catch (SecondException se){
            se.print();
        }
    }

//    public void throwMyException() throws MyException{
//        throw new myException("Tester");
//    }


    public void ex1() {
        Integer x = null;
        int liczba = 10, n = 0;
        try {
            liczba = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Nieprawidłowa operacja arytmetyczna");
            liczba = 0;
            System.out.println(ae);
        }
        try {
            throw new NullPointerException();
        } catch (NullPointerException ne) {
            System.out.println("The reference variable is not pointing to any point");
            System.out.println(ne);
        } catch (Exception e) {
            System.out.println("Błąd ogólny");
            System.out.println(e);
        } finally {
            System.out.println("We have caught all the exceptions");
            System.out.println("liczba = " + liczba);
        }
    }
}

