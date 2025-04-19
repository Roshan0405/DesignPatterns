package dp.factory.components;

import dp.factory.components.button.Button;

public class Client {
    public static void main(String[] args) {

//        Flutter flutter = new Flutter();
//        UiFactory uiFactory = new WindowsUiFactory();

        String input = "";
        Flutter flutter = new Flutter();

        UiFactory uiFactory = flutter.getFactory(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.showButton();
    }
}
