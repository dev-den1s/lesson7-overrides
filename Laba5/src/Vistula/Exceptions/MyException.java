package Vistula.Exceptions;

public class MyException extends Exception {
    String str;

    public MyException(String str) {
        this.str = str;
    }

    public void print(){
        System.out.println(str);
    }
}
