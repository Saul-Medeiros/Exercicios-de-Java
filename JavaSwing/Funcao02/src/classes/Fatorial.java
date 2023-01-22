/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Saul
 */
public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor (int n) {
        num = n;
        int f = 1;//fatorial equivale a 1
        String s = "";
        for (int c = n; c > 1; c--) {
            f *= c;//faz a multiplicação do número pelos valores antes dele
            s += c + " x ";// 5 x 4 x 3 ...
        }
        s += "1 = ";//... x 1
        fat = f;
        formula = s;
    }
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return formula;
    }
}
