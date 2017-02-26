package com.android.rahul_lohra.redditstar.modal;

import com.android.rahul_lohra.redditstar.modal.t3_Link.T3_Data;
import com.android.rahul_lohra.redditstar.modal.t5_Subreddit.T5_Data;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rkrde on 20-02-2017.
 */

public class T5_Kind {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("data")
    @Expose
    public T5_Data data;
}