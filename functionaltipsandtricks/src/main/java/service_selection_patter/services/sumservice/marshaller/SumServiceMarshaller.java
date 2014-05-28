package service_selection_patter.services.sumservice.marshaller;

import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.sumservice.model.SumResponse;

public class SumServiceMarshaller implements ResponseMarshaller<SumResponse> {

    @Override
    public String marshall(SumResponse sumResponse) {
        return "sum result " + sumResponse.result();
    }
}
