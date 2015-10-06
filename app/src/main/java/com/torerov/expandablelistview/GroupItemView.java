package com.torerov.expandablelistview;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2015-10-06.
 */
class GroupItemView extends FrameLayout {
    public GroupItemView(Context context) {
        super(context);
        init();
    }
    TextView nameView;
    private void init(){
        inflate(getContext(), R.layout.view_item_group,this);
        nameView = (TextView)findViewById(R.id.text_name);
    }

    public void setGroupItem(GroupItem item) {
        nameView.setText(item.groupName);
    }

    public void setIsExpand(boolean expand) {
        if (expand) {
            setBackgroundColor(Color.GREEN);
        } else {
            setBackgroundColor(Color.TRANSPARENT);
        }
    }

}
