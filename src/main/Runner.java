public class Runner {
    public static void main(String[] args){

        float zahl1 = 13;
        float zahl2 = 3;

        int addition = (int) (zahl1 + zahl2);
        int subtraktion = (int) (zahl1 - zahl2);
        int multiplikation = (int) (zahl1 * zahl2);
        float division = zahl1 / zahl2;

        System.out.println("Das Ergebnis der Addition lautet: "+ addition);
        System.out.println("Das Ergebnis der Subtraktion lautet: "+ subtraktion);
        System.out.println("Das Ergebnis der Multiplikation lautet: "+ multiplikation);
        System.out.println("Das Ergebnis der Division lautet: "+ division);
    }
}
