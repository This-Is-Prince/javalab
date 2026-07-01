void main() {
    IO.println("Ch10 - Enhanced Switches\n\n");

    String day = "";
    day = "Friday";

    switch (day) {
        case "Monday" -> IO.println("Today is Monday");
        case "Tuesday" -> IO.println("Today is Tuesday");
        default -> IO.println("Today is Friday");
    }
}