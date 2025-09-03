programa {
  funcao inicio() {
    inteiro vetor[10], i, soma
    real media

    escreva("Digite 10 números inteiros:\n")
    para (i = 0; i < 10; i++) {
      leia(vetor[i])
    }

    limpa()

    escreva("Elementos nos índices ímpares:\n")
    para (i = 0; i < 10; i++) {
      se (i % 2 != 0) {
        escreva(vetor[i], " ")
      }
    }

    escreva("\n\nElementos pares:\n")
    para (i = 0; i < 10; i++) {
      se (vetor[i] % 2 == 0) {
        escreva(vetor[i], " ")
      }
    }
    soma = 0
    para (i = 0; i < 10; i++) {
      soma = soma + vetor[i]
    }

    media = soma / 10

    escreva("\n\nSoma: ", soma)
    escreva("\nMédia: ", media)
  }
}
