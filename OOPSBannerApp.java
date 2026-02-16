/**
 * OOPSBannerApp UC3 OOPS Banner Application (Use Case 3)
 * This class improves the banner display by using String.join() for efficiency.
 * @author Aditya Malik
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC3 Goal: Use String.join() with an empty delimiter "" [cite: 158, 161]
        System.out.println(String.join("", "  *** ", "   *** ", " ***** ", "  **** "));
        System.out.println(String.join("", " * * ", "  * * ", " * * ", " * "));
        System.out.println(String.join("", " * * ", "  * * ", " * * ", " * "));
        System.out.println(String.join("", " * * ", "  * * ", " ***** ", "  *** "));
        System.out.println(String.join("", " * * ", "  * * ", " * ", "     * "));
        System.out.println(String.join("", " * * ", "  * * ", " * ", "     * "));
        System.out.println(String.join("", "  *** ", "   *** ", " * ", " **** "));
    }
}