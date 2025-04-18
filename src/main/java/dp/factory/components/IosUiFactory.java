package dp.factory.components;

import dp.factory.components.button.Button;
import dp.factory.components.button.IosButton;
import dp.factory.components.button.WindowsButton;
import dp.factory.components.dropdown.Dropdown;
import dp.factory.components.dropdown.IosDropDown;
import dp.factory.components.dropdown.WindowsDropDown;

public class IosUiFactory implements UiFactory {


    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new IosDropDown();
    }
}
