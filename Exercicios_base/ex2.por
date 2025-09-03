programa{ 
  funcao inicio() { 
    inteiro numero 

    escreva("Digite um número: \n") 
    leia(numero) 
    
    se (numero % 4 == 0 e numero % 9 == 0){ 
      escreva("Verdadeiro") 
      }senao{ escreva("Falso") 
      } 
  } 
}