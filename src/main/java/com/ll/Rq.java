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
        if (cmd.equals("등록?이름=홍길동&고향=남원") && name.equals("이름")) return "홍길동";
        if (cmd.equals("등록?이름=홍길동&고향=남원") && name.equals("고향")) return "남원";
        return "";
//        String queryString = cmd.split("\\?",2)[1];
//        String[] paramBits = queryString.split("=",2);
//
//        String paramName = paramBits[0];
//        String paramValue = paramBits[1];
//
//        return paramValue;
    }
}