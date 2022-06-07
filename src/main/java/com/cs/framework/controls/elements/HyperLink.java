package com.cs.framework.controls.elements;

import com.cs.framework.controls.internals.ControlBase;
import com.cs.framework.controls.api.ImplementedBy;
import com.cs.framework.controls.internals.Control;

@ImplementedBy(HyperLinkBase.class)
public interface HyperLink extends Control{


    void ClickLink();
    String GetUrlText();
    boolean CheckUrlTextContains(String containsText);
    ControlBase Wait();
    ControlBase WaitForVisible();
    ControlBase Click();
}
