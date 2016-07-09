package co.arsatech.nqueens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnGenetic);
        if (btn != null) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Main.this, GA.class));
                }
            });
        }
        btn = (Button) findViewById(R.id.btnBacktracking);
        if (btn != null) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Main.this, BT.class));
                }
            });
        }
    }

}
