package lesson12.problem2;
public class AccountException extends RuntimeException {
       AccountException(){
           super();
       }
       AccountException(String message){
           super(message);
       }
}
