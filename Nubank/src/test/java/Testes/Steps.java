package Testes;

import java.io.IOException;

import Pages.Metodos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Given("eu esteja no site {string}")
	public void eu_esteja_no_site(String string) {
	   metodo.abrirNavegador(string);
	}

	@When("preencher o CPF")
	public void preencher_o_cpf() {
		metodo.escrever("516.829.650-58", el.getCpf());
		
	}

	@When("clicar em continuar")
	public void clicar_em_continuar() {
		metodo.submit(el.getClicar());
	}

	@Then("visualizo as informacoes")
	public void visualizo_as_informacoes() {
		metodo.fecharNavegador();
	}

	@When("preencher os seguintes dados {string}")
	public void preencher_os_seguintes_dados(String cpf) {
	    metodo.escrever(cpf, el.getCpf());
	    metodo.submit(el.getClicar());
	}

	@When("nome {string}")
	public void nome(String nome) {
	  metodo.escrever(nome, el.getNome());
	}

	@When("email {string}")
	public void email(String email) {
	    metodo.escrever(email, el.getEmail());
	}

	@When("confirma email {string}")
	public void confirma_email(String confirmeEmail) throws IOException {
	  metodo.escrever(confirmeEmail, el.getConfirmaEmail());
	  metodo.click(el.getPolitica());
	  metodo.click(el.getEnviar());
	  metodo.screnShot(confirmeEmail);
	}

	@Then("valido informacoes")
		public void valido_informacoes() {
		
	}

	@When("nome ")
	public void nome() {
	  
	}

	@When("confirma email ")
	public void confirma_email() {
	  
	}

	@When("email ")
	public void email() {
	    
	}
	
}
