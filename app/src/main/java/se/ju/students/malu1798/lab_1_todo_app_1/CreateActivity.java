package se.ju.students.malu1798.lab_1_todo_app_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void createButtonClickedInCreateActivity(View view){
        System.out.println("Button2 clicked");
        EditText editText = (EditText) findViewById(R.id.editText);
        System.out.println(editText);
        String enteredTitle = editText.getText().toString();
        Data.todos.add(new Data.Todo(enteredTitle));
        System.out.println("Data: " + Data.todos.size());
        finish();
    }
}
