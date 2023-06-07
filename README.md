##Video Pitch

<href>https://www.youtube.com/watch?v=KqlbojUZsVU</href>

### Execução da API

Para executar a API, execute a classe **beRecycleApplication**.

### Endpoints

**USER Entity**

POST: **http://localhost:8080/user**

{
  "cep": "03194-653",
  "cnh": "31326861616",
  "email": "david@gmail.com",
  "housenumber": "389",
  "name": "David Augusto",
  "pass": "teste1234",
  "phone": "(11) 95037-6156",
  "type": "Transportador",
  "vehicle": "BR01838",
}

{
  "cep": "09831-386",
  "email": "mantovanivitor@gmail.com",
  "housenumber": "891",
  "name": "Vitor Mantovani",
  "pass": "teste1234",
  "phone": "(11) 93678-4513",
  "type": "Beneficiário",
}

{
  "cep": "04115-060",
  "cnpj": "13.590.976/8315-46",
  "email": "lucas.amadeu.soares@gmail.com",
  "housenumber": "375",
  "name": "Lucas Amadeu",
  "pass": "teste12345",
  "phone": "(11) 95078-2114",
  "type": "Doador",
}

POST: **http://localhost:8080/user/login**

{
    "email": "lucas.amadeu.soares@gmail.com",
"   pass": "teste12345"
}

GET: **http://localhost:8080/user**

Rota para listagem dos usuários

PUT: **http://localhost:8080/user**

{
    id: 1
    name: "Lucas Soares"
    cep: "06473-073"
    phone: "(13)997209036
    email: "luquinhas123@gmail.com"
    pass: "lucas123"
}

Json com o Id do usuário e os dados que podem ser atualizados

DELETE: **http://localhost:8080/user/{id}**

A rota recebe o Id do usario e realiza o soft delete


**POST Entity**

POST: **http://localhost:8080/post**

{
    name: "Lucas Amadeu",
    userId: 1,
    phone: "(13)99720-9036,
    email: "lucas.amadeu.soares@gmail.com",
    local: "São Paulo, SP",
    description: "2 kg de arroz",
    type: "Doador
}

GET: **http://localhost:8080/post

Lista todas as publicações que estão ativas

GET: **http://localhost:8080/post/user/{id}**

Rota retorna todas as publicações de um usuário

GET: **http://localhost:8080/post/{id}**

Rota retorna post com o Id passado

PUT: **http://localhost:8080/post

{
    id: 1,
    active: 0 ou 1
}

Atualiza se o post esta ativo(1) ou não (0)

DELETE: **http://localhost:8080/post/{id}**

Desativa o post com o Id passado











