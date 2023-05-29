package programmer.zaman.now.application;

public class StakeTraceElementApp {
    public static void main(String[] args) {
        try{
            sampleError();
        }
        catch (RuntimeException runtimeException){
            runtimeException.printStackTrace();
        }
    }

    public static void sampleError() {
        try{
            String[] names = {
                    "Ahmad", "Ihsan", "Rabbani"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
