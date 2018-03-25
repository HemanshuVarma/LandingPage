package com.hemanshu.android.landingpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void knowMore(View view) {
        String url = "http://www.whatsapp.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void googlePlay(View view) {
        String url = "https://play.google.com/store/apps/details?id=com.whatsapp&hl=en";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void iosStore(View view) {
        String url = "https://itunes.apple.com/in/app/whatsapp-messenger/id310633997?mt=8";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void microoftStore(View view) {
        String url = "https://www.microsoft.com/en-in/store/p/whatsapp/9wzdncrdfwbs";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
