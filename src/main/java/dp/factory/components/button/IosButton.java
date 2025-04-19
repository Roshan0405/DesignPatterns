package dp.factory.components.button;

public class IosButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Show IOS Button");
    }
    @Override
    public void addBorderToButton() {
        System.out.println("Add Border To Button");
    }
}
