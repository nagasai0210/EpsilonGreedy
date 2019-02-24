package com.naga.greedy;

public class ButtonColour {

    String colour;
    int clicks = 1;
    int visits = 1;
    float percentage = 1;

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    @Override
    public String toString(){
        return colour + " "  + clicks + "/" + visits + " : " + percentage;
    }
}
