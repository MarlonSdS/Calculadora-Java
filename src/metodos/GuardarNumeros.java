
package metodos;

/**
 *
 * @author Marlo
 */
public class GuardarNumeros {
    public String val1 = "0";
    public String val2 = "0";
    public boolean btnPressed = false;
    /*
    Strings val: A expressão é dividida entre um número antes do sinal e um depois. Quando o botão 'igual' é pressionado
    o resultado da operação passa para a val1 e val2 se torna 0.
    boolean btnPressed: Diz se um operador já foi pressionado ou não. Quando um operador é pressionado esta variável torna-se
    true. Essa variável determina se o valor digitado deve ser salvo em val1 ou val2.
    
    Val strings: The expression is divided between a number before the sign and one after it. When the 'equal' button is pressed
     the result of the operation passes to val1 and val2 becomes 0.
     boolean btnPressed: Tells whether an operator has already been pressed or not. When an operator is pressed, this variable becomes
     true. This variable determines whether the entered value should be saved in val1 or val2.
    */
    public void digitar(String val){
        if (btnPressed == false){
            if (val1 == "0"){
                val1 = val;
            }else{
                val1 = val1 + val;
            }
        }else{
            if (val2 == "0"){
                val2 = val;
            }else{
                val2 = val2 + val;
            }
        }
    }
}
