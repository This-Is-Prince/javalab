void main() {
    IO.println("Ch14 - Break and Continue");

    for (var a = 1; a < 10; a++) {
        if (a % 2 == 0) {
            IO.println(a + " Continue");
            continue;
        } else if (a == 7) {
            break;
        }

        IO.println(a);
    }
}