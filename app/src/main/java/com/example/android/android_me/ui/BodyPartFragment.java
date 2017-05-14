package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

/**
 * Created by mintra on 5/14/17.
 */

public class BodyPartFragment extends Fragment{

    private List<Integer> mImageIds;
    private int mListIndex;

    public BodyPartFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part);
//        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));


        if(mImageIds != null) {
            imageView.setImageResource(this.mImageIds.get(mListIndex));
        }else {
            Log.e("TAG", "Error no image ----------------");
        }
        return rootView;
    }

    public void setImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }
}
