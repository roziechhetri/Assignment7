public class Task1 {

    public static void main(String[] args)
    {
        String input = "Rozie is a Java Developer";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
