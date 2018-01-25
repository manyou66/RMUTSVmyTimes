package wanpracha.rmutsv.ac.th.rmutsvmytimes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wanpracha.rmutsv.ac.th.rmutsvmytimes.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Keep status app
        setContentView(R.layout.activity_main);

//        Add Fragment of Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();


        }


    }//Main Method



}//Main Class
