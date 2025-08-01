package com.ll;

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
        for (String paramStr : queryStringBits) {
            String[] paramBits = paramStr.split("=", 2);
            String paramName = paramBits[0];
            String paramValue = paramBits[1];

            if (name.equals(paramName)) return paramValue;
        }
        return defaultValue;
    }
}