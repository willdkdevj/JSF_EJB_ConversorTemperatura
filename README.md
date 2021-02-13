# Trabalhando com Templates (Facelets)
> Projeto Java EE que trabalha com as três camadas da arquitetura (Cliente, Camada Web, Lógica de Negócio)

[![ECLIPSE Version][ECLIPSE-image]][ECLIPSE-url]
[![Build Status][ECLIPSE-gpl]][ECLIPSE-url]
[![Downloads Stats][ECLIPSE-downloads]][ECLIPSE-url]

![](https://www.eclipse.org/eclipse.org-common/themes/solstice/public/images/logo/eclipse-foundation-white-orange.svg?w=283)  


Neste projeto foram criados arquivos para a interface do Servlet e para Lógica de Negócio, além da interface JSF do cliente.
Ele cria um conversor de temperatura (Celsius para Fahrenheit e vice-versa), com a ação de um botão (commandButton). 

O Bean de camada lógica tem uma interface de exposição com a Camada Web:

```sh
 /**
 * Session Bean implementation class ConverterTemperatureBean
 */
@Stateless
public class ConverterTemperatureBean implements ConverterTemperatureBeanRemote {
```  

Depois foi injetado `@EJB` o bean no bean (Camada Web) para invocar seus métodos (*onde estão a lógica do negócio*):

```sh
	@EJB
	private ConverterTemperatureBeanRemote conversor;
```

Para concluir, inserimos as TAG's personalizadas a página XHTML senguindo a estrutura do *template* ficando como apresentado na codificação a seguir:

```sh
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	  xmlns:sn="http://mytags/supernovatech">

<ui:composition template="/template.xhtml">
	<ui:define name="header">
		<sn:cabecalho />	    
	</ui:define>
	<ui:define name="content">
	    <sn:conteudo />
	</ui:define>
	<ui:define name="footer">
	    <sn:rodape />
	</ui:define>
</ui:composition>
</html>
```

## Etapas para Compilar e Executar na IDE Eclipse

Para compilar e executar este projeto a partir de sua máquina, faça as etapas a seguir:

1. Na IDE Eclipse vá até o "Menu Principal" em File >> New >> Dinamyc Web Project;

2. Dê um nome ao projeto em *Project name:* (Exemplo: JSFFacelets), e clique no botão *Finish*;

3. Clique com o botão direito sobre o nome do projeto e selecione *Properties*;
	* No menu a esquerda, localize a opção *Project Facets*;
	* No centro da janela (Project Facet), marque a opção JavaServer Faces e em *Version*, selecione a última versão disponível;
	* Clique em *Further configuration available...* e em *URL Mapping Patterns* adicione uma extensão para ser utilizada para invocar a página JSF. Exemplo: `*.html`
	

3. Caso resolva baixar o ZIP (.zip) do projeto, cole a pasta **src** em *Java Resources*;

4. E cole a pasta **WebContent** sobrescrevendo a pasta atual do projeto;

5. Adicione o projeto as configurações do servidor, ao clicar com o botão direito em cima dele e selecionando a opção *Add and Remove*;
	* Localize o projeto no lado esquerdo;
	* Selecione o nome do projeto;
	* Clique no botão *Add >*.
	* Clique no botão *Finish*;
	* Depois clique no botão *Executar*;
	* Agora será possível testá-la em um navegador utilizando o nome da página (testLayout1) com a extensão que você adicionou na configuração do projeto. Exemplo: `http://localhost:8080/JSFFacelets/testLayout1.html`

## Agradecimentos

Obrigado por ter visto meus esforços em criar um projeto JSF com Facelets!

Como diria um antigo mestre:
> *"Cedo ou tarde, você vai aprender, assim como eu aprendi, que existe uma diferença entre CONHECER o caminho e TRILHAR o caminho."*
>
> *Morpheus - The Matrix*

[ECLIPSE-image]: https://img.shields.io/eclipse-marketplace/v/notepad4e?style=plastic
[ECLIPSE-url]: https://www.eclipse.org/ide/
[ECLIPSE-downloads]: https://img.shields.io/eclipse-marketplace/dm/notepad4e?style=plastic
[ECLIPSE-gpl]: https://img.shields.io/eclipse-marketplace/l/notepad4e?style=plastic
[wiki]: https://github.com/seunome/seuprojeto/wiki