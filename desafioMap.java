package map;

import core.Element;
import enums.ByValue;

public class desafioMap {

    public Element first_name  = new Element(ByValue.XPATH, "//input[@placeholder='First Name']");
    public Element last_name = new Element(ByValue.XPATH, "//input[@placeholder='Last Name']");
    public Element adress = new Element(ByValue.XPATH, "//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
    public Element email_adress = new Element(ByValue.CSS, "#eid > input");
    public Element phone = new Element(ByValue.XPATH, "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
    public Element upload = new Element(ByValue.XPATH, "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
    public Element gender_male = new Element(ByValue.XPATH, "//label[1]//input[1]");
    public Element gender_female = new Element(ByValue.XPATH, "//label[2]//input[1]");
    public Element hobbie_cricket = new Element(ByValue.ID, "checkbox1");
    public Element hobbie_movie = new Element(ByValue.ID, "checkbox2");
    public Element hobbie_hockey = new Element(ByValue.ID, "checkbox3");
    public Element languages = new Element(ByValue.ID, "msdd");
    public Element skill = new Element(ByValue.ID, "Skills");
    public Element country = new Element(ByValue.ID, "countries");
    public Element select_country = new Element(ByValue.XPATH, "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
    public Element year_date = new Element(ByValue.ID, "yearbox");
    public Element month_date = new Element(ByValue.XPATH, "//select[@placeholder='Month']");
    public Element day_date = new Element(ByValue.ID, "daybox");
    public Element password = new Element(ByValue.ID, "firstpassword");
    public Element confirm_password = new Element(ByValue.ID, "secondpassword");
    public Element submit = new Element(ByValue.NAME, "signup");
    public Element refresh = new Element(ByValue.ID,"Button1");
}
