package com.example.xihad.findingdoctors;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Child_fragment extends Fragment {

    Intent intent;

    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_child_fragment, container, false);


       listView = view.findViewById(R.id.list_child);

        final String [] child = getResources().getStringArray(R.array.child);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity() , R.layout.main_listview,R.id.textViewId,child);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul28");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul29");
                    startActivity(intent);
                }

            }
        });

        return  view;
    }

}
