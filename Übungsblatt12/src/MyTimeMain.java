public class MyTimeMain {
    public static void main(String[] args){
        Controller controller = new Controller();
        try {
            controller.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
