package se.ju.students.malu1798.lab_1_todo_app_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createButtonClicked(View view){
        System.out.println("Button clicked");
        Intent intent = new Intent(this, CreateActivity.class);
        startActivity(intent);
    }
}
