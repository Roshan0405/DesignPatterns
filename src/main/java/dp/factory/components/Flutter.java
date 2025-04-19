package dp.factory.components;

import org.springframework.ui.context.Theme;

public class Flutter {

    //refreshUI and setTheme are Non Factory methods so we written in the class which is Flutter
    void refreshUI(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("Setting the theme");
    }

    public UiFactory getFactory(SupportedPlatform platformName) {
        return UiFactoryFactory.getUiFactoryUsingPlatformName(platformName);
    }
}
