package frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    //LOGIN
    @FindBy(xpath = "/html/body/div/div/header/div/div/form/button")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/button")
    private WebElement registerButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/input[1]")
    private WebElement userInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/input[2]")
    private WebElement passwordInput;


    //USERPAGE
    @FindBy(xpath = "/html/body/div/div/header/div/div/h1")
    private WebElement userHeader;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[1]/form/textarea")
    private WebElement addNoteField;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[1]/form/button")
    private WebElement addButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[2]")
    private WebElement noteContainer;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[2]/div[1]/form/button[2]")
    private WebElement deleteButton;

//    @FindBy(xpath = "//*[@id=\"11\"]")
//    private WebElement updateButton;


    //LOGIN
    public void loginClick(){
        loginButton.click();
    }

    public void registerClick(){
        registerButton.click();
    }

    public WebElement getUserInput(){
        return userInput;
    }

    public WebElement getPasswordInput(){
        return passwordInput;
    }




    //USERPAGE
    public WebElement getUserHeader(){
        return userHeader;
    }

    public WebElement getAddNoteField(){
        return addNoteField;
    }

    public WebElement getAddButton(){
        return addButton;
    }

    public WebElement getNoteContainer() {
        return noteContainer;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }


}
