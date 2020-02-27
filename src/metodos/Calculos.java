
package metodos;

/**
 *
 * @author Marlo
 */
public class Calculos {
    
    public Double result;
    /*
    Cada método corresponde a uma das operações básicas, os métodos recebem as strings val e as convertem para
    double, em seguida fazem a operação matemática básica.
    
    Each method corresponds to one of the basic operations, the methods take the strings val and convert them 
    to double, then do the basic mathematical operation.
    */
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
