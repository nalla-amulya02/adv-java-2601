public class Demo2 {
    public static void main(String[] args) {
        // finally block  -> have the code to run irrespective of the exception
        try{
            System.out.println("In try");
            // System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("in finally");
        }

        //                 exception-> catch-handle-> 
        // prgram starts ->                            finally
        //                 no exception  ------------>


        // finally without catch

        // try{
        //   int x = 100/0;      
        // }finally{
        //     System.out.println("In finally");
        // }



        // return with finally
        System.out.println(test(2));
        // throw
        trans(100, 500);

    }


    public static int test(int x){
        try{
             System.out.println(x);
             return x;
        }finally{
            System.out.println("in finally");
        }
       
    }

    public static void trans(int balance,int amount){
        try{
            if(balance < amount){
                throw new Exception("Balance is less than amount");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    // throw -> create and throw an new exception
    //  throws

    
}
