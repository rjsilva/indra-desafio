# indra-desafio

Manual Para Execução dos Testes - Web e Api


Ferramentas

- IDE(Eclipse)

Tecnologias 

- Java 8
- Cucumber
- RestAssured
- Selenium
- Junit

Rodar os Testes

	Pré-Requisito: Atualizar o Projeto Api e Web antes de rodar os testes, para baixar as dependências do maven
	
	- Dentro da IDE
	- Clicar botão direito no projeto
	- Selecionar opção "Maven"
	- Selecionar opção "Update maven project"
	
1 - Opção Rodar os testes pela IDE(Eclipse)

  - Clicar botão direito no projeto
	- Run As  -> JUnit Test
	
	-------------Rodar os Testes Aplicação Api--------------- 
	
	Sistema Operacional Mac OSX
	- Abrir Terminal
	- Entra dentro do projeto
	- Executar o camando "mvn test"
	
	Sistema Operacional Windows
	- abrir cmd 
	- Entra dentro do projeto
	- Executar o camando "mvn test"
	
	----------Aplicação Web----------------- 
		
	Sistema Operacional Windows
	- Pré requisito
	- Ir até o arquivo application.properties dentro do pacote src/test/resources 
	- Inserir o caminho na primeira linha -> chrome.path=./windows/chromedriver.exe
  - Atualizar as dependências do maven
  - Rora os testes com Run As  -> JUnit Test
	
	------------Reports do Testes -----------------------
	
	- Dentro do projeto api
	- Pasta target -> surefire--reports -> cucumber.html -> index.html
	
	- clicar no "index.html" ou abrir com seu browser de preferência
	
	obs: futuramente esse report, estará no jenkins
	
	
	------------Prints Web-------------------------------------------------
	-dentros da pastas abaixo ficam os prints de acordo com o status do testes. 
	-/indra-web/indra-web
  
