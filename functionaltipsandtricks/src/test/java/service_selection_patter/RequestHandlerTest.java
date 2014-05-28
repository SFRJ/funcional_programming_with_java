package service_selection_patter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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

}