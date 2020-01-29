
package metodos;

/**
 *
 * @author Marlo
 */
public class GuardarNumeros {
    public String val1 = "0";
    public String val2 = "0";
    public boolean btnPressed = false;
    
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
