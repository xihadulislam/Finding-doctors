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
public class EyeFragment extends Fragment {


    public EyeFragment() {
        // Required empty public constructor
    }

    ListView listView;
    Intent intent;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_eye, container, false);
        listView = view.findViewById(R.id.list_eye);

        final String [] eye = getResources().getStringArray(R.array.Eye_Nose_Skin_dental);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getActivity(),R.layout.main_listview, R.id.textViewId, eye);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul30");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul31");
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul32");
                    startActivity(intent);
                }
                if (position == 3) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul33");
                    startActivity(intent);
                }

                if (position == 4) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul42");
                    startActivity(intent);
                }
                if (position == 5) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul43");
                    startActivity(intent);
                }
                if (position == 6) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul44");
                    startActivity(intent);
                }

            }
        });


        return  view;
    }

}
