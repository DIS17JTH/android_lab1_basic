package se.ju.students.malu1798.lab_1_todo_app_1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
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

    public void pickOneButtonClicked(View view){
        System.out.print("Button Pick one clicked");
        Intent intent = new Intent(this, PickTodoActivity.class);
        intent.putExtra("button", 0);
        startActivity(intent);
    }

    public void deleteOneButtonClicked(View view){
        System.out.print("Button Delete One clicked");
        Intent intent = new Intent(this, PickTodoActivity.class);
        intent.putExtra("button", 1);
        startActivity(intent);
    }

}
