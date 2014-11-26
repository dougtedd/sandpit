package be.tedd.sandpit.webapp.model;

import be.tedd.sandpit.common.SimpleBean;

public class ComplexBean {

    private SimpleBean simpleBean;

    private String str;

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public void setSimpleBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

