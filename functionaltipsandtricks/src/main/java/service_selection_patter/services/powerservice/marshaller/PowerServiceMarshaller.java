package service_selection_patter.services.powerservice.marshaller;

import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.powerservice.model.PowerResponse;

public class PowerServiceMarshaller implements ResponseMarshaller<PowerResponse> {
    @Override
    public String marshall(PowerResponse powerResponse) {
        return "power result " + powerResponse.result();
    }
}
