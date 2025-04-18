package dp.factory.components;

import dp.factory.components.button.Button;
import dp.factory.components.button.WindowsButton;
import dp.factory.components.dropdown.Dropdown;
import dp.factory.components.dropdown.WindowsDropDown;

public interface UiFactory {
    Button createButton();
    Dropdown createDropDown();
}
