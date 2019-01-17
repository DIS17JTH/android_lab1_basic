package se.ju.students.malu1798.lab_1_todo_app_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PickTodoActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_todo);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<Data.Todo>(
            this,
            android.R.layout.simple_list_item_1,
            Data.todos
        ));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intentIN = getIntent();
                int i = intentIN.getIntExtra("button", 0);

                if(i == 0) {
                    Intent intent = new Intent(PickTodoActivity.this, ViewTodoActivity.class);
                    intent.putExtra("todoIndex", position);
                    intent.putExtra("test", "This is a test");
                    System.out.println("!!!!!!!!!!!!!!!!!!" + id);
                    startActivity(intent);

                    //Data.Todo clickedTodo = Data.todos.get(position);
                }else {
                    Intent intent = new Intent(PickTodoActivity.this, DeleteTodoActivity.class);
                    intent.putExtra("todoIndex", position);
                    intent.putExtra("test", "This is a test");
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
