programa {
  funcao inicio() {
    const inteiro TAMANHO = 3
    inteiro mat[TAMANHO][2], l, c

    para (l=0; l<TAMANHO; l++)
    {
      para(c=0; c<2; c++)
      {
        escreva("Valor: ")
        leia(mat[l][c])
      }

    }

    limpa()
    para(l=0;l<TAMANHO;l++){
      para(c=0;c<2;c++){
        escreva("[ ", mat[l][c], " ]")
      }
      escreva("\n")
    }
    
  }
}
