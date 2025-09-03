programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    inteiro v1, v2, v3, valor

    escreva("Digite o primeiro número: \n")
    leia(v1)

    escreva("Digite o segundo número: \n")
    leia(v2)

    escreva("Digite o terceiro número: \n")
    leia(v3)

    limpa()

    se (v1 >= v2 e v1 >= v3) {
      valor = v1
    } senao se (v2 >= v1 e v2 >= v3) {
      valor = v2
    } senao {
      valor = v3
    }

    escreva("O maior valor é: ", valor)
  }
}
