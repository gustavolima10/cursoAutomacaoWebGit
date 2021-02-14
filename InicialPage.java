package pages;

import core.Driver;
import map.InicialMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InicialPage {
    InicialMap inicialMap = new InicialMap();

    public void setPesquisa(CharSequence... valor) {

        inicialMap.pesquisa.sendKeys(valor);
    }

    public String getTituloLivro() {
        String livro = inicialMap.tituloLivro.getText();
        return livro;
    }

    public String getPreco() {
        return inicialMap.preco.getText();

    }

    public String getPrecoLista() {
        List<WebElement> livros = inicialMap.livros.getElements();
        for (WebElement elivro : livros) {
            inicialMap.tituloLivroList.setWebElement(elivro);
            String titulo = inicialMap.tituloLivroList.getText();
            if (titulo.contains("Ajax com Java")) {
                inicialMap.precoLista.setWebElement(elivro);
                return inicialMap.precoLista.getText();
            }

        }


        return null;
    }

    public void clickTitulo(){
        inicialMap.tituloLivro.click();
    }
}