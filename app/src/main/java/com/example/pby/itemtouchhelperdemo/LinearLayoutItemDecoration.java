package com.example.pby.itemtouchhelperdemo;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class LinearLayoutItemDecoration extends RecyclerView.ItemDecoration {

    private static final int DEFAULT_OFFSET = 10;


    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        final int adapterPosition = parent.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == parent.getAdapter().getItemCount() - 1) {
            outRect.set(0, 0, 0, 0);
        } else {
            outRect.set(0, 0, 0, DEFAULT_OFFSET);
        }
    }
}
