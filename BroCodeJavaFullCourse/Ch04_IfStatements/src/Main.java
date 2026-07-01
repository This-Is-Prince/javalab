void main() {
    IO.println("Ch04 - If Statements\n\n");

    var isStudent = false;
    var age = 20;

    if (isStudent && age >= 18) {
        IO.println("This is the student");
    } else if (!isStudent && age >= 18) {
        IO.println("This is not the student");
    } else {
        IO.println("I don't know what you are.");
    }
}
