programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    cadeia nome
    real nota1, nota2, nota3, media
    
    escreva ("Digite seu nome: \n")
    leia(nome)

    escreva ("Digite a primeira nota: \n")
    leia(nota1)

    escreva ("Digite a segunda nota: \n")
    leia(nota2)

    escreva ("Digite a terceira nota: \n")
    leia(nota3)

    media = (nota1+nota2+nota3)/3
    limpa()

    se (media >= 7.0){
      escreva (nome, "\n Você passou! Com a nota:", mat.arredondar(media,2))
    }senao se(media >= 4 e media<7){
      escreva (nome, "\n Você esta de exame! Com a nota:", mat.arredondar(media,2))
    }senao{
      escreva (nome,"\n Deu ruim! Sua nota deu: ", mat.arredondar(media,2))
    }
    
  }
}
