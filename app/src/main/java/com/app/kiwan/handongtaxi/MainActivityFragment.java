package com.app.kiwan.handongtaxi;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //create layout
        LinearLayout root = new LinearLayout(getActivity());
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView responseData = new TextView(getActivity());
        root.addView(responseData);
//        ImageView imgView = new ImageView(getActivity());
//        Resources res = getResources();
//
//
//        //dynamically attach image resource into imageview.
//        String resourceName = "@drawable/img_" + mImageIndex;
//        int resourceID = res.getIdentifier(resourceName , "drawable", "com.handstudio.android.smartrecipecooktop");
//        imgView.setImageResource(resourceID);




//        //set layout with params
//        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT );
//        root.addView(imgView, param);



        return root;

        //return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public static MainActivityFragment newInstance() {
        MainActivityFragment fragment = new MainActivityFragment();
        Bundle args = new Bundle();
        //args.putInt("imageIndex", imageIndex);
        //fragment.setArguments(args);
        return fragment;
    }
}
