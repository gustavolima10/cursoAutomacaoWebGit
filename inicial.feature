#language: pt

  @lojaVirtual
  Funcionalidade: Loja virtual
    Busca livro

  @validarLivro @regresivo
  Cenario: Validar livro
    Dado que estou na pagina loja virtual
    Quando eu realizo a busca do livro "Fortaleza digital"
    Entao valido o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital"
    E o preco sendo "R$519,90"
    Quando clico no livro pesquisado
    Entao confirmo o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital" e o preco sendo "R$519,90"

    @validarLivroMenina @regressivo
    Cenario: Validar livro Menina
      Dado que estou na pagina loja virtual
      Quando eu realizo a busca do livro "menina"
      Entao valido o titulo sendo "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros"
      E o preco sendo "R$821,30"
      Quando clico no livro pesquisado
      Entao confirmo o titulo sendo "[PRODUTO DE EXEMPLO] - A Menina que Roubava Livros" e o preco sendo "R$821,30"

      @exemploEsquema
      Esquema do Cenario: Validar livro <titulo>
        Dado que estou na pagina loja virtual
        Quando eu realizo a busca do livro <titulo>
        Entao valido o titulo sendo <tituloLivro>
        E o preco sendo <preco>
        Quando clico no livro pesquisado
        Entao confirmo o titulo sendo <tituloLivro> e o preco sendo <preco>

        Exemplos:
        |titulo |tituloLivro| preco|
        |Fortaleza Digital| [PRODUTO DE EXEMPLO] - Fortaleza Digital| R$519,90|
        |menina| [PRODUTO DE EXEMPLO] - A Menina que Roubava Livros| R$821,30|
