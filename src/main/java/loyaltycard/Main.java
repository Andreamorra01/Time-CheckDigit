package loyaltycard;

public class Main {
    public static void main(String[] args) {
        LoyaltyCard test = new LoyaltyCard("1234567891217");
        System.out.println(test.checkValidity());
        System.out.println(test.checkDigit());
        System.out.println(test.getCardNo());
        System.out.println(test.getFullCardNo());
    }
}
