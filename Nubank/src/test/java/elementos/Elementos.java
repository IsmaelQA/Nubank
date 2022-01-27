package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By cpf = By.id("field-cpf");
	private By clicar = By.cssSelector("#short-form > button");
	private By nome = By.id("field-name");
	private By email = By.id("field-email");
	private By ConfirmaEmail = By.id("field-emailConfirmation");
	private By politica = By.cssSelector("#label-accepted > span.sc-oUDcU.nlWRo > svg");
	private By enviar = By.cssSelector("#complete-form-drawer > div > div > div.sc-pITNg.BTNvH > form > div > div.sc-qXhiz.fVyJdy > div > button");
	
	public By getEnviar() {
		return enviar;
	}
	public By getCpf() {
		return cpf;
	}
	public By getClicar() {
		return clicar;
	}
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getConfirmaEmail() {
		return ConfirmaEmail;
	}
	public By getPolitica() {
		return politica;
	}
	
}
