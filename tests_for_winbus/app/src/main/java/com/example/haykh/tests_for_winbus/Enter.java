package com.example.haykh.tests_for_winbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by haykh on 09.04.2017.
 */

public class Enter extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_enter);
    }

public void goto_map(View v){
    Intent intent = new Intent(this, Maps.class);
    startActivity(intent);
}

}
