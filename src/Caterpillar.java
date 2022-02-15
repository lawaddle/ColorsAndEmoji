// credit to Mr. Das for the code used in this example!

import static java.awt.Color.blue;

public class Caterpillar
{
    // constants: these are "unicode" characters that
    // each represent a color!
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    // emoji example (unicode)
    private final String GREEN_APPLE_EMOJI = "\uD83C\uDF4F";

    // instance variable
    private String name;

    // constructor
    public Caterpillar(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        // adding color to the console
        // note how you append a color string to change its color
        System.out.println(CYAN + "Hello," + RED + " my name is " + BROWN + name);
        System.out.println(BLUE + "and I am" + PURPLE + " a caterpillar!");
        System.out.println(WHITE + "Cool huh?");
    }

    public void printFavoriteFoods()
    {
        // search for emoji icons here:  https://www.fileformat.info/info/unicode/char/search.htm
        // when you find one you like, scroll down to "C/C++/Java source code" and copy/paste that string
        System.out.println("Pineapple: \uD83C\uDF4D");
        System.out.println("Red apple: "+ RED +"\uD83C\uDF4E");
        System.out.println("Green apple: " + BLUE + GREEN_APPLE_EMOJI);
        System.out.println("Clover: \uD83C\uDF40");
        System.out.println(CYAN + "Cyan, " + BLUE + " Blue Chicken: \uD83D\uDC14");
    }

    // this method "throws exceptions" which is an
    // advanced topic you don't need to know for this course, but for more info
    // check out: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
    public void animate() throws InterruptedException
    {
        // helper method defined below
        System.out.print(RED);
        System.out.println("                  \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "                " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("                  ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("                 \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "               " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("                 ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("                \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "              " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("                ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("               \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "             " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("               ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("              \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "            " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("              ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("             \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "           " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("             ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("            \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "          " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("            ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("           \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "         " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("           ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("          \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "        " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("          ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("         \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "       " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("         ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("        \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "      " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("        ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("       \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "     " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("       ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("      \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "    " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("      ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("     \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "   " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("     ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("    \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "  " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("    ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("   \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + " " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("   ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("  \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("  ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(PURPLE);
        System.out.println(" \\_/-.--.--.--.--.--.");
        System.out.println("(\")__)__)__)__)__)__)");
        System.out.println(" ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        System.out.println(RED + name + ": CHOMP CHOMP YUM!" + WHITE);
    }


}