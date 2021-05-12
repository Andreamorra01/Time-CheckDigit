package loyaltycard;

public class Main {
    public static void main(String[] args) {
        LoyaltyCard test = new LoyaltyCard();
        test.setCodice("123456789121");
        System.out.println(test.checkValidity(test.getCodice()));
        System.out.println(test.checkDigit(test.getCodice()));
        System.out.println(test.getCardNo(test.getCodice()));
        System.out.println(test.getFullCardNo(test.getCodice()));
    }
}
