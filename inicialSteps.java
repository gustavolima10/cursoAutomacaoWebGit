package steps;
import static org.junit.Assert.assertEquals;
import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.Keys;
import pages.InicialPage;

public class inicialSteps {
    InicialPage inicialPage = new InicialPage();
    @Dado("que estou na pagina loja virtual")
    public void queEstouNaPaginaLojaVirtual() {

        Driver.setUrl("https://lojaexemplod.lojablindada.com/");
    }

    @Quando("eu realizo a busca do livro {string}")
    public void euRealizoABuscaDoLivro(String titulo) {
        inicialPage.setPesquisa(titulo, Keys.ENTER);
    }

    @Entao("valido o titulo sendo {string}")
    public void validoOTituloSendo(String titulo) {

        assertEquals(titulo, inicialPage.getTituloLivro());
    }

    @Entao("o preco sendo {string}")
    public void oPrecoSendo(String preco) {
        assertEquals(preco, inicialPage.getTituloLivro());
    }

    @Quando("clico no livro pesquisado")
    public void clicoNoLivroPesquisado() {
        inicialPage.clickTitulo();
    }



}
