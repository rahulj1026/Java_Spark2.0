package logics;

public class DefaultException {
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();
    }
    public static void doMoreStuff(){
        System.out.println(10/0); //this throws a default exception (Arithmetic Exception using stack mechanism
    }
}
