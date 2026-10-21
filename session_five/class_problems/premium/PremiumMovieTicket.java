
package premium;

import cinehub.MovieTicket;

public class PremiumMovieTicket extends MovieTicket {

    public PremiumMovieTicket(int seatNumber, String screenId,
                              double ticketPrice, String movieTitle) {
        super(seatNumber, screenId, ticketPrice, movieTitle);
    }

    public void testProtectedAccess() {
        PremiumMovieTicket ownType = this;

        System.out.println("Own-type access: "
                + ownType.ticketPrice);

        MovieTicket parentType = this;

        // Parent-type access is not allowed from this package.
        // System.out.println(parentType.ticketPrice);
    }

    public static void main(String[] args) {
        PremiumMovieTicket ticket =
                new PremiumMovieTicket(12, "SCREEN-1", 350.0, "Leo");

        ticket.testProtectedAccess();
    }
}
