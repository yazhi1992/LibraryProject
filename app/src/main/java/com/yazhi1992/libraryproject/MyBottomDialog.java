package com.yazhi1992.libraryproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;

import com.yazhi1992.yazhilib.widget.Dialog.BaseBottomDialog;

/**
 * Created by zengyazhi on 17/5/16.
 */

public class MyBottomDialog extends BaseBottomDialog<MyBottomDialog> {
    private Context mContext;

    public MyBottomDialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public View onCreateView() {
        return LayoutInflater.from(mContext).inflate(R.layout.dialog, null, false);
    }

    @Override
    public void setBeforeShow() {

    }


}