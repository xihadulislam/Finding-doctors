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
public class ArtherticFragment extends Fragment {


    public ArtherticFragment() {
        // Required empty public constructor
    }

    ListView listView;
    Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_arthertic, container, false);

        listView = view.findViewById(R.id.list_arthertic);

        final String [] arthertic = getResources().getStringArray(R.array.Arthertic);
         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getActivity(),R.layout.main_listview, R.id.textViewId, arthertic);
          listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul1");
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul2");
                    startActivity(intent);
                }

            }
        });

        return view;
    }

}
