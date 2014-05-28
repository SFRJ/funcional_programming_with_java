package service_selection_patter;

import org.junit.Test;
import service_selection_patter.model.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RequestHandlerTest {

    @Test
    public void shouldSum() {
        assertThat(new RequestHandler().<SumRequest,SumResult>handleRequest("sum 3 5"), is("sum result 8"));
    }

    @Test
    public void shouldPowerOftwo() {
        assertThat(new RequestHandler().<PowerRequest,PowerResult>handleRequest("power 3 "), is("power result 9"));
    }

}