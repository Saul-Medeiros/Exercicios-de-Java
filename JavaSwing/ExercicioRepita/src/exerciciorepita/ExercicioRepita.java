/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.WARNING_MESSAGE);// nome da janela, mensagem, título, ícone pronto
        
        int num;//armazena o número inserido
        int tv = 0;//armazena a quantidade de números inseridos
        int tp = 0;//armazena o total de pares entre os números inseridos
        int ti = 0;//armazena o total de ímpares entre os números inseridos
        int t100 = 0;//armazena o total de números acima de 100 entre os números inseridos
        int tvm = 0;//armazena a soma de todos os valores inseridos
        float media = 0;//armazena a média entre os números inseridos
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número <br><i>(valor 0 interrompe)</i></html>"));//mensagem para inserção de dados na caixa de diálogo
            if (num == 0) {
                break;//se número for 0 ele encerra a repetição sem executar o restante do loop
            }
            tv++;//adiciona 1 ao total de valores
            if (num % 2 == 0) {
                tp++;//adiciona 1 ao total de valores pares
            } else {
                ti++;
            }
            if (num > 100) {
                t100++;//adiciona 1 ao total de valores ímpares
            }
            tvm += num;//adiciona o número informado aos valores informados anteriormente
        } while (num != 0);
        media = tvm/tv;
        JOptionPane.showMessageDialog(null, "<html>Resultado<hr><br>"
                + "<br>Total de Valores: " + tv + "<br>Total de Pares: " + tp 
                + "<br>Total de Ímpares: " + ti + "<br>Acima de 100: " + t100 
                + "<br>Média dos Valores: " + media + "</html>");
    }
    
}
