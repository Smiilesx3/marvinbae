public class Runner {
    public static void main(String[] args) {

        float zahl1 = 13;
        float zahl2 = 3;

        Math calculator = new Math();

        float addition = calculator.methodeAddition(zahl1, zahl2);
        float subtraktion = calculator.methodeSubtraction(zahl1, zahl2);
        float multiplikation = calculator.methodeMulitplication(zahl1, zahl2);
        float division = calculator.methodeDivision(zahl1, zahl2);

        System.out.println("Das Ergebnis der Addition lautet: " + addition);
        System.out.println("Das Ergebnis der Subtraktion lautet: " + subtraktion);
        System.out.println("Das Ergebnis der Multiplikation lautet: " + multiplikation);
        System.out.println("Das Ergebnis der Division lautet: " + division);
    }
}
