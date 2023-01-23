public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex ();
        float weight = 105;
        float height = 175;
        float index = service.calculate(weight, height);
        System.out.println(index);
    }
}