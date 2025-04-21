package dp.adapter;

public class ICICIBankAdapter implements BankApi{

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        return false;
    }
}
