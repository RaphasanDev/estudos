package passosdefinidos;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ProdutoAleatorio;
import pages.TelaBtnFinish;
import pages.TelaCheckout;
import pages.TelaLogin;
import pages.TelaPreencherDados;
import pages.Url;
import pages.ValidarCompra;

public class PassosDefinidos {
    private WebDriver navegador;
    private Url url;
    private TelaLogin telalogin;
    private ProdutoAleatorio produtoAleatorio;
    private TelaCheckout telaCheckout;
    private TelaPreencherDados telaPreencherDados;
    private TelaBtnFinish telaBtnFinish;
    private ValidarCompra validarCompra;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raphael\\DEV\\github\\Automacao\\CompraSaucedemo\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Dado("que estou no site https:\\/\\/www.saucedemo.com")
    public void queEstouNoSiteHttpsWwwSaucedemoCom() {
        url = new Url(navegador);
        url.site();
    }
    @Quando("faco login")
    public void faco_login() {
        telalogin = new TelaLogin(navegador);
        telalogin.login();

    }
    @Quando("adiciono aleatoriamente produto ao carrinho")
    public void adiciono_aleatoriamente_produto_ao_carrinho() {
        produtoAleatorio = new ProdutoAleatorio(navegador);
        produtoAleatorio.aleatorio();

    }
    @Quando("clico no botao CHECKOUT")
    public void clico_no_botao_checkout() {
        telaCheckout = new TelaCheckout(navegador);
        telaCheckout.checkout();

    }
    @Quando("Preencho meus dados")
    public void preencho_meus_dados() {
        telaPreencherDados = new TelaPreencherDados(navegador);
        telaPreencherDados.dados();

    }
    @Quando("finalizo a compra")
    public void finalizo_a_compra() {
        telaBtnFinish = new TelaBtnFinish(navegador);
        telaBtnFinish.btn();
    }
    @Entao("valido se a compra foi efetuada com sucesso")
    public void valido_se_a_compra_foi_efetuada_com_sucesso() {
        validarCompra = new ValidarCompra(navegador);
        validarCompra.validar();
    		// Fechar o Navegador
    		navegador.quit();
    		}
    }
    
    

