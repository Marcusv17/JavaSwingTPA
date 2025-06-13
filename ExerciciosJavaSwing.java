/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosjavaswing;
import javax.swing.JOptionPane;
/**
 *
 * @author MARCUS
 */
public class ExerciciosJavaSwing {

   public static void main(String[] args) {
       //Exercício 1
        //Lê os dados
      int anos = Integer.parseInt(JOptionPane.showInputDialog("Anos:")); 
int meses = Integer.parseInt(JOptionPane.showInputDialog("Meses:"));
int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias:"));
int total = (anos * 365) + (meses * 30) + dias; 
//Calcula o total, considerando Ano = 365 dias e Mês = 30 dias

JOptionPane.showMessageDialog(null, "Total em dias: " + total); 
//Mostra a idade em dias
//Fim do exercício 1


//Exercício 2
    //Calcula a média dos números 8, 9 e 7
double media1 = (8 + 9 + 7) / 3.0;

// Calcula a média dos números 4, 5 e 6
double media2 = (4 + 5 + 6) / 3.0;

//Calcula a soma das duas médias
double somaDasMedias = (media1 + media2);

//Calcula a média das duas médias
double mediaDasMedias = (media1 + media2) / 2;

//Exibe o resultado final
JOptionPane.showMessageDialog(null, "Média dos números 8, 9 e 7: " + media1);
JOptionPane.showMessageDialog(null, "Média dos números 4, 5 e 6: " + media2);
JOptionPane.showMessageDialog(null, "Média das médias: " + mediaDasMedias);
JOptionPane.showMessageDialog(null, "Soma das médias: " + somaDasMedias);
//Fim do exercício 2


//Exercício 3
double saldo = 0;
saldo = Integer.parseInt(JOptionPane.showInputDialog("Saldo"));
//Reajuste de 1%
double reajuste = saldo * 1.01;

//Mostra o novo saldo
JOptionPane.showMessageDialog(null, "Saldo com 1% de reajuste : " + reajuste);
//Fim do exercício 3


//Exercício 4
//Lê a porcentagem |P|
double p = Double.parseDouble(JOptionPane.showInputDialog("|P| (%): "));

//Lê o valor e a quant. da peça 1
double valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor peça 1: "));
double quant1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade peça 1: "));

//Lê o valor e a quant. da peça 2
double valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor peça 2: "));
double quant2 = Integer.parseInt(JOptionPane.showInputDialog("Quatidade peça 2: "));

double valorTotal = 0;
valorTotal = ((valor1 * quant1) + (valor2 * quant2)) * (p / 100 + 1);

//Valor final
JOptionPane.showMessageDialog(null, "Total com |P|: " + valorTotal);
//Fim do exercício 4


//Exercício 5
double salarioMinimo = 1000.00;

//Salário do Usuário
double salarioUser = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário do usuário: "));

//Calculo de salários mínimos
double quantSM = salarioUser / salarioMinimo;

//Mensagem do calculo
JOptionPane.showMessageDialog(null, "Total de salários: " + quantSM);
//Fim do exercício 5


//Exercício 6
//Lê um número inteiro
double num = Integer.parseInt(JOptionPane.showInputDialog("Número inteiro: "));

//Exibe o antecessor e o sucessor
JOptionPane.showMessageDialog(null, "Antecessor: " + (num - 1) + ", Sucessor: " + (num + 1));  
//Fim exercício 6
    }
}