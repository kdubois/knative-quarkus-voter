package com.kevindubois.knativequarkusvoter;

public class Vote {
    private String shortname;

    public Vote() { }

    public Vote(String shortname) {
        this.shortname = shortname;
    }

    /**
     * @return the shortname
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * @param shortname the shortname to set
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
}
