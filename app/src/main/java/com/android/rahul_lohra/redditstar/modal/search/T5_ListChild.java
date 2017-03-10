package com.android.rahul_lohra.redditstar.modal.search;

import com.android.rahul_lohra.redditstar.modal.ListingDS;
import com.android.rahul_lohra.redditstar.modal.T5_Kind;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rkrde on 20-02-2017.
 */
public class T5_ListChild extends ListingDS {
    @SerializedName("children")
    @Expose
    public List<T5_Kind> children = null;
}
