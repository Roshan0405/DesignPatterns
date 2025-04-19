package dp.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Show Android Button");
    }
    @Override
    public void addBorderToButton() {
        System.out.println("Add Border To Button");
    }
}
