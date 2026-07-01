void main() {
    IO.println("Ch12 - While Loops\n\n");

    var a = 10;

    while (a >= 1) {
      IO.println(a);
      a--;
    }

    do {
        IO.println("Do while");
        IO.println(a);
    } while (a >= 1);
}