package core;

import enums.ByValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;

public class
Element {

    private ByValue by;
    private String map;
    private WebElement webElement = null;
    private WebElement element = null;
    private HashMap<ByValue, By> byMap = new HashMap<ByValue, By>();

    public Element(ByValue by, String _map){ //construtor com o mesmo nome da classe
        this.by = by;
        map = _map;
        setByMap();

    }

    private void setByMap(){
        byMap.put(ByValue.ID, By.id(map));
        byMap.put(ByValue.XPATH, By.xpath(map));
        byMap.put(ByValue.CSS, By.cssSelector(map));
        byMap.put(ByValue.LINKTEXT, By.linkText(map));
        byMap.put(ByValue.NAME, By.name(map));
    }

    public void setWebElement(WebElement _element){
        webElement = _element;

    }


    public WebElement getElement(){
        if (element == null){
            element = get(byMap.get(by));
        }
        return element;

    }

    public WebElement get(By by){
        if (webElement == null){
            return Driver.getDriver().findElement(by);
        }

        return webElement.findElement(By.id(map));

    }

    public List<WebElement> getElements(){
        return Driver.getDriver().findElements(byMap.get(by));

    }

    public void sendKeys(CharSequence... value){

        getElement().sendKeys(value);
    }

    public String getText(){

        return getElement().getText();
    }

    public void click(){

        getElement().click();
    }

    public String getAtributte(String value){

        return getElement().getAttribute(value);
    }

    public Element clear(){

        getElement().clear();
        return this;
    }

    public boolean isEnabled(){ //valida se objeto esta habilitado

        return getElement().isEnabled();
    }

    public boolean isDisplayed(){ //quando elemento existe na tela mas esta invisivel

        return getElement().isDisplayed();
    }

    public boolean isSelected(){

        return getElement().isSelected();
    }

    public void select(String value){
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
    }

    public Element waitVisibleElement(){
        element = Driver.waitVisibleElement(byMap.get(by));
        return this;
    }

    public void waitInvisibilityElement(){

        Driver.waitInvisibilityElement(byMap.get(by));
    }

    public Element waitClicableElement (){
        element = Driver.waitClicableElement(byMap.get(by));
        return this;
    }

}
