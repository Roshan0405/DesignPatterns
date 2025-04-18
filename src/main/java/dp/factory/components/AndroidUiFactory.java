package dp.factory.components;

import dp.factory.components.button.AndroidButton;
import dp.factory.components.button.Button;
import dp.factory.components.dropdown.AndroidDropDown;
import dp.factory.components.dropdown.Dropdown;

public class AndroidUiFactory implements UiFactory {


    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new AndroidDropDown();
    }
}
