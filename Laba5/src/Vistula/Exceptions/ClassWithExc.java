package Vistula.Exceptions;

public class ClassWithExc {
    public static void throwMyEcx() throws MyException {
        throw new MyException("ClassWithException");
    }

    public static void throwAll(int n) throws FirstException, SecondException, ThirdException {
        if (n == 1) {
            throw new FirstException("This is the first exception");

        } else if (n == 2) {
            throw new SecondException("This is the Second exception");
        } else {
            throw new ThirdException("This is the Third exception");
        }
    }

    public static void g() throws FirstException{
        throw new FirstException("The first exception has been thrown");
    }
    public static void f() throws SecondException{
        try{
            g();
        }catch (FirstException fe){
            fe.print();
            throw new SecondException("The second exception has been thrown");
        }
    }

    public static void print() {
        System.out.println("This is my exception");
    }
}
