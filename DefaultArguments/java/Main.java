package DefaultArguments.java;
//import DefaultArguments.intro.FunctionsKt;

public class Main {

    public static void modify_x (int x) {
        x = 99;
        System.out.print(x + " ");
}
    public static void main(String [] args){
        //FunctionsKt.displaySeparator();
        int x = 22;
        System.out.print(x + " ");
        modify_x(x);
        System.out.print(x + " ");
}


}
