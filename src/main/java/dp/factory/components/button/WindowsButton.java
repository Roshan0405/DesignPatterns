package dp.factory.components.button;

public class WindowsButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Show windows button");
    }
    @Override
    public void addBorderToButton() {
        System.out.println("Add Border To Button");
    }
}
