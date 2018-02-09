package com.tumblr.svandesigns.divinitysimplecrafting;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class SkillsFragment extends Fragment {
    ImageView fashionImg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skills, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        fashionImg = (ImageView) getView().findViewById(R.id.aerothurge);
        fashionImg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent mainIntent = new Intent(getActivity(), aeroactivity.class);
                startActivity(mainIntent);
            }
        });
    }
}


