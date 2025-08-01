package com.ll;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private final String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        String[] cmdBits = cmd.split("\\?");
        return cmdBits[0];
    }

    public String getParam(String name, String defaultValue) {
        String queryString = cmd.split("\\?", 2)[1];
        String[] queryStringBits = queryString.split("&");
        Map<String, String> params = new HashMap<>();
        for (String paramStr : queryStringBits) {
            String[] paramBits = paramStr.split("=", 2);
            String paramName = paramBits[0];
            String paramValue = paramBits[1];

            params.put(paramName, paramValue);
        }
        return params.getOrDefault(name, defaultValue);
    }
}