// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from primitive_list.djinni

package com.dropbox.djinni.test;

import java.util.ArrayList;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public class PrimitiveList implements android.os.Parcelable {


    /*package*/ final ArrayList<Long> mList;

    public PrimitiveList(
            @Nonnull ArrayList<Long> list) {
        this.mList = list;
    }

    @Nonnull
    public ArrayList<Long> getList() {
        return mList;
    }

    @Override
    public String toString() {
        return "PrimitiveList{" +
                "mList=" + mList +
        "}";
    }


    public static final android.os.Parcelable.Creator<PrimitiveList> CREATOR
        = new android.os.Parcelable.Creator<PrimitiveList>() {
        @Override
        public PrimitiveList createFromParcel(android.os.Parcel in) {
            return new PrimitiveList(in);
        }

        @Override
        public PrimitiveList[] newArray(int size) {
            return new PrimitiveList[size];
        }
    };

    public PrimitiveList(android.os.Parcel in) {
        this.mList = new ArrayList<Long>();
        in.readList(this.mList, getClass().getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {
        out.writeList(this.mList);
    }

}
