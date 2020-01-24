package com.example.mvpsample.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvpsample.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    MainContract.Presenter presenter;
    TextView nameTextView;
    TextView emailTextView;
    EditText nameEditText;
    EditText emailEditText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        presenter = new MainPresenter(this, getApplicationContext());
    }

    @Override
    public void sendInputs() {
        presenter.validateInputs(nameEditText.getText().toString(), emailEditText.getText().toString());
    }

    @Override
    public void showNameAndEmail(String name, String email) {
        nameTextView.setText(name);
        emailTextView.setText(email);
    }

    @Override
    public void initViews() {
        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        nameEditText = findViewById(R.id.nameEditText);
        emailTextView = findViewById(R.id.emailTextView);
        sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInputs();
            }
        });
    }
}
