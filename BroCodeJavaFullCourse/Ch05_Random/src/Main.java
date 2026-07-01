import java.util.Random;

void main() {
    IO.println("Ch05 - Random\n\n");

    var random = new Random();

    int number;

    number = random.nextInt(1, 7);

    IO.println(number);


}