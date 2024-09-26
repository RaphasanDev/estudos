# language: pt

  Funcionalidade: Acessar site e efetuar compra
    Eu como cliente
    Desejo acessar site
    Efetuando compra de produto aleatório

  Cenario: Compra de produto
    Dado que estou no site https://www.saucedemo.com
    Quando faco login
    Quando adiciono aleatoriamente produto ao carrinho
    Quando clico no botao CHECKOUT
    Quando Preencho meus dados
    E finalizo a compra
    Entao valido se a compra foi efetuada com sucesso
