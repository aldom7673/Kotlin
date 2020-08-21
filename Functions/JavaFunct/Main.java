package Functions.JavaFunct;

import static Functions.intro.KotlinFunctionsKt.displayMax;
import static Functions.intro.KotlinFunctionsKt.max;
import static Functions.intro.KotlinFunctionsKt.joinList;

/*
* Alternative import
* import Functions.intro.KotlinFunctionsKt;
* */
public class Main {
    public static void main(String[] args){
        //KotlinFunctionsKt.displayMax(1,10);
        displayMax(4,5);
        System.out.println(max(15,1));
        joinList();
    }
}
