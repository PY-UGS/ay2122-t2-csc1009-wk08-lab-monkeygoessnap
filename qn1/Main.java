public class Main{
    public static void main(String[] args){

        CircleWithException circle;

        while (true){
            try {
                circle = new CircleWithException();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage()+"\nRe-enter radius:");
            }
        }

        circle.printDimensions();
    }
}
