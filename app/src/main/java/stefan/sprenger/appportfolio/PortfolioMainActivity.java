package stefan.sprenger.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyBtn = (Button) findViewById(R.id.button_spotify);
        assert spotifyBtn != null;
        spotifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launches Spotify App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        Button scoresBtn = (Button) findViewById(R.id.button_scores);
        assert scoresBtn != null;
        scoresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launches Scores App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });



        Button libraryBtn = (Button) findViewById(R.id.button_library);
        assert libraryBtn != null;
        libraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launches Library App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });



        Button buildBiggerBtn = (Button) findViewById(R.id.button_bigger);
        assert buildBiggerBtn != null;
        buildBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launches Bigger App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });



        Button readerBtn = (Button) findViewById(R.id.button_reader);
        assert readerBtn != null;
        readerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launches XYZ-Reader App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });



        Button capstoneBtn = (Button) findViewById(R.id.button_capstone);
        assert capstoneBtn != null;
        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launches Capstone App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
