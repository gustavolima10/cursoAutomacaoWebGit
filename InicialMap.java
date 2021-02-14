package map;

import core.Element;
import enums.ByValue;
import org.openqa.selenium.By;

public class InicialMap {
    public Element pesquisa = new Element(ByValue.ID, "search");
    public Element tituloLivro = new Element(ByValue.XPATH, "//h2/a");
    public Element preco = new Element(ByValue.CSS,"span > span > span.price" );
    public Element livros = new Element(ByValue.CSS, "ul.products-grid > li");
    public Element tituloLivroList = new Element(ByValue.CSS, "h2 > a");
    public Element precoLista = new Element(ByValue.CSS, "span.price");
}
