void main() {
    IO.println("Ch16 - Arrays");

    String[] fruits = {"apple", "orange", "banana", "coconut"};

    IO.println(fruits[fruits.length - 1]);

    for (String fruit : fruits) {
        IO.println(fruit);
    }
}

// varargs
int add (int... numbers) {
    var result = 0;

    for (var number : numbers) {
        result += number;
    }

    return result;
}