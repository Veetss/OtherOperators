public class Main {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;
        System.out.println(b % 2 == 0); //se b (17) / 2 da 0 di resto vuol dire che il numero è pari. da falso perchè da del resto. % serve per vedere se un numero è multiplo di un altro
        System.out.println((b * (b+1)) % 3 == 0); // 17 * 18 = risultato e vedere se risultato è multiplo di 3.
    }
}