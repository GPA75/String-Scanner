/* I still am one amateur in area
learning in progress.
*/
package Addition;
 
//programa de adição que insere os números, então exibe a soma
import java.util.*; //programa utiliza a classe Scanner

public class Addition {

    public static void main(String[] args) {

        //cria uma scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        int number1, //primeiro número a somar
            number2, //segundo número a somar
            sum; //soma do number1 e number2
        
        System.out.print("Enter First integer: "); //prompt
        number1 = input.nextInt(); //lÊ o primeiro número fornecido pelo usúario
        
        System.out.print("Enter Second integer: "); //prompt
        number2 = input.nextInt(); //lÊ o segundo número fornecido pelo usúario
        
        sum = number1 * number2; //soma os números, depois armazena o total em sum
        
        System.out.printf("Sum is: %d%n", sum); //exibe a soma
    }//fim do método main
}//fim da classe Addittion
