public class Demo1 {
    public static void main(String[] args) {

        // ----multiple catch block----
        try {
            // String s = null;
            // System.out.println(s.length());
            int x = 100 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("in arithmetic exception");
            // System.out.println("in handling code ");
        } catch (NullPointerException e) {
            System.out.println("in null pointer exception");
            // System.out.println("in handling code ");

        } catch (Exception e) {
            System.out.println("in generic exception");
        }
        System.out.println("end of the program");
        // end of multiple catch blocks



        // multi catch

        try {
            // System.out.println(100 / 0);
            String s = null;
            System.out.println(s.length());
        }catch (ArithmeticException | NullPointerException e) {
            System.out.println("in multi catch block");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("in ofb exception");
        }catch(Exception e) {
            System.out.println("in generic exception");
        }
         // multi catch - end

        

    }
}
