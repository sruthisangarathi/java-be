public class common {
  
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Arguments count: " + args.length);

        if (args.length > 0) {
            System.out.println("First arg: " + args[0]);
        }
    }
}
