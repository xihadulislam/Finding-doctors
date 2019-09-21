package com.example.xihad.findingdoctors;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


import android.preference.PreferenceManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Category extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listView;

    private Intent intent;
    private  ArrayAdapter<String> arrayAdapter;

    private AlertDialog.Builder alerDailogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("All Doctors In One");

        setContentView(R.layout.activity_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //for ListView
        listView = findViewById(R.id.listviewid);
        final String[] doctors_name = getResources().getStringArray(R.array.doctors_name);
         arrayAdapter = new ArrayAdapter<String>(Category.this, R.layout.main_listview, R.id.textViewId, doctors_name);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String val = doctors_name[position];

                if (position == 0) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul");
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul1");
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul2");
                    startActivity(intent);
                }
                if (position == 3) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul3");
                    startActivity(intent);
                }

                if (position == 4) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul4");
                    startActivity(intent);
                }
                if (position == 5) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul5");
                    startActivity(intent);
                }
                if (position == 6) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul6");
                    startActivity(intent);
                }

                if (position == 7) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul7");
                    startActivity(intent);
                }

                if (position == 8) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul8");
                    startActivity(intent);
                }
                if (position == 9) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul9");
                    startActivity(intent);
                }
                if (position == 10) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul10");
                    startActivity(intent);
                }

                if (position == 11) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul11");
                    startActivity(intent);
                }

                if (position == 12) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul12");
                    startActivity(intent);
                }

                if (position == 13) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul13");
                    startActivity(intent);
                }

                if (position == 14) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul14");
                    startActivity(intent);
                }
                if (position == 15) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul15");
                    startActivity(intent);
                }
                if (position == 16) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul16");
                    startActivity(intent);
                }
                if (position == 17) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul17");
                    startActivity(intent);
                }
                if (position == 18) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul18");
                    startActivity(intent);
                }
                if (position == 19) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul19");
                    startActivity(intent);
                }
                if (position == 20) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul20");
                    startActivity(intent);
                }
                if (position == 21) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul21");
                    startActivity(intent);
                }
                if (position == 22) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul22");
                    startActivity(intent);
                }
                if (position == 23) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul23");
                    startActivity(intent);
                }
                if (position == 24) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul24");
                    startActivity(intent);
                }
                if (position == 25) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul25");
                    startActivity(intent);
                }
                if (position == 26) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul26");
                    startActivity(intent);
                }
                if (position == 27) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul27");
                    startActivity(intent);
                }
                if (position == 28) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul28");
                    startActivity(intent);
                }
                if (position == 29) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul29");
                    startActivity(intent);
                }
                if (position == 30) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul30");
                    startActivity(intent);
                }
                if (position == 31) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul31");
                    startActivity(intent);
                }
                if (position == 32) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul32");
                    startActivity(intent);
                }
                if (position == 33) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul33");
                    startActivity(intent);
                }
                if (position == 34) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul34");
                    startActivity(intent);
                }
                if (position == 35) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul35");
                    startActivity(intent);
                }
                if (position == 36) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul36");
                    startActivity(intent);
                }
                if (position == 37) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul37");
                    startActivity(intent);
                }
                if (position == 38) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul38");
                    startActivity(intent);
                }
                if (position == 39) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul39");
                    startActivity(intent);
                }
                if (position == 40) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul40");
                    startActivity(intent);
                }
                if (position == 41) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul41");
                    startActivity(intent);
                }
                if (position == 42) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul42");
                    startActivity(intent);
                }
                if (position == 43) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul43");
                    startActivity(intent);
                }
                if (position == 44) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul44");
                    startActivity(intent);
                }
                if (position == 45) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul45");
                    startActivity(intent);
                }
                if (position == 46) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul46");
                    startActivity(intent);
                }
                if (position == 47) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul47");
                    startActivity(intent);
                }
                if (position == 48) {
                    intent = new Intent(Category.this, Doctors_information.class);
                    intent.putExtra("name", "abul48");
                    startActivity(intent);
                }


            }
        });


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }






    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_arthertic) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new ArtherticFragment());
            ft.commit();
            getSupportActionBar().setTitle("Arthritis");

        } else if (id == R.id.nav_eye) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new EyeFragment());
            ft.commit();
            getSupportActionBar().setTitle("Eye,Nose,Skin and Dental");

        } else if (id == R.id.nav_kidney) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new KidneyFragment());
            ft.commit();
            getSupportActionBar().setTitle("Kidney and Liver Specialist");


        } else if (id == R.id.nav_Neurology) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new Neurologyragment());
            ft.commit();
            getSupportActionBar().setTitle("Neurologist");

        }else if (id == R.id.nav_child) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new Child_fragment());
            ft.commit();
            getSupportActionBar().setTitle("child medicine specialist");


        }else if (id == R.id.nav_Cardiology) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new CardologyFragment());
            ft.commit();
            getSupportActionBar().setTitle("Cardiologist");

        }else if (id == R.id.nav_Burn) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.replaceLayout,new BurnFragment());
            ft.commit();
            getSupportActionBar().setTitle("Burn and Plastic-Surgery");

        }



        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.category,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.searchId){

            SearchView searchView = (SearchView) item.getActionView();

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String s) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    arrayAdapter.getFilter().filter(s);
                    return true;
                }
            });

        }
        else  if (item.getItemId()==R.id.action_exit){


            alerDailogBuilder = new AlertDialog.Builder(Category.this);

            alerDailogBuilder.setTitle("Do You Want to Exit");

            alerDailogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                   finish();
                }
            });

            alerDailogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            AlertDialog alertDialog = alerDailogBuilder.create();
            alertDialog.show();
        }
        else if (item.getItemId()== R.id.action_about){

            alerDailogBuilder = new AlertDialog.Builder(Category.this);

            alerDailogBuilder.setMessage("This App is develope by " + "\n" +
                    "xihad islam"
                    +"\n"+
                    "Dept of CSE"
                    +"\n"+
                    "Leading University"
                            +"\n"
                    + "Contact:"+"\n"
                    + "xihad.lu@gmail.com"
            );

            AlertDialog alertDialog = alerDailogBuilder.create();
            alertDialog.show();
        }

        return super.onOptionsItemSelected(item);
    }
}

