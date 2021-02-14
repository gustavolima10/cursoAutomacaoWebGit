package pages;

import core.Element;
import map.desafioMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.LinkedHashMap;

public class desafioPage {

    desafioMap DesafioMap = new desafioMap();

    public void setFirstName (CharSequence... valor){
        DesafioMap.first_name.sendKeys(valor);

    }

    public void setLastName (CharSequence... valor){
        DesafioMap.last_name.sendKeys(valor);

    }

    public void setAdress (CharSequence... valor){
        DesafioMap.adress.sendKeys(valor);

    }

    public void setEmailAdress (CharSequence... valor){
        DesafioMap.email_adress.sendKeys(valor);

    }

    public void setPhone (CharSequence... valor){
        DesafioMap.phone.sendKeys(valor);

    }

    public void setLanguage (WebElement languages){


        DesafioMap.languages.isSelected();
        Select english = new Select(languages);
        english.selectByVisibleText("English");


    }

    public void setPassword (CharSequence... valor){
        DesafioMap.password.sendKeys(valor);

    }

    public void setConfirmPassword (CharSequence... valor){
        DesafioMap.confirm_password.sendKeys(valor);

    }

    public void clickMale (){
        DesafioMap.gender_male.click();
    }

    public void clickFemale (){
        DesafioMap.gender_female.click();
    }

    public void clickHobbiea (){

        LinkedHashMap<String, Element> hobbies = new LinkedHashMap<String, Element>();
        hobbies.put("cricket", DesafioMap.hobbie_cricket);
        hobbies.put("hockey", DesafioMap.hobbie_hockey);
        hobbies.put("movie", DesafioMap.hobbie_movie);

        hobbies.get(hobbies).click();
    }


    public void selectLanguages (String value){

        DesafioMap.languages.select(value);
    }


}









