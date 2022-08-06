package Q3;

public class Main {
    public static void main(String[] args) {
        bracketCheck bracketcheck1 = new bracketCheck("3 = (( 6 * 2) - 3");
        bracketcheck1.CheckB();

        bracketCheck bracketcheck2 = new bracketCheck("3 = (( 6 * 2) - 3)");
        bracketcheck2.CheckB();
    }
}