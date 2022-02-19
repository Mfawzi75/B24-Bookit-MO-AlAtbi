package com.bookit.pages;

import org.openqa.selenium.support.PageFactory;

import com.bookit.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}