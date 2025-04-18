package dp.factory.components;

import dp.factory.components.button.Button;
import dp.factory.components.button.WindowsButton;
import dp.factory.components.dropdown.Dropdown;
import dp.factory.components.dropdown.WindowsDropDown;

public class WindowsUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new WindowsDropDown();
    }
}
