package dp.adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankApi bankAPI = new ICICIBankAdapter();

        String JanardhanAccNo = "12345";
        String RoshanAccNo = "456789";

        double amount = 100.0;

        bankAPI.sendMoney(JanardhanAccNo, RoshanAccNo, amount);
    }
}
