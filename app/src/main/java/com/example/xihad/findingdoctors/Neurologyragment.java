package com.example.xihad.findingdoctors;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Neurologyragment extends Fragment {


    public Neurologyragment() {
        // Required empty public constructor
    }

    ListView listView;
    Intent intent;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_neurologyragment, container, false);
        listView = view.findViewById(R.id.list_neurology);

        final String [] neurology = getResources().getStringArray(R.array.Neurology_Pysychism);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getActivity(),R.layout.main_listview, R.id.textViewId, neurology);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul36");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul37");
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul38");
                    startActivity(intent);
                }

                if (position == 3) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul45");
                    startActivity(intent);
                }
                if (position == 4) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul46");
                    startActivity(intent);
                }
                if (position == 5) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul47");
                    startActivity(intent);
                }
                if (position == 6) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul48");
                    startActivity(intent);
                }

            }
        });

        return view;
    }

}
