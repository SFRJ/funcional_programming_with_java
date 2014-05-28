package service_selection_patter.registry;

import service_selection_patter.generics.OperatorRequestType;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by ocean on 28/05/14.
 */
public class SupportedRequests {

    private List<OperatorRequestType<? extends Object, ? extends Object>> requests =
            new ArrayList<OperatorRequestType<? extends Object, ? extends Object>>();

    public void addRequest(OperatorRequestType<? extends Object, ? extends Object> request) {
        requests.add(request);
    }

    public List<OperatorRequestType<? extends Object, ? extends Object>> getRequests() {
        return requests;
    }
}
