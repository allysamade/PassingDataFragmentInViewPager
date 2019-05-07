package com.geeksfarm.fragmentwithviewpager;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class statusFragment extends Fragment {

    TextView txtPesan;


    public statusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment = inflater.inflate(R.layout.fragment_status, container, false);
        txtPesan = (TextView) viewFragment.findViewById(R.id.txtMsg);
        return  viewFragment;
    }


    protected void displayReceivedData(String message)
    {
        txtPesan.setText("Data received: "+message);
    }

}
