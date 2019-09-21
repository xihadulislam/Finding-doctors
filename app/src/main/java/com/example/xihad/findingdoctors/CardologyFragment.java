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
public class CardologyFragment extends Fragment {


    public CardologyFragment() {
        // Required empty public constructor
    }

    ListView listView;
    Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_cardology, container, false);
       listView = view.findViewById(R.id.list_cardilogoy);

        final String [] cardilogy = getResources().getStringArray(R.array.Cardiology);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getActivity(),R.layout.main_listview, R.id.textViewId, cardilogy);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul15");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul16");
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul17");
                    startActivity(intent);
                }
                if (position == 3) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul18");
                    startActivity(intent);
                }
                if (position == 4) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul19");
                    startActivity(intent);
                }
                if (position == 5) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul20");
                    startActivity(intent);
                }
                if (position == 6) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul21");
                    startActivity(intent);
                }
                if (position == 7) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul22");
                    startActivity(intent);
                }
                if (position == 8) {
                    intent = new Intent(getActivity(), Doctors_information.class);
                    intent.putExtra("name", "abul23");
                    startActivity(intent);
                }
            }
        });



        return view;
    }

}
