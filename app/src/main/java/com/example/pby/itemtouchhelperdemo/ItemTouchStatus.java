package com.example.pby.itemtouchhelperdemo;

public interface ItemTouchStatus {

    boolean onItemMove(int fromPosition, int toPosition);

    boolean onItemRemove(int position);
}
