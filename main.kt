/* Exercicios 

1- Faça um programa que receba três inteiros e diga qual deles é o maior.

2- Faça um programa que entre com três números e coloque em ordem crescente.


3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual  categoria ela se encontra:
              10-14 infantil
              15-17 juvenil
              18-25 adulto 
 
4- Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.


5- Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.

*/



//Exercicio 5
/*
fun main() {
   
  print("Digite um número : ")
  val mes = readLine()!!.toInt()

  when(mes){
     1 -> println("Janeiro")
     2 -> println("Fevereiro")
     3 -> println("Março")
     4 -> println("Abril")
     5 -> println("Maio")
     6 -> println("Junho")
     7 -> println("Julho")
     8 -> println("Agosto")
     9 -> println("Setembro")
     10 -> println("Outubro")
     11 -> println("Novembro")
     12 -> println("Dezembro")
  else -> println("Mês inválido")

  }
} */

//Exercicio 3
/*
fun main() {
  
print("Digite sua idade: ")
val idade = readLine()!!.toInt()
  
when(idade){
    in 10..14 -> println("Infantil")
    in 15..17 -> println("Juvenil")
    in 18..59 -> println("Adulto")
    else -> print("Idoso")
      
    } 
} */

//Exercicio 1
/*
fun main() {

println("Digite o primeiro número: ")
val num1 = readLine()!!.toInt()
println("Digite o segundo número: ")
val num2 = readLine()!!.toInt()
println("Digite o terceiro número: ")
val num3 = readLine()!!.toInt()


    if(num1>num2 && num1>num3){
    print("O maior número é: $num1")
    }
    else if(num2>num1 && num2>num3){
    print("O maior número é: $num2")
    }
    else{
    print("O maior número é: $num3")
    }
} */


//Exercicio 2
/*
fun main() {

println("Digite o primeiro número: ")
val num1 = readLine()!!.toInt()
println("Digite o segundo número: ")
val num2 = readLine()!!.toInt()
println("Digite o terceiro número: ")
val num3 = readLine()!!.toInt()

if(num1<=num2 && num2<=num3){
  print("A ordem crescente é: $num1, $num2, $num3")
}else if(num1<=num3 && num3<=num2){
  print("A ordem crescente é: $num1, $num3, $num2")  
}else if(num2<=num1 && num1<=num3){
  print("A ordem crescente é: $num2, $num1, $num3")
}else if(num2<=num3 && num3<=num1){
  print("A ordem crescente é: $num2, $num3, $num1")
}else if(num3<=num1 && num1<=num2){
  print("A ordem crescente é: $num3, $num1, $num2")
}else{
  print("A ordem crescente é: $num3, $num2, $num1")
}

} */


//Exercicio 4
/*
import kotlin.math.Pow
import kotlin.math.sqrt

fun main(){
  
print("Digite um número: ")
val num = readLine()!!.toDouble()

if(num%2 == 0.0){
   val raiz = sqrt(num)
   print("O numero $num é par e a raiz quadrada é $raiz")
}else{
  val quad = num.pow(2)
   print("O numero $num é impar e elevado ao quadrado é: $elevadoQ")
}

} */