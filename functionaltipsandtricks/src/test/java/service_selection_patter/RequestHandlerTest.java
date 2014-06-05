package service_selection_patter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RequestHandlerTest {

    //The client doesn't have to specify the generic type, the matcher will know which service
    //needs to handle the request.
    @Test
    public void shouldSum() {
        assertThat(new RequestHandler().handleRequest("sum 3 5"), is("sum result 8"));
    }

    @Test
    public void shouldPowerOftwo() {
        assertThat(new RequestHandler().handleRequest("power 3 "), is("power result 9"));
    }

    @Test
    public void shouldReturnAnErrorWhenSummingANegativeNumber() {
        //Note: The request handler does not throw exception, it just returns the exception test.
        //The reason for this is because this will commonly be a remote service that will be accessed probably via a webservice or a servlet.
        assertThat(new RequestHandler().handleRequest("sum -3 5"), is("This calculator does not allow negative values"));
    }

}