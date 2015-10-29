Feature: Cadastro de Usuário
	Para poder comprar e vender itens
	Como visitante
	Desejo me cadastrar
	
	Scenario: Exibir página de cadastro de Usuário
		Given que o Usuário está na página de Usuários
		When ele acessar o cadastro de novos Usuários
		Then ele deve ver um formulário de cadastro