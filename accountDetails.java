package halifax;

public class accountDetails {
    // define properties
    private static int ID = 1000;
    private static int defaultsixteenNum = 44624333;
    private static int defaultaccNum = 270;
    private static int defaultsortCode = 11;
    private String accountHolder;
    // private String accountNumber;
    // private String sortCode;
    private static final String validFrom = "11/20";
    private static final String expiresEnd = "11/23";
    // private String iban;

    // create constructor
    accountDetails(String accountHolder) {
        this.accountHolder = accountHolder;
        ID();
        sixteendigits();
        accountHolder();
        accountNumber();
        sortcode();
        threedigitpin();
        cardPin();
        validFrom();
        expiryEnd();
        ID++;
        System.out.println("\n");
    }

    // create the methods

    // creae the account names
    public void accountHolder() {
        System.out.println("Account Holder: " + accountHolder);
    }

    // create the 16 gigit number

    public void sixteendigits() {
        int min = 10000000;
        int max = 99999999;

        int random = (int) (Math.random() * (max - min));
        random = random + min;
        System.out.println("Account 16 digit: " + defaultsixteenNum + "" + random);
    }

    // create an account number

    public void accountNumber() {
        int min = 10000;
        int max = 99999;
        int random = (int) (Math.random() * (max - min));
        random = random + min;
        System.out.println("Account Number: " + defaultaccNum + "" + random);
    }

    // create a sortcode

    public void sortcode() {
        int min = 1000;
        int max = 9999;
        int random = (int) (Math.random() * (max - min));
        random = random + min;
        System.out.println("SortCode Number: " + defaultsortCode + "" + random);
    }

    public void threedigitpin() {
        int min = 100;
        int max = 999;
        int random = (int) (Math.random() * (max - min));
        random = random + min;
        System.out.println("3 Digit Pin: " + random);
    }

    // create card pin

    public void cardPin() {
        int min = 1000;
        int max = 9999;
        int random = (int) (Math.random() * (max - min));
        random = random + min;
        System.out.println("Card Pin: " + random);
    }

    // create the valid start date
    public void validFrom() {
        System.out.println("Valid From: " + validFrom);
    }

    // create the empiry date
    public void expiryEnd() {
        System.out.println("Expires End: " + expiresEnd);
    }

    // create the account id
    public void ID() {
        System.out.println("Current Account - " + ID);
    }

}
