package com.example.tes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AfterClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterclass);
        ImageView imageView = findViewById(R.id.imgviewers);
        TextView hp = findViewById(R.id.hp);
        TextView work = findViewById(R.id.work);
        TextView mail = findViewById(R.id.mail);
        TextView id = findViewById(R.id.id);

        String orang = "";
        Bundle b = getIntent().getExtras();
        if (b != null) {
            orang = b.getString("orang");

        }
        if (orang.equals("azi")) {
            imageView.setImageResource(R.drawable.pria1);
            hp.setText(R.string.no_Azi);
            work.setText(R.string.work_Azi);
            mail.setText(R.string.mail_Azi);
            id.setText(R.string.id_Azi);
        } else if (orang.equals("ozan")) {
            imageView.setImageResource(R.drawable.pria2);
            hp.setText(R.string.no_Ozan);
            work.setText(R.string.work_Ozan);
            mail.setText(R.string.mail_Ozan);
            id.setText(R.string.id_Ozan);

        } else if (orang.equals("jamal")) {
            imageView.setImageResource(R.drawable.pria3);
            hp.setText(R.string.no_Jamal);
            work.setText(R.string.work_Jamal);
            mail.setText(R.string.mail_Jamal);
            id.setText(R.string.id_Jamal);
        } else if (orang.equals("imam")) {
            imageView.setImageResource(R.drawable.pria4);
            hp.setText(R.string.no_Imam);
            work.setText(R.string.work_Imam);
            mail.setText(R.string.mail_Imam);
            id.setText(R.string.id_Imam);

        } else if (orang.equals("diki")) {
            imageView.setImageResource(R.drawable.pria6);
            hp.setText(R.string.no_Diki);
            work.setText(R.string.work_Diki);
            mail.setText(R.string.mail_Diki);
            id.setText(R.string.id_Diki);
        }else {
            imageView.setImageResource(R.drawable.naruto4);
            hp.setText("No telepon");
        }
    }
}