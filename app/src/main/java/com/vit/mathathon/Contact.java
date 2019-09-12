package com.vit.mathathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageView img = (ImageView) findViewById(R.id.facebook);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/SIAMVIT/"));
                startActivity(intent);
            }
        });

        ImageView img1 = (ImageView) findViewById(R.id.gmail);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_SENDTO);
                intent1.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent1.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"siam@vit.ac.in"});
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
            }
        });
        ImageView img2 = (ImageView) findViewById(R.id.linkedin);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("https://www.linkedin.com/company/siam-vit/"));
                startActivity(intent2);
            }
        });
        ImageView img3 = (ImageView) findViewById(R.id.instagram);
        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent();
                intent3.setAction(Intent.ACTION_VIEW);
                intent3.addCategory(Intent.CATEGORY_BROWSABLE);
                intent3.setData(Uri.parse("https://www.instagram.com/siamvit/"));
                startActivity(intent3);
            }
        });

    }
}
