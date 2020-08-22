package Extension.MainFiles;
import Extension.StringExtension.StringExtensionKt;
public class Main {
    public static void main(String[] args){
        String s = "Mi variable en java";
        System.out.println( StringExtensionKt.lastChar(s) );
        System.out.println( StringExtensionKt.repeat(s,4) );
    }
}
