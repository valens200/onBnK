package rw.ac.onbank.orm.helpers;
public class MessagesAndOptionsPrinter {
    public void  printLine(String message){
        System.out.println(message);
    }
    public  void print(String message){
        System.out.print(message + " :");
    }
    public void printChoices(String[] texts){
        int i = 0;
        while(i < texts.length){
            System.out.println( i+ 1 "." + texts[i]);
            i++;
        }
    }

}
