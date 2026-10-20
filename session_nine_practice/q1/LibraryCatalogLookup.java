
import java.util.*;

public class LibraryCatalogLookup {

    static String findBook(String[][] catalog, String targetIsbn) {
        int low = 0;
        int high = catalog.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = catalog[mid][0].compareTo(targetIsbn);

            if (result == 0) {
                return catalog[mid][1];
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[][] catalog = {
            {"101", "Java"},
            {"102", "Python"},
            {"103", "C Programming"},
            {"104", "Data Structures"},
            {"105", "Operating Systems"}
        };

        String targetIsbn = "103";

        System.out.println("Book: " + findBook(catalog, targetIsbn));
    }
}
