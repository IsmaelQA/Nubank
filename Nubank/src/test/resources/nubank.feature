#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Pedir um cartão
  Eu como usuario quero acessar o site da nubank para pedir um cartão

	Background: Acessar Nubank
	Given eu esteja no site "https://www.nubank.com.br"
	
	Scenario: Pedir cartão
     
     When preencher o CPF
     And clicar em continuar
     Then visualizo as informacoes
     
     Scenario Outline: Validar dados cadastrais
     
     When preencher os seguintes dados <CPF> 
     And nome <Nome>
     And email <email>
     And confirma email <confirmaemail>
     
     Then valido informacoes 
        	
         Examples: 
    
    		|	      CPF              |     Nome         |        email               |     confirmaemail      |
        |    "516.829.650-58"    | "Ismael Batista" |"ismaelguit@outlook.com"    |"ismaelguit@outlook.com"|
        |    "516.829.650-58"    |                  |"ismaelguit@outlook.com"    |                        |
		  	|    "516.829.650-58"    |"Ismael Batista"  |"ismaelguit@outlook.com"    |"ismaelguit@outlook.com"|   
        |    "516.829.650-58"    |                  |                            |                        |
 	 
		
		  	
		  	
		  	
		  	
		  	            