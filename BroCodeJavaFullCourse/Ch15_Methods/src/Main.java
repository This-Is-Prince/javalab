void main() {
    IO.println("Ch15 - Methods\n\n");


    hello();
    addAndPrint(2, 3);
    addAndPrint(3, 4);
}

void hello() {
    IO.println("Hello");
}

void addAndPrint(int a, int b) {
    IO.println(a + b);
}

String addStrings(String a, String b) {
    var result = a + b;
    return result;
}

String addStrings(String a, String b, String c) {
    var result = a + b + c;
    return result;
}