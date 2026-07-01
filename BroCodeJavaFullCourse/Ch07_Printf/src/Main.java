void main() {
    IO.println("Ch07 - Printf\n\n");

    String name = "Spongebob";
    var firstLetter = 'S';
    var age = 30;
    var height = 60.99;
    var isEmployed = true;

    System.out.printf("Hello %s\n", name);
    System.out.printf("Hello %c\n", firstLetter);
    System.out.printf("Hello %d\n", age);
    System.out.printf("Hello %.2f\n", height);
    System.out.printf("Hello %b\n", isEmployed);
}