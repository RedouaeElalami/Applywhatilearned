package LearningClassesObjectsConstructors;

public class Runnable
{
    public static void main(String[] args) {

    Thread thread1 =new Thread(new java.lang.Runnable() {
        @Override
        public void run() {
            System.out.println("this is my Thread , " +
                    "we override run method in " +
                    "Runnable interface");
        }
    });
    thread1.run();

    //all that in above we can replace it by the lamda expression below
    Thread thread = new Thread(()-> System.out.println("this is my Thread , " +
                                                         "we override run method in " +
                                                         "Runnable interface"));
    thread.run();
    }


}
