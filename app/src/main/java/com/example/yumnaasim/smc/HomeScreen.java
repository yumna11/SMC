package com.example.yumnaasim.smc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class HomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        this.setTitle(R.string.home_screen);

        setContentView(R.layout.activity_home_screen);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0:
//                        about smc
                        Intent intentSmc = new Intent(HomeScreen.this,AboutSMC.class);
                        startActivity(intentSmc);
                        break;
                    case 1:
//                        commissioner
                        Intent intentMsg = new Intent(HomeScreen.this,Commisioner.class);
                        startActivity(intentMsg);
                        break;

                    case 2:
//                        amrut
                        Intent intentAmrut = new Intent(HomeScreen.this,IconsActivity.class);
                        intentAmrut.putExtra("url","http://smcsite.org/forApp/amrut.php");
                        intentAmrut.putExtra("icon name",getResources().getString(R.string.activity_amrut));
                        startActivity(intentAmrut);
                        break;

                    case 3:
//                        job opportunity
                        Intent intentJob = new Intent(HomeScreen.this,IconsActivity.class);
                        intentJob.putExtra("url","http://smcsite.org/forApp/applform.php");
                        intentJob.putExtra("icon name",getResources().getString(R.string.activity_job));
                        startActivity(intentJob);
                        break;
                    case 4:
//                        active tenders
                        Intent intentTenders = new Intent(HomeScreen.this,IconsActivity.class);
                        intentTenders.putExtra("url","http://smcsite.org/forApp/tenders.php");
                        intentTenders.putExtra("icon name",getResources().getString(R.string.activity_tenders));
                        startActivity(intentTenders);
                        break;
                    case 5:
//                        where can i
                        Intent intentWhere = new Intent(HomeScreen.this,IconsActivity.class);
                        intentWhere.putExtra("url","http://smcsite.org/forApp/helpLine.php");
                        intentWhere.putExtra("icon name",getResources().getString(R.string.activity_where_can_i));
                        startActivity(intentWhere);
                        break;
                    case 6:
//                        complaints
                        Intent intentComplaints = new Intent(HomeScreen.this,IconsActivity.class);
                        intentComplaints.putExtra("url","http://smcsite.org/forApp/citizenSubmit.php");
                        intentComplaints.putExtra("icon name",getResources().getString(R.string.activity_complaints));
                        startActivity(intentComplaints);
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast_msg),Toast.LENGTH_SHORT).show();
                        break;
                    case 18:
                        Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivity(intentCamera);
                        break;
                    case 19:
                    Intent intentLoc = new Intent(HomeScreen.this,IconsActivity.class);
                        intentLoc.putExtra("url","http://smcsite.org/forApp/myLocation.php");
                        intentLoc.putExtra("icon name",getResources().getString(R.string.activity_loc));
                    startActivity(intentLoc);
                    break;

                    default:
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast_msg),Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
