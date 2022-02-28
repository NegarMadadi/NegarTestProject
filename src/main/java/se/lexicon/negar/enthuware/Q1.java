package se.lexicon.negar.enthuware;

public class Q1 {

    class NewException extends Exception {}

    class AnotherException extends Exception {}

     class ExceptionTest{
        public static void main(String[] args) throws Exception{
            try{
                m2();
            }
            finally{
                m3();
            }
        catch (NewException e){}
        }

        public static void m2() throws NewException { throw new NewException(); }

        public void m3() throws AnotherException{ throw new AnotherException(); }

    }
}
