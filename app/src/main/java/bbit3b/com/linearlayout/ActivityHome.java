package bbit3b.com.linearlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        TextView firstname = (TextView) findViewById(R.id.first_view_name);
        TextView lastname = (TextView) findViewById(R.id.last_view_name);
        TextView email = (TextView) findViewById(R.id.email_view);
        TextView phone = (TextView) findViewById(R.id.phone_view);
        TextView password = (TextView) findViewById(R.id.pass_view);

        Intent intent = getIntent();
        String fname = intent.getStringExtra("firstname");
        String lname = intent.getStringExtra("lastname");
        String mail = intent.getStringExtra("email");
        String num = intent.getStringExtra("phone");
        String pass = intent.getStringExtra("password");

        firstname.setText(fname);
        lastname.setText(lname);
        email.setText(mail);
        phone.setText(num);
        password.setText(pass);

    }

}
