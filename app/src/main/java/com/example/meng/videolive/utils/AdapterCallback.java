package com.example.meng.videolive.utils;

import android.view.View;

/**
 * Created by Administrator on 2017/6/9 0009.
 */

public interface AdapterCallback {
    void onItemClick(View view, int position);
    void onItemLongClick(View view, int position);
    void onPositionChanged(int position);
}
