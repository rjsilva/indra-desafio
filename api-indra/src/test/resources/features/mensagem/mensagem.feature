#language: pt
#Author: Ronaldo silva
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: - Validar mensagem

  @VM001 @Regressivo
  Cenario: CT001 - validar mensagem retorno
    Dado que faco uma requisicao GET/todos
    Entao devo receber um status code '200'
    E o titulo da mensagem "delectus aut autem"
