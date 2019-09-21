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
public class KidneyFragment extends Fragment {


    ListView listView;
    Intent intent;

    public KidneyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kidney, container, false);

        listView = view.findViewById(R.id.list_kidney);

        final String [] kidney = getResources().getStringArray(R.array.kidney);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getActivity(),R.layout.main_listview, R.id.textViewId, kidney);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul34");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul35");
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul4");
                    startActivity(intent);
                }
                if (position == 3) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul5");
                    startActivity(intent);
                }
                if (position == 4) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul6");
                    startActivity(intent);
                }

                if (position == 5) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul7");
                    startActivity(intent);
                }

                if (position == 6) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul8");
                    startActivity(intent);
                }
                if (position == 7) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul9");
                    startActivity(intent);
                }

            }
        });

        return view;
    }

}
