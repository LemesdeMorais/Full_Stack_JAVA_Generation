programa {
    funcao inicio() {
        inteiro vetor[10], i, j, aux

        escreva("Digite 10 números inteiros:\n")
        para (i = 0; i < 10; i++) {
            leia(vetor[i])
        }

        para (i = 0; i < 10; i++) {
            para (j = 0; j < 9 - i; j++) {
                se (vetor[j] < vetor[j + 1]) {
                    aux = vetor[j]
                    vetor[j] = vetor[j + 1]
                    vetor[j + 1] = aux
                }
            }
        }

        escreva("\nVetor em ordem decrescente:\n")
        para (i = 0; i < 10; i++) {
            escreva(vetor[i], " ")
        }
    }
}
