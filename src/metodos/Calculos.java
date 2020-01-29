
package metodos;

/**
 *
 * @author Marlo
 */
public class Calculos {
    
    public Double result;
    
    public Double soma(String val1, String val2){
        Double num1 = Double.parseDouble(val1);
        Double num2 = Double.parseDouble(val2);
        result = num1 + num2;
        return result;
    }
    
    public Double subtracao(String val1, String val2){
        Double num1 = Double.parseDouble(val1);
        Double num2 = Double.parseDouble(val2);
        result = num1 - num2;
        return result;
    }
    
    public Double divisao(String val1, String val2){
        Double num1 = Double.parseDouble(val1);
        Double num2 = Double.parseDouble(val2);
        result = num1 / num2;
        return result;
    }
    
    public Double multiplicacao(String val1, String val2){
        Double num1 = Double.parseDouble(val1);
        Double num2 = Double.parseDouble(val2);
        result = num1 * num2;
        return result;
    }
    
    public void decidirCalculo(String operador, String val1, String val2){
        if(operador == "mais"){
            soma(val1, val2);
        }else if(operador == "menos"){
            subtracao(val1, val2);
        }else if(operador == "vezes"){
            multiplicacao(val1, val2);
        }else if(operador == "dividir"){
            divisao(val1, val2);
        }
    }
}
