package com.cs.framework.controls.elements;

import com.cs.framework.controls.api.ImplementedBy;
import com.cs.framework.controls.internals.Control;
import com.cs.framework.controls.internals.ControlBase;

@ImplementedBy(ButtonBase.class)
public interface Button extends Control {

    void PerformClick();
    String GetButtonText();
    void PerformSubmit();
    ControlBase Wait();
    ControlBase WaitForVisible();
    ControlBase Click();
    ControlBase ScrollToElement();
}
