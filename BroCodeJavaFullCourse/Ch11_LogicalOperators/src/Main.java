void main() {
    IO.println("Ch11 - Logical Operators\n\n");

    var a = false && true;
    var b = true || false && true;
    var c = !true || !false;

    System.out.printf("%b, %b, %b", a, b, c);
}