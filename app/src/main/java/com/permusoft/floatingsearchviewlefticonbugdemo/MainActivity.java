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

   boolean focusable = true;

   FloatingSearchView searchView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      searchView = (FloatingSearchView) findViewById(R.id.searchView);
   }

   public void toggle(View view) {
      focusable = !focusable;
      searchView.setSearchFocusable(focusable);
      ((Button)view).setText(focusable?"Disable":"Enable");
   }

}
