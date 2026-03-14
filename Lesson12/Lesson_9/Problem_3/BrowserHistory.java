package Lesson_9.Problem_3;
import java.util.Stack;

public class BrowserHistory {
    private Stack<String> history=new Stack<>();
    private String currentUrl;
    private Stack<String> history2=new Stack<>();

   public BrowserHistory(String urlName){
        this.currentUrl=urlName;
    }
    public void visit(String url){
        history.push(currentUrl);
        currentUrl=url;
        System.out.println("Visited: "+url);
    }
    public void back(){
       if(history.isEmpty()){
           System.out.println("No history to go back to.");
           return;
       }
           history2.push(currentUrl);
           String p=history.pop();
           currentUrl=p;
           System.out.println("Back to: "+p);
    }
   public void forward(){
       if(history2.isEmpty()){
           System.out.println("No Forward History");
           return;
       }
       String p=history2.pop();
       history.push(currentUrl);
       currentUrl=p;
       System.out.println("Forward to: "+p);
    }
}
