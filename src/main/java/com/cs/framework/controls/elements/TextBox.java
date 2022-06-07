package com.cs.framework.controls.elements;

import com.cs.framework.controls.api.ImplementedBy;
import com.cs.framework.controls.internals.Control;

@ImplementedBy(TextBoxBase.class)
public interface TextBox extends Control {

    void EnterText(String text);
    String GetTextValue();

}
