package restassuredexercises;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Exercises {

    private int standardBookingId;
    private String booking;
   @Before
public void makeStandardBooking() {

       Booking standardBooking = new Booking();
       BookingDates standardBookingDates = new BookingDates();

       standardBookingDates.setCheckIn("04-09-2020");
       standardBookingDates.setCheckOut("06-12-2021");

       standardBooking.setFirstName("Wil");
       standardBooking.setLastName("Vakantie");
       standardBooking.setTotalPrice(666);
       standardBooking.setBookingDates(standardBookingDates);
       standardBooking.setAdditionalNeeds("Breakfast");

       standardBookingId =

               given()
                       .contentType(ContentType.JSON)
                       .body(standardBooking)
                       .when().
                       post("https://restful-booker.herokuapp.com/booking").
                       then().
                       extract().path("bookingid");
       booking = String.format("https://restful-booker.herokuapp.com/booking/%s", standardBookingId);
   }

    @Test
    public void getBooking_checkStatusCode_shouldReturnHttp200() {

        /**
         * Perform a GET to https://restful-booker.herokuapp.com/booking/<your_booking_id>
         * and check that the status code equals 200
         */
        given().
                when().get(booking).
                then().assertThat().statusCode(200);
    }

    @Test
    public void getBooking_checkAdditionalNeeds_shouldReturnBreakfast() {

        /**
         * Perform a GET to https://restful-booker.herokuapp.com/booking/<your_booking_id>
         * and check that the value of the JSON response body element
         * 'additionalneeds' equals 'Breakfast'
         */

        given().
                when().get(booking).
                then().assertThat().
                body("additionalneeds", equalTo("Breakfast"));
    }

    @Test
    public void getBooking_deserializeResponse_checkFirstName() {

        /**
         * Perform a GET to https://restful-booker.herokuapp.com/booking/<your_booking_id>.
         * Deserialize the JSON response to an instance of the Booking class.
         * You don't need to create or modify the Booking class yourself, it's in the 'main' package.
         * Use a JUnit assertion to check that the value of the 'firstname' element
         * is equal to your supplied first name.
         */

        Booking NameBooking =

                given()
                        .when()
                        .get(booking)
                        .as(Booking.class);

        Assert.assertEquals("Wil", NameBooking.getFirstName());
    }

    @Test
    public void createBooking_extractId_retrieveBooking_checkLastName() {

        Booking booking = new Booking();
        BookingDates bookingDates = new BookingDates();

        bookingDates.setCheckIn("01-01-2020");
        bookingDates.setCheckOut("01-01-2021");

        booking.setFirstName("Ben");
        booking.setLastName("Weg");
        booking.setTotalPrice(500);
        booking.setBookingDates(bookingDates);
        booking.setAdditionalNeeds("Breakfast");

            int bookingId =

                given()
                        .contentType(ContentType.JSON)
                        .body(booking)
                        .when().
                        post("https://restful-booker.herokuapp.com/booking").
                        then().
                       extract().path("bookingid");

        /**
         * Perform a POST to https://restful-booker.herokuapp.com/booking,
         * using the booking object created above as the payload.
         * Don't remove the call to contentType(), otherwise it will not work :)
         *
         * Extract and store the generated bookingid as an integer.
         */
        /**
         * Use that value as a path
         * parameter to retrieve the booking once again, and check that the last name is equal
         * to the value you set before. Either deserialize the response like in the previous exercise,
         * or use body("", equalTo("")) directly.
         *
         * You don't need to create or modify the Booking class yourself, it's in the 'main' package.
         */

       given().
               when().get("https://restful-booker.herokuapp.com/booking/" + bookingId).
               then().assertThat().
                body("lastname", equalTo("Weg"));

    }
}
