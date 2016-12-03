/*
 * MainActivity.java
 *
 * Created by Gregory Kip (Permusoft Corporation) 12/3/2016.
 * Copyright (c) 2016 Permusoft Corporation. All Rights Reserved.
 */
package com.permusoft.floatingsearchviewlefticonbugdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.arlib.floatingsearchview.FloatingSearchView;

public class MainActivity extends AppCompatActivity {

   FloatingSearchView searchView;
   int mode = FloatingSearchView.LEFT_ACTION_MODE_SHOW_HAMBURGER;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      searchView = (FloatingSearchView) findViewById(R.id.searchView);
   }

   public void toggle(View view) {
      String text = "Show " + (mode == FloatingSearchView.LEFT_ACTION_MODE_SHOW_HAMBURGER ? "Hamburger" : "Home");
      ((Button)view).setText(text);
      mode = mode == FloatingSearchView.LEFT_ACTION_MODE_SHOW_HAMBURGER ? FloatingSearchView.LEFT_ACTION_MODE_SHOW_HOME : FloatingSearchView.LEFT_ACTION_MODE_SHOW_HAMBURGER;
      searchView.setLeftActionMode(mode);
   }

}
