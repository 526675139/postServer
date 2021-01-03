package common;

import java.util.HashMap;
import java.util.Map;

public class RequestMapping {
    private static RequestMapping instance = new RequestMapping();
    private Map<String,String> reqMap = new HashMap<>();

    private RequestMapping()
    {
        reqMap.put("req1","domain.TestDo");
    }

    public static RequestMapping getInstance()
    {
        return instance;
    }

    public Map<String,String> getReqMap()
    {
        return reqMap;
    }
}
