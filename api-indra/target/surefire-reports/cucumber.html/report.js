$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/mensagem/mensagem.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: Ronaldo silva"
    },
    {
      "line": 3,
      "value": "#Version: 1.0"
    },
    {
      "line": 4,
      "value": "#Encoding: UTF-8"
    }
  ],
  "line": 5,
  "name": "- Validar mensagem",
  "description": "",
  "id": "--validar-mensagem",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "CT001 - validar mensagem retorno",
  "description": "",
  "id": "--validar-mensagem;ct001---validar-mensagem-retorno",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@VM001"
    },
    {
      "line": 7,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que faco uma requisicao GET/todos",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "devo receber um status code \u0027200\u0027",
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "o titulo da mensagem \"delectus aut autem\"",
  "keyword": "E "
});
formatter.match({
  "location": "MensagemSteps.queFacoUmaRequisicaoGETTodos()"
});
formatter.result({
  "duration": 4882194495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "MensagemSteps.devoReceberUmStatusCode(int)"
});
formatter.result({
  "duration": 4509038,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "delectus aut autem",
      "offset": 22
    }
  ],
  "location": "MensagemSteps.oTituloDaMensagem(String)"
});
formatter.result({
  "duration": 620150245,
  "status": "passed"
});
});