package me.letsplaywith.criminalintent;

import java.util.UUID;

/**
 * Created by jinyong on 3/24/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate an unique id
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String $Title) {
        mTitle = $Title;
    }
}
