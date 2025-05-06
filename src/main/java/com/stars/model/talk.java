package com.stars.model;

public class talk {
    private int talkid;
    private int rentingname;
    private String talktime;
    private String talkabout;

    //get
    public int getTalkid() {
        return talkid;
    }
    public int getrentingname() {
        return rentingname;
    }
    public String getTalkabout() {
        return talkabout;
    }
    public String getTalktime() {
        return talktime;
    }

    //set
    public void setTalkid(int talkid) {
        this.talkid = talkid;
    }
    public void setrentingname(int rentingname) {
        this.rentingname = rentingname;
    }

    public void setTalktime(String talktime) {
        this.talktime = talktime;
    }

    public void setTalkabout(String talkabout) {
        this.talkabout = talkabout;
    }
}
