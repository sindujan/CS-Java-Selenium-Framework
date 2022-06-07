package com.cs.framework.base;

import com.cs.framework.controls.api.ControlFactory;

public class Base {

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page)
    {
        //Custom control page factory initialization
        Object obj = ControlFactory.initElements(LocalDriverContext.getRemoteWebDriver(), page);
        return page.cast(obj);
    }
}
