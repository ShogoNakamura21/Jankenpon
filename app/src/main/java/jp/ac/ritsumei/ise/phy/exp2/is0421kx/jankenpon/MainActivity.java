package jp.ac.ritsumei.ise.phy.exp2.is0421kx.jankenpon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartButtonTapped(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
