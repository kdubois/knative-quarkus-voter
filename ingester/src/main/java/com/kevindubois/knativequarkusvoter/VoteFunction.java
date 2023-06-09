package com.kevindubois.knativequarkusvoter;

import io.quarkus.funqy.Funq;
import io.quarkus.logging.Log;

public class VoteFunction {

    @Funq("vote")    
    public Vote vote(Vote vote) {
        // send as Cloud Event
        Log.info("Vote cast was " + vote.getShortname());
        return vote;
    }
}
