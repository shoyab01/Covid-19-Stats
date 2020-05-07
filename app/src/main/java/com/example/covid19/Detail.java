package com.example.covid19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {

    private int positionCountry;
    TextView country, cases, todayCases, deaths, todayDeaths, recovered, active, critical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of " + AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        country = (TextView) findViewById(R.id.country);
        cases = (TextView) findViewById(R.id.cases);
        todayCases = (TextView) findViewById(R.id.today_cases);
        deaths = (TextView) findViewById(R.id.deaths);
        todayDeaths = (TextView) findViewById(R.id.today_deaths);
        recovered = (TextView) findViewById(R.id.recovered);
        active = (TextView) findViewById(R.id.active);
        critical = (TextView) findViewById(R.id.critical);

        country.setText(AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        cases.setText(AffectedCountries.countryModelsList.get(positionCountry).getCases());
        todayCases.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayCases());
        deaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getDeaths());
        todayDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayDeaths());
        recovered.setText(AffectedCountries.countryModelsList.get(positionCountry).getRecovered());
        active.setText(AffectedCountries.countryModelsList.get(positionCountry).getActive());
        critical.setText(AffectedCountries.countryModelsList.get(positionCountry).getCritical());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
