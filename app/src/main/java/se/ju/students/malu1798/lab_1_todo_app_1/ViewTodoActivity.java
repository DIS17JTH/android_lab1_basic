package se.ju.students.malu1798.lab_1_todo_app_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewTodoActivity extends AppCompatActivity {
    public static final String EXTRA_TODO_INDEX = "todoIndex";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_todo);
        Intent intent = getIntent();
        String s = intent.getStringExtra("test");
        int i = intent.getIntExtra("todoIndex", 0);
        System.out.println("------------------------ " + s);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(Data.todos.get(i).title);
    }
}
