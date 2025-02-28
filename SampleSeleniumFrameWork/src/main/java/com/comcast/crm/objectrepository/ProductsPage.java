package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
@FindBy(xpath="//img[@alt='Create Product...']")
private WebElement createproductImgBtn;
@FindBy(name="search")
private WebElement searchTextField;
}
