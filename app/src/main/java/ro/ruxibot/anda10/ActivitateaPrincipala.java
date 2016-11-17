package ro.ruxibot.anda10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitateaPrincipala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitatea_principala);
    }

    public void onClickButon(View view){
        Button btn = (Button)view;
        String textButon = btn.getText().toString();
        TextView textView = (TextView)findViewById(R.id.textdepus);
        switch (view.getId()){
            case R.id.Buton1:
                    textView.setText("Ati apasat" + textButon + " Ha,Ha,Ha");
                break;
            case R.id.Buton2:
                    textView.setText("Al doilea Hi Hi Hi"+textButon);
                break;
            case R.id.Buton3:
                    textView.setText("Al treilea Ho Ho Ho"+textButon);
                break;


        }

    }
}
