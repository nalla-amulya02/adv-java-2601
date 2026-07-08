import java.io.FileReader;
import java.io.IOException;

public class demo {

    public static void readFile() throws IOException{
        FileReader fr = new FileReader("demo.txt");

        
        fr.close();
    }

 public static void getAge(int age) throws ArithmeticException{ 
     if(age < 18){
        throw new ArithmeticException("not eligible");
     }
 }
public static void withdraw(int balance,int amount) throws LowbalanceException{
    if(balance < amount){
        throw new LowbalanceException("Balance is less than amount");
    }   
}


    public static void main(String[] args) {
        try{
        readFile();
        }catch(IOException e){
            System.out.println("exception occured");
        }

    try{
        getAge(5);
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }

    try{
    withdraw(100, 500);
    }catch(LowbalanceException e){
        System.out.println(e.getMessage());
    }

    
}


// balance < amount - > throw a exception



}
