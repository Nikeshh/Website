package com.amqtech.opensource.appintroexample;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.nikeshhbaskaran.academiccalendar.R;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class DefaultIntro extends AppIntro2 {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Month of", "January -- Janus's month" +
                "Janus is the Roman god of gates and doorways, depicted with two faces looking in opposite directions. His festival month is January." +
                "Januarius had 29 days, until Julius when it became 31 days long.", R.drawable.january, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "February -- month of Februa" +
                "Februarius had 28 days, until circa 450 BC when it had 23 or 24 days on some of every second year, until Julius when it had 29 days on every fourth year and 28 days otherwise.", R.drawable.february, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "March -- Mars' month" +
                "March was the original beginning of the year, and the time for the resumption of war." +
                "Mars is the Roman god of war. He is identified with the Greek god Ares.", R.drawable.march, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "Old English April(is)" +
                "Aprilis had 30 days, until Numa when it had 29 days, until Julius when it became 30 days long." +
                "Aphrodite is the Greek goddess of love and beauty. She is identified with the Roman goddess Venus.", R.drawable.april, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "May -- Maia's month" +
                "Maius has always had 31 days." +
                "Maia (meaning the great one) is the Italic goddess of spring, the daughter of Faunus, and wife of Vulcan.", R.drawable.may, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "June -- Juno's month" +
                "Junius had 30 days, until Numa when it had 29 days, until Julius when it became 30 days long.", R.drawable.june, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "July -- Julius Caesar's month" +
                "Quintilis (and later Julius) has always had 31 days." +
                "Julius Caesar reformed the Roman calendar (hence the Julian calendar) in 46 BC. In the process, he renamed this month after himself.", R.drawable.july, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "August -- Augustus Caesar's month" +
                "Sextilis had 30 days, until Numa when it had 29 days, until Julius when it became 31 days long.", R.drawable.august, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "September -- the seventh month" +
                "September had 30 days, until Numa when it had 29 days, until Julius when it became 30 days long.", R.drawable.september, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "October -- the eighth month" +
                "Latin october mensis eighth month" +
                "October has always had 31 days.", R.drawable.october, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "November -- the nineth month" +
                "Novembris had 30 days, until Numa when it had 29 days, until Julius when it became 30 days long.", R.drawable.november, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("Month of", "December -- the tenth month" +
                "December had 30 days, until Numa when it had 29 days, until Julius when it became 31 days long.", R.drawable.december, Color.parseColor("#1976D2")));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
