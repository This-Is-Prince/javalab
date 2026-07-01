void main() {
    IO.println("Ch08 - String Methods\n\n");

    String name = "Bro Code";

    int length = name.length();
    IO.println(length);

    char letter = name.charAt(2);
    IO.println(letter);

    int index = name.indexOf("o");
    IO.println(index);

    int lastIndex = name.lastIndexOf("o");
    IO.println(lastIndex);
}