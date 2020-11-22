package com.cursor.shop;

public enum AgeRestriction {
   NONE (0), TEENAGER (13), ADULT(18);
   private int minAge;

    AgeRestriction(int minAge) {
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }
}
